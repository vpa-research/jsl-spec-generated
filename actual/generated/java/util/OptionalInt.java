// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.util.NoSuchElementException;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * OptionalIntAutomaton for OptionalInt ~> java.util.OptionalInt
 */
@Approximate(java.util.OptionalInt.class)
public final class OptionalInt implements LibSLRuntime.Automaton {
    static {
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public int value;

    public boolean present;

    @LibSLRuntime.AutomatonConstructor
    public OptionalInt(Void __$lsl_token, final byte p0, final int p1, final boolean p2) {
        this.__$lsl_state = p0;
        this.value = p1;
        this.present = p2;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalInt(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0, false);
    }

    /**
     * [CONSTRUCTOR] OptionalIntAutomaton::OptionalInt(OptionalInt) -> OptionalInt
     */
    private OptionalInt() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] OptionalIntAutomaton::OptionalInt(OptionalInt, int) -> OptionalInt
     */
    private OptionalInt(int x) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::empty() -> OptionalInt
     */
    public static OptionalInt empty() {
        OptionalInt result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = LibSLGlobals.EMPTY_OPTIONAL_INT;
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::of(int) -> OptionalInt
     */
    public static OptionalInt of(int x) {
        OptionalInt result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalInt((Void) null, OptionalInt.__$lsl_States.Initialized, x, true);
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::equals(OptionalInt, Object) -> boolean
     */
    public boolean equals(Object other) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == this) {
                result = true;
            } else {
                final boolean isSameType = Engine.typeEquals(this, other);
                if (isSameType) {
                    final int otherValue = ((OptionalInt) other).value;
                    final boolean otherPresent = ((OptionalInt) other).present;
                    if (present && otherPresent) {
                        result = value == otherValue;
                    } else {
                        result = present == otherPresent;
                    }
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::getAsInt(OptionalInt) -> int
     */
    public int getAsInt() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!present) {
                throw new NoSuchElementException("No value present");
            }
            result = value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::hashCode(OptionalInt) -> int
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                result = LibSLRuntime.hashCode(value);
            } else {
                result = 0;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::ifPresent(OptionalInt, IntConsumer) -> void
     */
    public void ifPresent(IntConsumer consumer) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(value);
            }
        }
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::ifPresentOrElse(OptionalInt, IntConsumer, Runnable) -> void
     */
    public void ifPresentOrElse(IntConsumer consumer, Runnable emptyAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(value);
            } else {
                if (emptyAction == null) {
                    throw new NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::isEmpty(OptionalInt) -> boolean
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = !present;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::isPresent(OptionalInt) -> boolean
     */
    public boolean isPresent() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = present;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::orElse(OptionalInt, int) -> int
     */
    public int orElse(int other) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                result = value;
            } else {
                result = other;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::orElseGet(OptionalInt, IntSupplier) -> int
     */
    public int orElseGet(IntSupplier supplier) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (present) {
                result = value;
            } else {
                result = supplier.getAsInt();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::orElseThrow(OptionalInt) -> int
     */
    public int orElseThrow() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!present) {
                throw new NoSuchElementException("No value present");
            }
            result = value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::orElseThrow(OptionalInt, Supplier) -> int
     */
    public int orElseThrow(Supplier exceptionSupplier) throws java.lang.Throwable {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (exceptionSupplier == null) {
                throw new NullPointerException();
            }
            if (!present) {
                final Object exception = exceptionSupplier.get();
                throw ((Throwable) exception);
            } else {
                result = value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::stream(OptionalInt) -> IntStream
     */
    public IntStream stream() {
        IntStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(IntStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalIntAutomaton::toString(OptionalInt) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                final String valueStr = LibSLRuntime.toString(value);
                result = "OptionalInt[".concat(valueStr).concat("]");
            } else {
                result = "OptionalInt.empty";
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(OptionalInt.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
