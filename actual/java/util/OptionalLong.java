// Generated by the LibSL translator.  DO NOT EDIT!
// source: java/util/OptionalLong.lsl
//
package actual.java.util;

import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import runtime.LibSLRuntime;

@LibSLRuntime.InsteadOf("java.util.OptionalLong")
public final class OptionalLong implements LibSLRuntime.HasAutomaton {
    private OptionalLongAutomaton __$lsl_automaton = null;

    @LibSLRuntime.DirectCallOnly
    public final OptionalLong(final OptionalLongAutomaton a) {
        this.__$lsl_automaton = a;
    }

    private OptionalLong() {
        this(new OptionalLongAutomaton());
        this.__$lsl_automaton.OptionalLong(this);
    }

    private OptionalLong(long x) {
        this(new OptionalLongAutomaton());
        this.__$lsl_automaton.OptionalLong(this, x);
    }

    @Override
    public LibSLRuntime.Automaton __$lsl_getAutomaton() {
        return this.__$lsl_automaton;
    }

    public static OptionalLong empty() {
        return OptionalLongAutomaton.empty();
    }

    public static OptionalLong of(long x) {
        return OptionalLongAutomaton.of(x);
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this.__$lsl_automaton.equals(this, other);
    }

    public long getAsLong() {
        return this.__$lsl_automaton.getAsLong(this);
    }

    @java.lang.Override
    public int hashCode() {
        return this.__$lsl_automaton.hashCode(this);
    }

    public void ifPresent(LongConsumer consumer) {
        this.__$lsl_automaton.ifPresent(this, consumer);
    }

    public void ifPresentOrElse(LongConsumer consumer, Runnable emptyAction) {
        this.__$lsl_automaton.ifPresentOrElse(this, consumer, emptyAction);
    }

    public boolean isEmpty() {
        return this.__$lsl_automaton.isEmpty(this);
    }

    public boolean isPresent() {
        return this.__$lsl_automaton.isPresent(this);
    }

    public long orElse(long other) {
        return this.__$lsl_automaton.orElse(this, other);
    }

    public long orElseGet(LongSupplier supplier) {
        return this.__$lsl_automaton.orElseGet(this, supplier);
    }

    public long orElseThrow() {
        return this.__$lsl_automaton.orElseThrow(this);
    }

    public <X extends java.lang.Throwable> long orElseThrow(Supplier<? extends X> exceptionSupplier)
            throws X {
        return this.__$lsl_automaton.orElseThrow(this, exceptionSupplier);
    }

    public LongStream stream() {
        return this.__$lsl_automaton.stream(this);
    }

    @java.lang.Override
    public String toString() {
        return this.__$lsl_automaton.toString(this);
    }
}
