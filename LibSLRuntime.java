package ru.spbpu.usvm.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class LibSLRuntime {

    public interface HasAutomaton {
        Automaton __$lsl_getAutomaton();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InsteadOf {
        String value();
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

        return type.isInstance(((HasAutomaton) obj).__$lsl_getAutomaton());
    }

    public static boolean hasAutomaton(final Object obj) {
        return obj instanceof HasAutomaton;
    }

    public static void automatonStateCheckViolation() {
        throw new StateCheckException("Automaton state check violation detected");
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
}
