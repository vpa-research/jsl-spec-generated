// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.Serializable;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

@Approximate(java.util.Random.class)
public class Random implements LibSLRuntime.Automaton, Serializable {
    public byte __$lsl_state = __$lsl_States.Allocated;

    @LibSLRuntime.AutomatonConstructor
    public Random(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state) {
        this.__$lsl_state = __$lsl_state;
    }

    @LibSLRuntime.AutomatonConstructor
    public Random(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated);
    }

    /**
     * [CONSTRUCTOR] RandomAutomaton::Random(Random) -> Random
     */
    public Random() {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] RandomAutomaton::Random(Random, long) -> Random
     */
    public Random(long seed) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] RandomAutomaton::doubles(Random) -> DoubleStream
     */
    public DoubleStream doubles() {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(DoubleStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::doubles(Random, double, double) -> DoubleStream
     */
    public DoubleStream doubles(double arg0, double arg1) {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(DoubleStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::doubles(Random, long) -> DoubleStream
     */
    public DoubleStream doubles(long arg0) {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(DoubleStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::doubles(Random, long, double, double) -> DoubleStream
     */
    public DoubleStream doubles(long arg0, double arg1, double arg2) {
        DoubleStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(DoubleStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::ints(Random) -> IntStream
     */
    public IntStream ints() {
        IntStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(IntStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::ints(Random, int, int) -> IntStream
     */
    public IntStream ints(int arg0, int arg1) {
        IntStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(IntStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::ints(Random, long) -> IntStream
     */
    public IntStream ints(long arg0) {
        IntStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(IntStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::ints(Random, long, int, int) -> IntStream
     */
    public IntStream ints(long arg0, int arg1, int arg2) {
        IntStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(IntStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::longs(Random) -> LongStream
     */
    public LongStream longs() {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(LongStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::longs(Random, long) -> LongStream
     */
    public LongStream longs(long arg0) {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(LongStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::longs(Random, long, long) -> LongStream
     */
    public LongStream longs(long arg0, long arg1) {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(LongStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::longs(Random, long, long, long) -> LongStream
     */
    public LongStream longs(long arg0, long arg1, long arg2) {
        LongStream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(LongStream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextBoolean(Random) -> boolean
     */
    public boolean nextBoolean() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicBoolean();
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextBytes(Random, array<byte>) -> void
     */
    public void nextBytes(byte[] bytes) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int size = bytes.length;
            int i = 0;
            for (i = 0; i < size; i += 1) {
                bytes[i] = Engine.makeSymbolicByte();
            }
            ;
        }
    }

    /**
     * [FUNCTION] RandomAutomaton::nextDouble(Random) -> double
     */
    public double nextDouble() {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicDouble();
            Engine.assume(0.0d <= result);
            Engine.assume(result < 1.0d);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextFloat(Random) -> float
     */
    public float nextFloat() {
        float result = 0.0f;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicFloat();
            Engine.assume(0.0f <= result);
            Engine.assume(result < 1.0f);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextGaussian(Random) -> double
     */
    public synchronized double nextGaussian() {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicDouble();
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextInt(Random) -> int
     */
    public int nextInt() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicInt();
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextInt(Random, int) -> int
     */
    public int nextInt(int bound) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (bound <= 0) {
                throw new IllegalArgumentException("bound must be positive");
            }
            result = Engine.makeSymbolicInt();
            Engine.assume(0 <= result);
            Engine.assume(result < bound);
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::nextLong(Random) -> long
     */
    public long nextLong() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolicLong();
        }
        return result;
    }

    /**
     * [FUNCTION] RandomAutomaton::setSeed(Random, long) -> void
     */
    public synchronized void setSeed(long seed) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }
}
