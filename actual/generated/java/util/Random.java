// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.Serializable;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import runtime.LibSLRuntime;

@LibSLRuntime.InsteadOf("java.util.Random")
public final class Random implements LibSLRuntime.HasAutomaton, Serializable {
    private RandomAutomaton __$lsl_automaton = null;

    @LibSLRuntime.DirectCallOnly
    public Random(final RandomAutomaton a) {
        this.__$lsl_automaton = a;
    }

    public Random() {
        this(new RandomAutomaton());
        this.__$lsl_automaton.Random(this);
    }

    public Random(long arg0) {
        this(new RandomAutomaton());
        this.__$lsl_automaton.Random(this, arg0);
    }

    @Override
    public LibSLRuntime.Automaton __$lsl_getAutomaton() {
        return this.__$lsl_automaton;
    }

    public DoubleStream doubles() {
        return this.__$lsl_automaton.doubles(this);
    }

    public DoubleStream doubles(double arg0, double arg1) {
        return this.__$lsl_automaton.doubles(this, arg0, arg1);
    }

    public DoubleStream doubles(long arg0) {
        return this.__$lsl_automaton.doubles(this, arg0);
    }

    public DoubleStream doubles(long arg0, double arg1, double arg2) {
        return this.__$lsl_automaton.doubles(this, arg0, arg1, arg2);
    }

    public IntStream ints() {
        return this.__$lsl_automaton.ints(this);
    }

    public IntStream ints(int arg0, int arg1) {
        return this.__$lsl_automaton.ints(this, arg0, arg1);
    }

    public IntStream ints(long arg0) {
        return this.__$lsl_automaton.ints(this, arg0);
    }

    public IntStream ints(long arg0, int arg1, int arg2) {
        return this.__$lsl_automaton.ints(this, arg0, arg1, arg2);
    }

    public LongStream longs() {
        return this.__$lsl_automaton.longs(this);
    }

    public LongStream longs(long arg0) {
        return this.__$lsl_automaton.longs(this, arg0);
    }

    public LongStream longs(long arg0, long arg1) {
        return this.__$lsl_automaton.longs(this, arg0, arg1);
    }

    public LongStream longs(long arg0, long arg1, long arg2) {
        return this.__$lsl_automaton.longs(this, arg0, arg1, arg2);
    }

    public boolean nextBoolean() {
        return this.__$lsl_automaton.nextBoolean(this);
    }

    public void nextBytes(byte[] arg0) {
        this.__$lsl_automaton.nextBytes(this, arg0);
    }

    public double nextDouble() {
        return this.__$lsl_automaton.nextDouble(this);
    }

    public float nextFloat() {
        return this.__$lsl_automaton.nextFloat(this);
    }

    public synchronized double nextGaussian() {
        return this.__$lsl_automaton.nextGaussian(this);
    }

    public int nextInt() {
        return this.__$lsl_automaton.nextInt(this);
    }

    public int nextInt(int arg0) {
        return this.__$lsl_automaton.nextInt(this, arg0);
    }

    public long nextLong() {
        return this.__$lsl_automaton.nextLong(this);
    }

    public synchronized void setSeed(long arg0) {
        this.__$lsl_automaton.setSeed(this, arg0);
    }
}
