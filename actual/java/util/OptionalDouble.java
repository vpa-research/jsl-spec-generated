// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package actual.java.util;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import runtime.LibSLRuntime;

@LibSLRuntime.InsteadOf("java.util.OptionalDouble")
public final class OptionalDouble implements LibSLRuntime.HasAutomaton {
    private OptionalDoubleAutomaton __$lsl_automaton = null;

    @LibSLRuntime.DirectCallOnly
    public final OptionalDouble(final OptionalDoubleAutomaton a) {
        this.__$lsl_automaton = a;
    }

    private OptionalDouble() {
        this(new OptionalDoubleAutomaton());
        this.__$lsl_automaton.OptionalDouble(this);
    }

    private OptionalDouble(double x) {
        this(new OptionalDoubleAutomaton());
        this.__$lsl_automaton.OptionalDouble(this, x);
    }

    @Override
    public LibSLRuntime.Automaton __$lsl_getAutomaton() {
        return this.__$lsl_automaton;
    }

    public static OptionalDouble empty() {
        return OptionalDoubleAutomaton.empty();
    }

    public static OptionalDouble of(double x) {
        return OptionalDoubleAutomaton.of(x);
    }

    @Override
    public boolean equals(Object other) {
        return this.__$lsl_automaton.equals(this, other);
    }

    public double getAsDouble() {
        return this.__$lsl_automaton.getAsDouble(this);
    }

    @Override
    public int hashCode() {
        return this.__$lsl_automaton.hashCode(this);
    }

    public void ifPresent(DoubleConsumer consumer) {
        this.__$lsl_automaton.ifPresent(this, consumer);
    }

    public void ifPresentOrElse(DoubleConsumer consumer, Runnable emptyAction) {
        this.__$lsl_automaton.ifPresentOrElse(this, consumer, emptyAction);
    }

    public boolean isEmpty() {
        return this.__$lsl_automaton.isEmpty(this);
    }

    public boolean isPresent() {
        return this.__$lsl_automaton.isPresent(this);
    }

    public double orElse(double other) {
        return this.__$lsl_automaton.orElse(this, other);
    }

    public double orElseGet(DoubleSupplier supplier) {
        return this.__$lsl_automaton.orElseGet(this, supplier);
    }

    public double orElseThrow() {
        return this.__$lsl_automaton.orElseThrow(this);
    }

    public double orElseThrow(Supplier exceptionSupplier) throws X {
        return this.__$lsl_automaton.orElseThrow(this, exceptionSupplier);
    }

    public DoubleStream stream() {
        return this.__$lsl_automaton.stream(this);
    }

    @Override
    public String toString() {
        return this.__$lsl_automaton.toString(this);
    }
}
