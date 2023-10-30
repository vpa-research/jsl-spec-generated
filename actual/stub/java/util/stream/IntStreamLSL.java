// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package stub.java.util.stream;

import java.lang.InternalError;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Void;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import runtime.LibSLRuntime;

public class IntStreamLSL implements LibSLRuntime.HasAutomaton, IntStream {
    private IntStreamLSL(Void a, Void b) {
        super();
    }

    public IntStream filter(IntPredicate predicate) {
        throw new InternalError();
    }

    public IntStream map(IntUnaryOperator mapper) {
        throw new InternalError();
    }

    public Stream mapToObj(IntFunction mapper) {
        throw new InternalError();
    }

    public LongStream mapToLong(IntToLongFunction mapper) {
        throw new InternalError();
    }

    public DoubleStream mapToDouble(IntToDoubleFunction mapper) {
        throw new InternalError();
    }

    public IntStream flatMap(IntFunction mapper) {
        throw new InternalError();
    }

    public IntStream sorted() {
        throw new InternalError();
    }

    public IntStream distinct() {
        throw new InternalError();
    }

    public IntStream peek(IntConsumer _action) {
        throw new InternalError();
    }

    public IntStream limit(long maxSize) {
        throw new InternalError();
    }

    public IntStream skip(long n) {
        throw new InternalError();
    }

    public void forEach(IntConsumer _action) {
        throw new InternalError();
    }

    public void forEachOrdered(IntConsumer _action) {
        throw new InternalError();
    }

    public int[] toArray() {
        throw new InternalError();
    }

    public int reduce(int identity, IntBinaryOperator accumulator) {
        throw new InternalError();
    }

    public OptionalInt reduce(IntBinaryOperator accumulator) {
        throw new InternalError();
    }

    public Object collect(Supplier supplier, ObjIntConsumer accumulator, BiConsumer combiner) {
        throw new InternalError();
    }

    public OptionalInt min() {
        throw new InternalError();
    }

    public OptionalInt max() {
        throw new InternalError();
    }

    public long count() {
        throw new InternalError();
    }

    public boolean anyMatch(IntPredicate predicate) {
        throw new InternalError();
    }

    public boolean allMatch(IntPredicate predicate) {
        throw new InternalError();
    }

    public boolean noneMatch(IntPredicate predicate) {
        throw new InternalError();
    }

    public OptionalInt findFirst() {
        throw new InternalError();
    }

    public OptionalInt findAny() {
        throw new InternalError();
    }

    public PrimitiveIterator.OfInt iterator() {
        throw new InternalError();
    }

    public Spliterator.OfInt spliterator() {
        throw new InternalError();
    }

    public boolean isParallel() {
        throw new InternalError();
    }

    public IntStream sequential() {
        throw new InternalError();
    }

    public IntStream parallel() {
        throw new InternalError();
    }

    public IntStream unordered() {
        throw new InternalError();
    }

    public IntStream onClose(Runnable closeHandler) {
        throw new InternalError();
    }

    public void close() {
        throw new InternalError();
    }

    public IntStream dropWhile(IntPredicate predicate) {
        throw new InternalError();
    }

    public IntStream takeWhile(IntPredicate predicate) {
        throw new InternalError();
    }

    public LongStream asLongStream() {
        throw new InternalError();
    }

    public DoubleStream asDoubleStream() {
        throw new InternalError();
    }

    public int sum() {
        throw new InternalError();
    }

    public OptionalDouble average() {
        throw new InternalError();
    }

    public IntSummaryStatistics summaryStatistics() {
        throw new InternalError();
    }

    public Stream boxed() {
        throw new InternalError();
    }
}
