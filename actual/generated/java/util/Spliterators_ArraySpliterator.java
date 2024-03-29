// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/Spliterators.lsl:44
//  - java/util/Spliterators.ArraySpliterator.lsl:21
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * Spliterators_ArraySpliteratorAutomaton for Spliterators_ArraySpliterator ~> java.util.Spliterators_ArraySpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.Spliterators_ArraySpliterator.class)
public final class Spliterators_ArraySpliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public Object[] array;

    public int index;

    public int fence;

    public int characteristics;

    @LibSLRuntime.AutomatonConstructor
    public Spliterators_ArraySpliterator(Void __$lsl_token, final byte p0, final Object[] p1,
            final int p2, final int p3, final int p4) {
        this.__$lsl_state = p0;
        this.array = p1;
        this.index = p2;
        this.fence = p3;
        this.characteristics = p4;
    }

    @LibSLRuntime.AutomatonConstructor
    public Spliterators_ArraySpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0, 0);
    }

    /**
     * [CONSTRUCTOR] Spliterators_ArraySpliteratorAutomaton::<init>(Spliterators_ArraySpliterator, array<Object>, int) -> void
     * Source: java/util/Spliterators.ArraySpliterator.lsl:79
     */
    public Spliterators_ArraySpliterator(Object[] arr, int additionalCharacteristics) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.array = arr;
            this.index = 0;
            this.fence = arr.length;
            this.characteristics = additionalCharacteristics | LibSLGlobals.SPLITERATOR_SIZED | LibSLGlobals.SPLITERATOR_SUBSIZED;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] Spliterators_ArraySpliteratorAutomaton::<init>(Spliterators_ArraySpliterator, array<Object>, int, int, int) -> void
     * Source: java/util/Spliterators.ArraySpliterator.lsl:91
     */
    public Spliterators_ArraySpliterator(Object[] arr, int origin, int pFence,
            int additionalCharacteristics) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.array = arr;
            this.index = origin;
            this.fence = pFence;
            this.characteristics = additionalCharacteristics | LibSLGlobals.SPLITERATOR_SIZED | LibSLGlobals.SPLITERATOR_SUBSIZED;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] Spliterators_ArraySpliteratorAutomaton::_hasCharacteristics(int) -> boolean
     * Source: java/util/Spliterators.ArraySpliterator.lsl:71
     */
    private boolean _hasCharacteristics(int _characteristics) {
        boolean result = false;
        /* body */ {
            result = (this.characteristics & _characteristics) == _characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::characteristics(Spliterators_ArraySpliterator) -> int
     * Source: java/util/Spliterators.ArraySpliterator.lsl:107
     */
    public int characteristics() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::estimateSize(Spliterators_ArraySpliterator) -> long
     * Source: java/util/Spliterators.ArraySpliterator.lsl:113
     */
    public long estimateSize() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((long) (this.fence - this.index));
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::forEachRemaining(Spliterators_ArraySpliterator, Consumer) -> void
     * Source: java/util/Spliterators.ArraySpliterator.lsl:143
     */
    public void forEachRemaining(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final Object[] a = this.array;
            int hi = this.fence;
            int i = this.index;
            this.index = hi;
            for (i = i; i < hi; i += 1) {
                final Object item = a[i];
                _action.accept(item);
            }
            ;
        }
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::getComparator(Spliterators_ArraySpliterator) -> Comparator
     * Source: java/util/Spliterators.ArraySpliterator.lsl:158
     */
    public Comparator getComparator() {
        Comparator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_hasCharacteristics(LibSLGlobals.SPLITERATOR_SORTED)) {
                result = null;
            } else {
                throw new IllegalStateException();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::getExactSizeIfKnown(Spliterators_ArraySpliterator) -> long
     * Source: java/util/Spliterators.ArraySpliterator.lsl:167
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ((long) (this.fence - this.index));
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::hasCharacteristics(Spliterators_ArraySpliterator, int) -> boolean
     * Source: java/util/Spliterators.ArraySpliterator.lsl:173
     */
    public boolean hasCharacteristics(int _characteristics) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _hasCharacteristics(_characteristics);
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::tryAdvance(Spliterators_ArraySpliterator, Consumer) -> boolean
     * Source: java/util/Spliterators.ArraySpliterator.lsl:203
     */
    public boolean tryAdvance(Consumer _action) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int hi = this.fence;
            final int i = this.index;
            if (i < hi) {
                this.index = i + 1;
                final Object item = array[i];
                _action.accept(item);
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] Spliterators_ArraySpliteratorAutomaton::trySplit(Spliterators_ArraySpliterator) -> Spliterator
     * Source: java/util/Spliterators.ArraySpliterator.lsl:218
     */
    public Spliterator trySplit() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int hi = this.fence;
            final int lo = this.index;
            final int mid = (lo + hi) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                result = (stub.java.util.Spliterators_ArraySpliterator) ((Object) new Spliterators_ArraySpliterator((Void) null, 
                    /* state = */ Spliterators_ArraySpliterator.__$lsl_States.Initialized, 
                    /* array = */ this.array, 
                    /* index = */ lo, 
                    /* fence = */ mid, 
                    /* characteristics = */ this.characteristics
                ));
            }
            this.index = mid;
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(Spliterators_ArraySpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
