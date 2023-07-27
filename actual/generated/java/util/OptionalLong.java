// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import org.usvm.api.Engine;
import runtime.LibSLGlobals;
import runtime.LibSLRuntime;

public final class OptionalLong implements LibSLRuntime.Automaton {
    public byte __$lsl_state = __$lsl_States.Allocated;

    public long value;

    public boolean present;

    @LibSLRuntime.AutomatonConstructor
    public OptionalLong(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final long value, final boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.value = value;
        this.present = present;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalLong(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0L, false);
    }

    /**
     * [CONSTRUCTOR] OptionalLongAutomaton::OptionalLong(OptionalLong) -> OptionalLong
     */
    public OptionalLong() {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] OptionalLongAutomaton::OptionalLong(OptionalLong, long) -> OptionalLong
     */
    public OptionalLong(long x) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] OptionalLongAutomaton::_throwNPE() -> void
     */
    public static void _throwNPE() {
        /* body */ {
            throw new NullPointerException();
        }
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::empty() -> OptionalLong
     */
    public static OptionalLong empty() {
        OptionalLong result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = LibSLGlobals.EMPTY_OPTIONAL_LONG;
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::of(long) -> OptionalLong
     */
    public static OptionalLong of(long x) {
        OptionalLong result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalLong(new OptionalLong(OptionalLong.__$lsl_States.Initialized, x, true));
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::equals(OptionalLong, Object) -> boolean
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
                    final long otherValue = LibSLRuntime.getAutomatonFrom(other, OptionalLong.class).value;
                    final boolean otherPresent = LibSLRuntime.getAutomatonFrom(other, OptionalLong.class).present;
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
     * [FUNCTION] OptionalLongAutomaton::getAsLong(OptionalLong) -> long
     */
    public long getAsLong() {
        long result = 0L;
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
     * [FUNCTION] OptionalLongAutomaton::hashCode(OptionalLong) -> int
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
     * [FUNCTION] OptionalLongAutomaton::ifPresent(OptionalLong, LongConsumer) -> void
     */
    public void ifPresent(LongConsumer consumer) {
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
     * [FUNCTION] OptionalLongAutomaton::ifPresentOrElse(OptionalLong, LongConsumer, Runnable) -> void
     */
    public void ifPresentOrElse(LongConsumer consumer, Runnable emptyAction) {
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
     * [FUNCTION] OptionalLongAutomaton::isEmpty(OptionalLong) -> boolean
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
     * [FUNCTION] OptionalLongAutomaton::isPresent(OptionalLong) -> boolean
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
     * [FUNCTION] OptionalLongAutomaton::orElse(OptionalLong, long) -> long
     */
    public long orElse(long other) {
        long result = 0L;
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
     * [FUNCTION] OptionalLongAutomaton::orElseGet(OptionalLong, LongSupplier) -> long
     */
    public long orElseGet(LongSupplier supplier) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (present) {
                result = value;
            } else {
                result = supplier.getAsLong();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::orElseThrow(OptionalLong) -> long
     */
    public long orElseThrow() {
        long result = 0L;
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
     * [FUNCTION] OptionalLongAutomaton::orElseThrow(OptionalLong, Supplier) -> long
     */
    public long orElseThrow(Supplier exceptionSupplier) throws X {
        long result = 0L;
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
     * [FUNCTION] OptionalLongAutomaton::stream(OptionalLong) -> LongStream
     */
    public LongStream stream() {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::toString(OptionalLong) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                final String valueStr = LibSLRuntime.toString(value);
                result = "OptionalLong[" + valueStr + "]";
            } else {
                result = "OptionalLong.empty";
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }
}
