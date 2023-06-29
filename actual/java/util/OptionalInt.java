// Generated by the LibSL translator.  DO NOT EDIT!
// source: java/util/OptionalInt.lsl
//
package actual.java.util;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import runtime.LibSLRuntime;

@LibSLRuntime.InsteadOf("java.util.OptionalInt")
public final class OptionalInt implements LibSLRuntime.HasAutomaton {
    private OptionalIntAutomaton __$lsl_automaton = null;

    @LibSLRuntime.DirectCallOnly
    public final OptionalInt(final OptionalIntAutomaton a) {
        this.__$lsl_automaton = a;
    }

    private OptionalInt() {
        this(new OptionalIntAutomaton());
        this.__$lsl_automaton.OptionalInt(this);
    }

    private OptionalInt(int x) {
        this(new OptionalIntAutomaton());
        this.__$lsl_automaton.OptionalInt(this, x);
    }

    @Override
    public LibSLRuntime.Automaton __$lsl_getAutomaton() {
        return this.__$lsl_automaton;
    }

    public static OptionalInt empty() {
        return OptionalIntAutomaton.empty();
    }

    public static OptionalInt of(int x) {
        return OptionalIntAutomaton.of(x);
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this.__$lsl_automaton.equals(this, other);
    }

    public int getAsInt() {
        return this.__$lsl_automaton.getAsInt(this);
    }

    @java.lang.Override
    public int hashCode() {
        return this.__$lsl_automaton.hashCode(this);
    }

    public void ifPresent(IntConsumer consumer) {
        this.__$lsl_automaton.ifPresent(this, consumer);
    }

    public void ifPresentOrElse(IntConsumer consumer, Runnable emptyAction) {
        this.__$lsl_automaton.ifPresentOrElse(this, consumer, emptyAction);
    }

    public boolean isEmpty() {
        return this.__$lsl_automaton.isEmpty(this);
    }

    public boolean isPresent() {
        return this.__$lsl_automaton.isPresent(this);
    }

    public int orElse(int other) {
        return this.__$lsl_automaton.orElse(this, other);
    }

    public int orElseGet(IntSupplier supplier) {
        return this.__$lsl_automaton.orElseGet(this, supplier);
    }

    public int orElseThrow() {
        return this.__$lsl_automaton.orElseThrow(this);
    }

    public <X extends java.lang.Throwable> int orElseThrow(Supplier<? extends X> exceptionSupplier)
            throws X {
        return this.__$lsl_automaton.orElseThrow(this, exceptionSupplier);
    }

    public IntStream stream() {
        return this.__$lsl_automaton.stream(this);
    }

    @java.lang.Override
    public String toString() {
        return this.__$lsl_automaton.toString(this);
    }
}
