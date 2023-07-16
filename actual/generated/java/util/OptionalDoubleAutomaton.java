// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import org.usvm.api.Engine;
import runtime.LibSLGlobals;
import runtime.LibSLRuntime;

public final class OptionalDoubleAutomaton implements LibSLRuntime.Automaton {
    public byte __$lsl_state = __$lsl_States.Allocated;

    private double value;

    private boolean present;

    @LibSLRuntime.AutomatonConstructor
    public OptionalDoubleAutomaton(final byte __$lsl_state, final double value,
            final boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.value = value;
        this.present = present;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalDoubleAutomaton() {
        this(__$lsl_States.Allocated, 0.0d, false);
    }

    public void OptionalDouble(OptionalDouble self) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void OptionalDouble(OptionalDouble self, double x) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public static void _throwNPE() {
        /* body */ {
            throw new java.lang.NullPointerException();
        }
    }

    public static OptionalDouble empty() {
        OptionalDouble result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = LibSLGlobals.EMPTY_OPTIONAL_DOUBLE;
        }
        // WARNING: no state transitions in static context
        return result;
    }

    public static OptionalDouble of(double x) {
        OptionalDouble result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalDouble(new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, x, true));
        }
        // WARNING: no state transitions in static context
        return result;
    }

    public boolean equals(OptionalDouble self, Object other) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == self) {
                result = true;
            } else {
                final boolean isSameType = Engine.isSameType(self, other);
                if (isSameType) {
                    final double otherValue = LibSLRuntime.getAutomatonFrom(other, OptionalDoubleAutomaton.class).value;
                    final boolean otherPresent = LibSLRuntime.getAutomatonFrom(other, OptionalDoubleAutomaton.class).present;
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

    public double getAsDouble(OptionalDouble self) {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    public int hashCode(OptionalDouble self) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                result = Engine.hashCode(this.value);
            } else {
                result = 0;
            }
        }
        return result;
    }

    public void ifPresent(OptionalDouble self, DoubleConsumer consumer) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            }
        }
    }

    public void ifPresentOrElse(OptionalDouble self, DoubleConsumer consumer,
            Runnable emptyAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            } else {
                if (emptyAction == null) {
                    throw new java.lang.NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    public boolean isEmpty(OptionalDouble self) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = !this.present;
        }
        return result;
    }

    public boolean isPresent(OptionalDouble self) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.present;
        }
        return result;
    }

    public double orElse(OptionalDouble self, double other) {
        double result = 0.0d;
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

    public double orElseGet(OptionalDouble self, DoubleSupplier supplier) {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new java.lang.NullPointerException();
            }
            if (this.present) {
                result = this.value;
            } else {
                result = supplier.getAsDouble();
            }
        }
        return result;
    }

    public double orElseThrow(OptionalDouble self) {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    public double orElseThrow(OptionalDouble self, Supplier exceptionSupplier) throws X {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (exceptionSupplier == null) {
                throw new java.lang.NullPointerException();
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

    public DoubleStream stream(OptionalDouble self) {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public String toString(OptionalDouble self) {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                final String valueStr = Engine.toString(this.value);
                result = "OptionalDouble[" + valueStr + "]";
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
}
