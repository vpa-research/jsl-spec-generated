// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/OptionalLong.lsl:37
//  - java/util/OptionalLong.automata.lsl:29
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.NoSuchElementException;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * OptionalLongAutomaton for LSLOptionalLong ~> java.util.OptionalLong
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.util.OptionalLong.class)
public final class OptionalLong implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public long value;

    public boolean present;

    @LibSLRuntime.AutomatonConstructor
    public OptionalLong(Void __$lsl_token, final byte p0, final long p1, final boolean p2) {
        this.__$lsl_state = p0;
        this.value = p1;
        this.present = p2;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalLong(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0L, false);
    }

    /**
     * [CONSTRUCTOR] OptionalLongAutomaton::LSLOptionalLong(LSLOptionalLong) -> LSLOptionalLong
     */
    private OptionalLong() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] OptionalLongAutomaton::LSLOptionalLong(LSLOptionalLong, long) -> LSLOptionalLong
     */
    private OptionalLong(long x) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::empty() -> OptionalLong
     */
    public static java.util.OptionalLong empty() {
        java.util.OptionalLong result = null;
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
    public static java.util.OptionalLong of(long x) {
        java.util.OptionalLong result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = (java.util.OptionalLong) ((Object) new OptionalLong((Void) null, 
                /* state = */ OptionalLong.__$lsl_States.Initialized, 
                /* value = */ x, 
                /* present = */ true
            ));
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::equals(LSLOptionalLong, Object) -> boolean
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
                    final long otherValue = ((OptionalLong) ((Object) other)).value;
                    final boolean otherPresent = ((OptionalLong) ((Object) other)).present;
                    if (this.present && otherPresent) {
                        result = this.value == otherValue;
                    } else {
                        result = this.present == otherPresent;
                    }
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::getAsLong(LSLOptionalLong) -> long
     */
    public long getAsLong() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::hashCode(LSLOptionalLong) -> int
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                result = LibSLRuntime.hashCode(this.value);
            } else {
                result = 0;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::ifPresent(LSLOptionalLong, LongConsumer) -> void
     */
    public void ifPresent(LongConsumer consumer) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(this.value);
            }
        }
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::ifPresentOrElse(LSLOptionalLong, LongConsumer, Runnable) -> void
     */
    public void ifPresentOrElse(LongConsumer consumer, Runnable emptyAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(this.value);
            } else {
                if (emptyAction == null) {
                    throw new NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::isEmpty(LSLOptionalLong) -> boolean
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = !this.present;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::isPresent(LSLOptionalLong) -> boolean
     */
    public boolean isPresent() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.present;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::orElse(LSLOptionalLong, long) -> long
     */
    public long orElse(long other) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                result = this.value;
            } else {
                result = other;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::orElseGet(LSLOptionalLong, LongSupplier) -> long
     */
    public long orElseGet(LongSupplier supplier) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (this.present) {
                result = this.value;
            } else {
                result = supplier.getAsLong();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::orElseThrow(LSLOptionalLong) -> long
     */
    public long orElseThrow() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::orElseThrow(LSLOptionalLong, Supplier) -> long
     */
    public long orElseThrow(Supplier exceptionSupplier) throws java.lang.Throwable {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (exceptionSupplier == null) {
                throw new NullPointerException();
            }
            if (!this.present) {
                final Object exception = exceptionSupplier.get();
                throw ((Throwable) exception);
            } else {
                result = this.value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::stream(LSLOptionalLong) -> LongStream
     */
    public LongStream stream() {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(LongStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalLongAutomaton::toString(LSLOptionalLong) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                final String valueStr = LibSLRuntime.toString(this.value);
                result = "OptionalLong[".concat(valueStr).concat("]");
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

    @Approximate(OptionalLong.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
