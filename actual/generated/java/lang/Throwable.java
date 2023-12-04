// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/lang/Throwable.lsl:26
//  - java/lang/Throwable.main.lsl:20
//
package generated.java.lang;

import java.io.Serializable;
import java.lang.StackTraceElement;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * ThrowableAutomaton for LSLThrowable ~> java.lang.Throwable
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.lang.Throwable.class)
public class Throwable implements LibSLRuntime.Automaton, Serializable {
    private static final long serialVersionUID = -3042686055658047285L;

    private static final String NULL_CAUSE_MESSAGE = "Cannot suppress a null exception.";

    private static final String SELF_SUPPRESSION_MESSAGE = "Self-suppression not permitted";

    private static final String CAUSE_CAPTION = "Caused by: ";

    private static final String SUPPRESSED_CAPTION = "Suppressed: ";

    static {
        Engine.assume(true);
    }

    @LibSLRuntime.AutomatonConstructor
    public Throwable(Void __$lsl_token, final byte p0) {
    }

    @LibSLRuntime.AutomatonConstructor
    public Throwable(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized);
    }

    /**
     * [FUNCTION] ThrowableAutomaton::addSuppressed(LSLThrowable, Throwable) -> void
     * Source: java/lang/Throwable.main.lsl:100
     */
    public final synchronized void addSuppressed(java.lang.Throwable exception) {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] ThrowableAutomaton::fillInStackTrace(LSLThrowable) -> Throwable
     * Source: java/lang/Throwable.main.lsl:106
     */
    public synchronized java.lang.Throwable fillInStackTrace() {
        java.lang.Throwable result = null;
        /* body */ {
            result = Engine.makeSymbolic(java.lang.Throwable.class);
        }
        return result;
    }

    /**
     * [FUNCTION] ThrowableAutomaton::getStackTrace(LSLThrowable) -> array<StackTraceElement>
     * Source: java/lang/Throwable.main.lsl:133
     */
    public StackTraceElement[] getStackTrace() {
        StackTraceElement[] result = null;
        /* body */ {
            final int size = Engine.makeSymbolicInt();
            Engine.assume(size >= 0);
            Engine.assume(size < 99);
            result = Engine.makeSymbolicArray(StackTraceElement.class, size);
        }
        return result;
    }

    /**
     * [FUNCTION] ThrowableAutomaton::getSuppressed(LSLThrowable) -> array<Throwable>
     * Source: java/lang/Throwable.main.lsl:143
     */
    public final synchronized java.lang.Throwable[] getSuppressed() {
        java.lang.Throwable[] result = null;
        /* body */ {
            final int size = Engine.makeSymbolicInt();
            Engine.assume(size >= 0);
            Engine.assume(size < 99);
            result = Engine.makeSymbolicArray(java.lang.Throwable.class, size);
        }
        return result;
    }

    /**
     * [FUNCTION] ThrowableAutomaton::printStackTrace(LSLThrowable) -> void
     * Source: java/lang/Throwable.main.lsl:160
     */
    public void printStackTrace() {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] ThrowableAutomaton::setStackTrace(LSLThrowable, array<StackTraceElement>) -> void
     * Source: java/lang/Throwable.main.lsl:180
     */
    public void setStackTrace(StackTraceElement[] stackTrace) {
        /* body */ {
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(Throwable.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
