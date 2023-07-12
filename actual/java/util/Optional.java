// Generated by the LibSL translator.  DO NOT EDIT!
// source: java/util/Optional.lsl
//
package actual.java.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import runtime.LibSLRuntime;

@LibSLRuntime.InsteadOf("java.util.Optional")
public final class Optional<T> implements LibSLRuntime.HasAutomaton {
    private OptionalAutomaton __$lsl_automaton = null;

    @LibSLRuntime.DirectCallOnly
    public Optional(final OptionalAutomaton a) {
        this.__$lsl_automaton = a;
    }

    private Optional() {
        this(new OptionalAutomaton());
        this.__$lsl_automaton.Optional(this);
    }

    private Optional(Object obj) {
        this(new OptionalAutomaton());
        this.__$lsl_automaton.Optional(this, obj);
    }

    @Override
    public LibSLRuntime.Automaton __$lsl_getAutomaton() {
        return this.__$lsl_automaton;
    }

    public static <T> Optional empty() {
        return OptionalAutomaton.empty();
    }

    public static <T> Optional of(Object obj) {
        return OptionalAutomaton.of(obj);
    }

    public static <T> Optional ofNullable(Object obj) {
        return OptionalAutomaton.ofNullable(obj);
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this.__$lsl_automaton.equals(this, other);
    }

    public Optional filter(Predicate<? super T> predicate) {
        return this.__$lsl_automaton.filter(this, predicate);
    }

    public <U> Optional flatMap(Function<? super T, ? extends Optional<? extends U>> mapper) {
        return this.__$lsl_automaton.flatMap(this, mapper);
    }

    public Object get() {
        return this.__$lsl_automaton.get(this);
    }

    @java.lang.Override
    public int hashCode() {
        return this.__$lsl_automaton.hashCode(this);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        this.__$lsl_automaton.ifPresent(this, consumer);
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable emptyAction) {
        this.__$lsl_automaton.ifPresentOrElse(this, consumer, emptyAction);
    }

    public boolean isEmpty() {
        return this.__$lsl_automaton.isEmpty(this);
    }

    public boolean isPresent() {
        return this.__$lsl_automaton.isPresent(this);
    }

    public <U> Optional map(Function<? super T, ? extends Optional<? extends U>> mapper) {
        return this.__$lsl_automaton.map(this, mapper);
    }

    public Optional or(Supplier<? extends Optional<? extends T>> supplier) {
        return this.__$lsl_automaton.or(this, supplier);
    }

    public Object orElse(Object other) {
        return this.__$lsl_automaton.orElse(this, other);
    }

    public Object orElseGet(Supplier<? extends Optional<? extends T>> supplier) {
        return this.__$lsl_automaton.orElseGet(this, supplier);
    }

    public Object orElseThrow() {
        return this.__$lsl_automaton.orElseThrow(this);
    }

    public <X extends java.lang.Throwable> Object orElseThrow(
            Supplier<? extends Optional<? extends T>> exceptionSupplier) throws X {
        return this.__$lsl_automaton.orElseThrow(this, exceptionSupplier);
    }

    public Stream<T> stream() {
        return this.__$lsl_automaton.stream(this);
    }

    @java.lang.Override
    public String toString() {
        return this.__$lsl_automaton.toString(this);
    }
}
