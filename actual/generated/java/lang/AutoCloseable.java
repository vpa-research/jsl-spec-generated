// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/lang/AutoCloseable.lsl:27
//  - java/lang/AutoCloseable.main.lsl:15
//
package generated.java.lang;

import java.lang.Class;
import java.lang.SuppressWarnings;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * AutoCloseableAutomaton for LSLAutoCloseable ~> java.lang.AutoCloseable
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.lang.AutoCloseable.class)
public interface AutoCloseable extends LibSLRuntime.Automaton {
    Class __$_lsl_INIT_INTERFACE_AutoCloseableAutomaton_d61c3b46 = Void.class;

    /**
     * [FUNCTION] AutoCloseableAutomaton::close(LSLAutoCloseable) -> void
     */
    default void close() {
        /* body */ {
        }
    }

    final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(AutoCloseable.class)
    final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
