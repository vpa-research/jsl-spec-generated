// Generated by the LibSL translator.  DO NOT EDIT!
// source: java/util/OptionalDouble.lsl
//
package com.example.helloworld;

import ???.AutomatonConstructor;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import ru.spbpu.usvm.api.EngineInterfacing;
import ru.spbpu.usvm.api.LibSLHelpers;

public final class OptionalDoubleAutomaton {
    public __$lsl_States __$lsl_state = __$lsl_States.Allocated;

    private double value = 0.0d;

    private boolean present = false;

    @AutomatonConstructor
    public OptionalDoubleAutomaton(__$lsl_States __$lsl_state, double value, boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.value = value;
        this.present = present;
    }

    private OptionalDoubleAutomaton(OptionalDouble self) {
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        LibSLHelpers.error("Private constructor call");
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    private OptionalDoubleAutomaton(OptionalDouble self, double x) {
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        LibSLHelpers.error("Private constructor call");
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public static OptionalDouble _makeEmpty() {
        OptionalDouble result;
        result = new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, 0.0d, false);
        return result;
    }

    public static void _throwNPE() {
        throw new java.lang.NullPointerException();
    }

    public static OptionalDouble OptionalDouble.empty() {
        OptionalDouble result;
        // WARNING: no state checks in static context
        result = _makeEmpty();
        // WARNING: no state transitions in static context
        return result;
    }

    public static OptionalDouble OptionalDouble.of(double x) {
        OptionalDouble result;
        // WARNING: no state checks in static context
        result = new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, x, true);
        // WARNING: no state transitions in static context
        return result;
    }

    public boolean OptionalDouble.equals(OptionalDouble self, Object other) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (other == this) {
            result = true;
        } else {
            final boolean isSameType = EngineInterfacing.isSameType(this, other);
            if (isSameType) {
                final double otherValue = ((OptionalDoubleAutomaton) other).value;
                final boolean otherPresent = ((OptionalDoubleAutomaton) other).present;
                if (this.present && otherPresent) {
                    result = this.value == otherValue;
                } else {
                    result = this.present == otherPresent;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    public double OptionalDouble.getAsDouble(OptionalDouble self) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (!this.present) {
            throw new java.util.NoSuchElementException("No value present");
        }
        result = this.value;
        return result;
    }

    public int OptionalDouble.hashCode(OptionalDouble self) {
        int result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (this.present) {
            result = EngineInterfacing.hashCode(this.value);
        } else {
            result = 0;
        }
        return result;
    }

    public void OptionalDouble.ifPresent(OptionalDouble self, DoubleConsumer consumer) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (this.present) {
            if (consumer == null) {
                throw new java.lang.NullPointerException();
            }
            consumer.<TODO: call interface {DoubleConsumer => java.util.function::DoubleConsumer} with [1] items>;
        }
    }

    public void OptionalDouble.ifPresentOrElse(OptionalDouble self, DoubleConsumer consumer,
            Runnable emptyAction) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (this.present) {
            if (consumer == null) {
                throw new java.lang.NullPointerException();
            }
            consumer.<TODO: call interface {DoubleConsumer => java.util.function::DoubleConsumer} with [1] items>;
        } else {
            if (emptyAction == null) {
                throw new java.lang.NullPointerException();
            }
            emptyAction.<TODO: call interface {Runnable => java.lang::Runnable} with [0] items>;
        }
    }

    public boolean OptionalDouble.isEmpty(OptionalDouble self) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        result = !this.present;
        return result;
    }

    public boolean OptionalDouble.isPresent(OptionalDouble self) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        result = this.present;
        return result;
    }

    public double OptionalDouble.orElse(OptionalDouble self, double other) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (this.present) {
            result = this.value;
        } else {
            result = other;
        }
        return result;
    }

    public double OptionalDouble.orElseGet(OptionalDouble self, DoubleSupplier supplier) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (supplier == null) {
            throw new java.lang.NullPointerException();
        }
        if (this.present) {
            result = this.value;
        } else {
            result = supplier.<TODO: call interface {DoubleSupplier => java.util.function::DoubleSupplier} with [0] items>;
        }
        return result;
    }

    public double OptionalDouble.orElseThrow(OptionalDouble self) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (!this.present) {
            throw new java.util.NoSuchElementException("No value present");
        }
        result = this.value;
        return result;
    }

    public double OptionalDouble.orElseThrow(OptionalDouble self,
            Supplier<X extends java.lang.Throwable> exceptionSupplier) throws X {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (exceptionSupplier == null) {
            throw new java.lang.NullPointerException();
        }
        if (!this.present) {
            final Object exception = exceptionSupplier.<TODO: call interface {Supplier<~> => java.util.function::Supplier<~>} with [0] items>;
            throw ((Throwable) exception);
        } else {
            result = this.value;
        }
        return result;
    }

    public DoubleStream OptionalDouble.stream(OptionalDouble self) {
        DoubleStream result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        throw new RuntimeException("NOT_IMPLEMENTED");
        return result;
    }

    public String OptionalDouble.toString(OptionalDouble self) {
        String result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        if (this.present) {
            final String valueStr = EngineInterfacing.toString(this.value);
            result = "OptionalDouble[" + valueStr + "]";
        } else {
            result = "OptionalDouble.empty";
        }
        return result;
    }

    public enum __$lsl_States {
        Allocated,

        Initialized
    }
}
