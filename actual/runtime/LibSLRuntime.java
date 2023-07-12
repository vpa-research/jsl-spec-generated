package runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.usvm.api.Engine;

public final class LibSLRuntime {

    public interface HasAutomaton {
        Automaton __$lsl_getAutomaton();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InsteadOf {
        String value();
    }

    @Target(ElementType.CONSTRUCTOR)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DirectCallOnly {
    }

    public interface Automaton {
    }

    @Target(ElementType.CONSTRUCTOR)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AutomatonConstructor {
    }

    public static abstract class LibSLException extends Error {
        private LibSLException(final String msg) {
            super(msg);
        }
    }

    public static final class StateCheckException extends LibSLException {
        private StateCheckException(final String msg) {
            super(msg);
        }
    }

    public static final class SemanticViolationException extends LibSLException {
        private SemanticViolationException(final String msg) {
            super(msg);
        }
    }

    public static final class IncompleteSpecificationException extends LibSLException {
        private IncompleteSpecificationException(final String msg) {
            // #question: can we pass class and method names here? (counterargument: string bloat)
            super(msg);
        }
    }

    public static boolean hasAutomaton(final Object obj, final Class<? extends Automaton> type) {
        if (!hasAutomaton(obj))
            return false;

        return type.isInstance(getAutomatonFrom(obj));
    }

    public static boolean hasAutomaton(final Object obj) {
        return obj instanceof HasAutomaton;
    }

    /**
     * <b> You have to be sure the automaton exists in the provided object!<b>
     */
    public static Automaton getAutomatonFrom(final Object obj) {
        Engine.assume(obj instanceof HasAutomaton);
        final HasAutomaton objWithAutomaton = ((HasAutomaton) obj);
        Engine.assume(objWithAutomaton != null);

        final Automaton automaton = objWithAutomaton.__$lsl_getAutomaton();
        Engine.assume(automaton != null);

        return automaton;
    }

    /**
     * <b> You have to be sure the automaton exists in the provided object!<b>
     */
    public static <T extends Automaton> T getAutomatonFrom(final Object obj, final Class<T> expectedAutomaton) {
        final Automaton automaton = getAutomaton(obj);
        Engine.assume(expectedAutomaton.isInstance(automaton));

        return expectedAutomaton.cast(automaton);
    }

    public static void error(final String msg) {
        throw new SemanticViolationException(msg);
    }

    public static void todo() {
        throw new IncompleteSpecificationException("TODO");
    }

    public static void not_implemented() {
        throw new IncompleteSpecificationException("NOT_IMPLEMENTED");
    }

    // TODO: remove helper function
    public static String toString(final Object obj) {
        return obj == null ? "null" : obj.toString();
    }
}
