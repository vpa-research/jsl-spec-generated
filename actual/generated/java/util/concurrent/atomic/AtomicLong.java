// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/concurrent/atomic/AtomicLong.lsl:26
//  - java/util/concurrent/atomic/AtomicLong.main.lsl:19
//
package generated.java.util.concurrent.atomic;

import java.io.Serializable;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * AtomicLongAutomaton for LSLAtomicLong ~> java.util.concurrent.atomic.AtomicLong
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.util.concurrent.atomic.AtomicLong.class)
public class AtomicLong implements LibSLRuntime.Automaton, Serializable {
    private static final long serialVersionUID = 1927816293512124184L;

    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    private volatile long value;

    @LibSLRuntime.AutomatonConstructor
    public AtomicLong(Void __$lsl_token, final byte p0, final long p1) {
        this.__$lsl_state = p0;
        this.value = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public AtomicLong(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, 0L);
    }

    /**
     * [CONSTRUCTOR] AtomicLongAutomaton::LSLAtomicLong(LSLAtomicLong) -> LSLAtomicLong
     */
    public AtomicLong() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.value = 0L;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] AtomicLongAutomaton::LSLAtomicLong(LSLAtomicLong, long) -> LSLAtomicLong
     */
    public AtomicLong(long initialValue) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.value = initialValue;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::accumulateAndGet(LSLAtomicLong, long, LongBinaryOperator) -> long
     */
    public final long accumulateAndGet(long x, LongBinaryOperator accumulatorFunction) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = accumulatorFunction.applyAsLong(this.value, x);
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::addAndGet(LSLAtomicLong, long) -> long
     */
    public final long addAndGet(long delta) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value + delta;
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::byteValue(LSLAtomicLong) -> byte
     */
    public byte byteValue() {
        byte result = ((byte) 0);
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((byte) this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::compareAndExchange(LSLAtomicLong, long, long) -> long
     */
    public final long compareAndExchange(long expectedValue, long newValue) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::compareAndExchangeAcquire(LSLAtomicLong, long, long) -> long
     */
    public final long compareAndExchangeAcquire(long expectedValue, long newValue) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::compareAndExchangeRelease(LSLAtomicLong, long, long) -> long
     */
    public final long compareAndExchangeRelease(long expectedValue, long newValue) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            if (result == expectedValue) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::compareAndSet(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean compareAndSet(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::decrementAndGet(LSLAtomicLong) -> long
     */
    public final long decrementAndGet() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value - 1L;
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::doubleValue(LSLAtomicLong) -> double
     */
    public double doubleValue() {
        double result = 0.0d;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((double) this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::floatValue(LSLAtomicLong) -> float
     */
    public float floatValue() {
        float result = 0.0f;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((float) this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::get(LSLAtomicLong) -> long
     */
    public final long get() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAcquire(LSLAtomicLong) -> long
     */
    public final long getAcquire() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndAccumulate(LSLAtomicLong, long, LongBinaryOperator) -> long
     */
    public final long getAndAccumulate(long x, LongBinaryOperator accumulatorFunction) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = accumulatorFunction.applyAsLong(result, x);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndAdd(LSLAtomicLong, long) -> long
     */
    public final long getAndAdd(long delta) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = result + delta;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndDecrement(LSLAtomicLong) -> long
     */
    public final long getAndDecrement() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = result - 1L;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndIncrement(LSLAtomicLong) -> long
     */
    public final long getAndIncrement() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = result + 1L;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndSet(LSLAtomicLong, long) -> long
     */
    public final long getAndSet(long newValue) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = newValue;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getAndUpdate(LSLAtomicLong, LongUnaryOperator) -> long
     */
    public final long getAndUpdate(LongUnaryOperator updateFunction) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
            this.value = updateFunction.applyAsLong(result);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getOpaque(LSLAtomicLong) -> long
     */
    public final long getOpaque() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::getPlain(LSLAtomicLong) -> long
     */
    public final long getPlain() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::incrementAndGet(LSLAtomicLong) -> long
     */
    public final long incrementAndGet() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value + 1L;
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::intValue(LSLAtomicLong) -> int
     */
    public int intValue() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((int) this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::lazySet(LSLAtomicLong, long) -> void
     */
    public final void lazySet(long newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::longValue(LSLAtomicLong) -> long
     */
    public long longValue() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::set(LSLAtomicLong, long) -> void
     */
    public final void set(long newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::setOpaque(LSLAtomicLong, long) -> void
     */
    public final void setOpaque(long newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::setPlain(LSLAtomicLong, long) -> void
     */
    public final void setPlain(long newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::setRelease(LSLAtomicLong, long) -> void
     */
    public final void setRelease(long newValue) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.value = newValue;
        }
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::shortValue(LSLAtomicLong) -> short
     */
    public short shortValue() {
        short result = ((short) 0);
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((short) this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::toString(LSLAtomicLong) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.toString(this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::updateAndGet(LSLAtomicLong, LongUnaryOperator) -> long
     */
    public final long updateAndGet(LongUnaryOperator updateFunction) {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = updateFunction.applyAsLong(this.value);
            this.value = result;
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::weakCompareAndSet(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean weakCompareAndSet(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::weakCompareAndSetAcquire(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean weakCompareAndSetAcquire(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::weakCompareAndSetPlain(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean weakCompareAndSetPlain(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::weakCompareAndSetRelease(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean weakCompareAndSetRelease(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] AtomicLongAutomaton::weakCompareAndSetVolatile(LSLAtomicLong, long, long) -> boolean
     */
    public final boolean weakCompareAndSetVolatile(long expectedValue, long newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == expectedValue;
            if (result) {
                this.value = newValue;
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(AtomicLong.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
