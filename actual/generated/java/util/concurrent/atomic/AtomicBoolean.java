// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/concurrent/atomic/AtomicBoolean.lsl:25
//  - java/util/concurrent/atomic/AtomicBoolean.main.lsl:16
//
package generated.java.util.concurrent.atomic;

import java.io.Serializable;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * AtomicBooleanAutomaton for LSLAtomicBoolean ~> java.util.concurrent.atomic.AtomicBoolean
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.util.concurrent.atomic.AtomicBoolean.class)
public class AtomicBoolean implements LibSLRuntime.Automaton, Serializable {
    private static final long serialVersionUID = 4654671469794556979L;

    private static final int FALSE = 0;

    private static final int TRUE = 1;

    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    private volatile int value;

    @LibSLRuntime.AutomatonConstructor
    public AtomicBoolean(Void __$lsl_token, final byte p0, final int p1) {
        this.__$lsl_state = p0;
        this.value = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public AtomicBoolean(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0);
    }

    /**
     * [CONSTRUCTOR] AtomicBooleanAutomaton::LSLAtomicBoolean(LSLAtomicBoolean) -> LSLAtomicBoolean
     */
    public AtomicBoolean() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.value = FALSE;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] AtomicBooleanAutomaton::LSLAtomicBoolean(LSLAtomicBoolean, boolean) -> LSLAtomicBoolean
     */
    public AtomicBoolean(boolean initialValue) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::compareAndExchange(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean compareAndExchange(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
            if (result == expectedValue) {
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::compareAndExchangeAcquire(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean compareAndExchangeAcquire(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
            if (result == expectedValue) {
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::compareAndExchangeRelease(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean compareAndExchangeRelease(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
            if (result == expectedValue) {
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::compareAndSet(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean compareAndSet(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::get(LSLAtomicBoolean) -> boolean
     */
    public final boolean get() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::getAcquire(LSLAtomicBoolean) -> boolean
     */
    public final boolean getAcquire() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::getAndSet(LSLAtomicBoolean, boolean) -> boolean
     */
    public final boolean getAndSet(boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::getOpaque(LSLAtomicBoolean) -> boolean
     */
    public final boolean getOpaque() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::getPlain(LSLAtomicBoolean) -> boolean
     */
    public final boolean getPlain() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != FALSE;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::lazySet(LSLAtomicBoolean, boolean) -> void
     */
    public final void lazySet(boolean newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::set(LSLAtomicBoolean, boolean) -> void
     */
    public final void set(boolean newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::setOpaque(LSLAtomicBoolean, boolean) -> void
     */
    public final void setOpaque(boolean newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::setPlain(LSLAtomicBoolean, boolean) -> void
     */
    public final void setPlain(boolean newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::setRelease(LSLAtomicBoolean, boolean) -> void
     */
    public final void setRelease(boolean newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (newValue) {
                this.value = TRUE;
            } else {
                this.value = FALSE;
            }
        }
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::toString(LSLAtomicBoolean) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value == FALSE) {
                result = "false";
            } else {
                result = "true";
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::weakCompareAndSet(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public boolean weakCompareAndSet(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::weakCompareAndSetAcquire(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean weakCompareAndSetAcquire(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::weakCompareAndSetPlain(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public boolean weakCompareAndSetPlain(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::weakCompareAndSetRelease(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean weakCompareAndSetRelease(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicBooleanAutomaton::weakCompareAndSetVolatile(LSLAtomicBoolean, boolean, boolean) -> boolean
     */
    public final boolean weakCompareAndSetVolatile(boolean expectedValue, boolean newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final boolean currentValue = this.value != FALSE;
            if (currentValue == expectedValue) {
                result = true;
                if (newValue) {
                    this.value = TRUE;
                } else {
                    this.value = FALSE;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(AtomicBoolean.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
