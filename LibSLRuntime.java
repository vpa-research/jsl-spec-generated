package ???;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class LibSLRuntime {

    public interface Automaton {
    }

    public interface HasAutomaton {
        Automaton __$getAutomaton();
    }

    @Target(ElementType.CONSTRUCTOR)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AutomatonConstructor {
    }

    public static final class StateCheckException extends RuntimeException {
        private StateCheckException(final String msg) {
            super(msg);
        }
    }

    public static boolean hasAutomaton(final Object obj, final Class<?> type) {
        return type.isInstance(obj);
    }

    public static void automatonStateCheckViolation() {
        throw new StateCheckException("Automaton state check violation detected");
    }
}
