// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.util.NoSuchElementException;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * OptionalDoubleAutomaton for OptionalDouble ~> java.util.OptionalDouble
 */
@Approximate(java.util.OptionalDouble.class)
public final class OptionalDouble implements LibSLRuntime.Automaton {
    static {
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public double value;

    public boolean present;

    @LibSLRuntime.AutomatonConstructor
    public OptionalDouble(Void __$lsl_token, final byte p0, final double p1, final boolean p2) {
        this.__$lsl_state = p0;
        this.value = p1;
        this.present = p2;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalDouble(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0.0d, false);
    }

    /**
     * [CONSTRUCTOR] OptionalDoubleAutomaton::OptionalDouble(OptionalDouble) -> OptionalDouble
     */
    private OptionalDouble() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] OptionalDoubleAutomaton::OptionalDouble(OptionalDouble, double) -> OptionalDouble
     */
    private OptionalDouble(double x) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* this method can be called using reflection only */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] OptionalDoubleAutomaton::empty() -> OptionalDouble
     */
    public static OptionalDouble empty() {
        OptionalDouble result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = LibSLGlobals.EMPTY_OPTIONAL_DOUBLE;
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalDoubleAutomaton::of(double) -> OptionalDouble
     */
    public static OptionalDouble of(double x) {
        OptionalDouble result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalDouble((Void) null, 
            /* state = */ OptionalDouble.__$lsl_States.Initialized, 
            /* value = */ x, 
            /* present = */ true);
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalDoubleAutomaton::equals(OptionalDouble, Object) -> boolean
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
                    final double otherValue = ((OptionalDouble) other).value;
                    final boolean otherPresent = ((OptionalDouble) other).present;
                    if (present && otherPresent) {
                        result = LibSLRuntime.equals(value, otherValue);
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
     * [FUNCTION] OptionalDoubleAutomaton::getAsDouble(OptionalDouble) -> double
     */
    public double getAsDouble() {
        double result = 0.0d;
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
     * [FUNCTION] OptionalDoubleAutomaton::hashCode(OptionalDouble) -> int
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
     * [FUNCTION] OptionalDoubleAutomaton::ifPresent(OptionalDouble, DoubleConsumer) -> void
     */
    public void ifPresent(DoubleConsumer consumer) {
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
     * [FUNCTION] OptionalDoubleAutomaton::ifPresentOrElse(OptionalDouble, DoubleConsumer, Runnable) -> void
     */
    public void ifPresentOrElse(DoubleConsumer consumer, Runnable emptyAction) {
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
     * [FUNCTION] OptionalDoubleAutomaton::isEmpty(OptionalDouble) -> boolean
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
     * [FUNCTION] OptionalDoubleAutomaton::isPresent(OptionalDouble) -> boolean
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
     * [FUNCTION] OptionalDoubleAutomaton::orElse(OptionalDouble, double) -> double
     */
    public double orElse(double other) {
        double result = 0.0d;
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
     * [FUNCTION] OptionalDoubleAutomaton::orElseGet(OptionalDouble, DoubleSupplier) -> double
     */
    public double orElseGet(DoubleSupplier supplier) {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (present) {
                result = value;
            } else {
                result = supplier.getAsDouble();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalDoubleAutomaton::orElseThrow(OptionalDouble) -> double
     */
    public double orElseThrow() {
        double result = 0.0d;
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
     * [FUNCTION] OptionalDoubleAutomaton::orElseThrow(OptionalDouble, Supplier) -> double
     */
    public double orElseThrow(Supplier exceptionSupplier) throws java.lang.Throwable {
        double result = 0.0d;
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
     * [FUNCTION] OptionalDoubleAutomaton::stream(OptionalDouble) -> DoubleStream
     */
    public DoubleStream stream() {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(DoubleStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalDoubleAutomaton::toString(OptionalDouble) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (present) {
                final String valueStr = LibSLRuntime.toString(value);
                result = "OptionalDouble[".concat(valueStr).concat("]");
            } else {
                result = "OptionalDouble.empty";
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(OptionalDouble.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
