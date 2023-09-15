// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * RandomAutomaton for Random ~> java.util.Random
 */
@Approximate(java.util.Random.class)
public class Random implements LibSLRuntime.Automaton, Serializable {
    static {
    }

    public LibSLRuntime.Token __$lsl_token = null;

    private byte __$lsl_state = __$lsl_States.Allocated;

    @LibSLRuntime.AutomatonConstructor
    public Random(final LibSLRuntime.Token p0, final byte p1) {
        this.__$lsl_token = p0;
        this.__$lsl_state = p1;
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
            ;
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
            ;
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
    public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
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
    public DoubleStream doubles(long streamSize) {
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
    public DoubleStream doubles(long streamSize, double randomNumberOrigin,
            double randomNumberBound) {
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
    public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
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
    public IntStream ints(long streamSize) {
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
    public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) {
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
    public LongStream longs(long streamSize) {
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
    public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
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
    public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) {
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
            final boolean isNaN = Double.isNaN(result);
            Engine.assume(!isNaN);
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
            ;
        }
    }

    /**
     * [FUNCTION] RandomAutomaton::readObject(ObjectInputStream) -> void
     */
    private void readObject(ObjectInputStream s) throws java.io.IOException,
            java.lang.ClassNotFoundException {
        /* body */ {
            LibSLRuntime.not_implemented(/* no serialization support */);
        }
    }

    /**
     * [FUNCTION] RandomAutomaton::writeObject(ObjectOutputStream) -> void
     */
    private synchronized void writeObject(ObjectOutputStream s) throws java.io.IOException {
        /* body */ {
            LibSLRuntime.not_implemented(/* no serialization support */);
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(Random.class)
    public static final class __hook {
        private __hook(Void o) {
            Engine.assume(false);
        }
    }
}
