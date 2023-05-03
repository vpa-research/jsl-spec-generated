// Generated by the LibSL translator.  DO NOT EDIT!
// source: java/util/OptionalDouble.lsl
//
package com.example.helloworld;

import ???.AutomatonConstructor;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public final class OptionalDouble {
    public __$lsl_States __$lsl_state = __$lsl_States.Allocated;

    public Object __$lsl_parent = null;

    private double value = 0d;

    private boolean present = false;

    private OptionalDouble() {
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        {
            ru.spbpu.usvm.api.LibSLHelpers.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    private OptionalDouble(double x) {
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        {
            ru.spbpu.usvm.api.LibSLHelpers.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    @AutomatonConstructor
    public OptionalDouble(__$lsl_States __$lsl_state, Object __$lsl_parent, double value,
            boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.__$lsl_parent = __$lsl_parent;
        this.value = value;
        this.present = present;
    }

    public static OptionalDouble _makeEmpty() {
        OptionalDouble result;
        {
            result = new com.example.helloworld.OptionalDouble(
                    com.example.helloworld.OptionalDouble.__$lsl_States.Initialized,
                    null,
                    0d,
                    false);
        }
        return result;
    }

    public void _throwNPE() {
        {
            throw new java.lang.NullPointerException();
        }
    }

    public static OptionalDouble empty() {
        OptionalDouble result;
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        {
            result = _makeEmpty();
        }
        this.__$lsl_state = __$lsl_States.Initialized;
        return result;
    }

    public static OptionalDouble of(double x) {
        OptionalDouble result;
        if (this.__$lsl_state != __$lsl_States.Allocated) {
            throw new java.lang.RuntimeException();
        }
        {
            result = new com.example.helloworld.OptionalDouble(
                    com.example.helloworld.OptionalDouble.__$lsl_States.Initialized,
                    null,
                    x,
                    true);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
        return result;
    }

    public boolean equals(Object other) {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (other == this) result = true;
            else {
                final boolean isSameType = ru.spbpu.usvm.api.EngineInterfacing.usvmIsSameType(this, other);
                if (isSameType) {
                    final double otherValue = ((OptionalDouble) other).value;
                    final boolean otherPresent = ((OptionalDouble) other).present;
                    if (this.present && otherPresent) result = this.value == otherValue;
                    else result = this.present == otherPresent;
                }
                else result = false;
            }
        }
        return result;
    }

    public double getAsDouble() {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (!this.present) throw new java.util.NoSuchElementException("No value present");
            result = this.value;
        }
        return result;
    }

    public int hashCode() {
        int result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (this.present) result = ru.spbpu.usvm.api.EngineInterfacing.usvmHashCode(this.value);
            else result = 0;
        }
        return result;
    }

    public void ifPresent(DoubleConsumer consumer) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (this.present) {
                if (consumer == null) throw new java.lang.NullPointerException();
                consumer.<TODO: call interface {DoubleConsumer => java.util.function::DoubleConsumer} with [1] items>;
            }
        }
    }

    public void ifPresentOrElse(DoubleConsumer consumer, Runnable emptyAction) {
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (this.present) {
                if (consumer == null) throw new java.lang.NullPointerException();
                consumer.<TODO: call interface {DoubleConsumer => java.util.function::DoubleConsumer} with [1] items>;
            }
            else {
                if (emptyAction == null) throw new java.lang.NullPointerException();
                emptyAction.<TODO: call interface {Runnable => java.lang::Runnable} with [0] items>;
            }
        }
    }

    public boolean isEmpty() {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            result = !this.present;
        }
        return result;
    }

    public boolean isPresent() {
        boolean result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            result = this.present;
        }
        return result;
    }

    public double orElse(double other) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (this.present) result = this.value;
            else result = other;
        }
        return result;
    }

    public double orElseGet(DoubleSupplier supplier) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (supplier == null) throw new java.lang.NullPointerException();
            if (this.present) result = this.value;
            else result = supplier.<TODO: call interface {DoubleSupplier => java.util.function::DoubleSupplier} with [0] items>;
        }
        return result;
    }

    public double orElseThrow() {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (!this.present) throw new java.util.NoSuchElementException("No value present");
            result = this.value;
        }
        return result;
    }

    public <X extends java.lang.Throwable> double orElseThrow(
            Supplier<X extends java.lang.Throwable> exceptionSupplier) {
        double result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (exceptionSupplier == null) throw new java.lang.NullPointerException();
            if (!this.present) {
                final Object exception = exceptionSupplier.<TODO: call interface {Supplier<~> => java.util.function::Supplier<~>} with [0] items>;
                throw ((Throwable) exception);
            }
            else result = this.value;
        }
        return result;
    }

    public DoubleStream stream() {
        DoubleStream result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            throw new java.lang.RuntimeException("NOT_IMPLEMENTED");
        }
        return result;
    }

    public String toString() {
        String result;
        if (this.__$lsl_state != __$lsl_States.Initialized) {
            throw new java.lang.RuntimeException();
        }
        {
            if (this.present) {
                final String valueStr = ru.spbpu.usvm.api.EngineInterfacing.usvmToString(this.value);
                result = "OptionalDouble[" + valueStr + "]";
            }
            else result = "OptionalDouble.empty";
        }
        return result;
    }

    public enum __$lsl_States {
        Allocated,

        Initialized
    }
}
