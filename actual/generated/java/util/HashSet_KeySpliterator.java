// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/HashSet.lsl:33
//  - java/util/HashSet.Spliterator.lsl:19
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * HashSet_KeySpliteratorAutomaton for HashSet_KeySpliterator ~> java.util.HashSet_KeySpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.HashSet_KeySpliterator.class)
public final class HashSet_KeySpliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public Object[] keysStorage;

    public int index;

    public int fence;

    public int est;

    public int expectedModCount;

    public HashSet parent;

    @LibSLRuntime.AutomatonConstructor
    public HashSet_KeySpliterator(Void __$lsl_token, final byte p0, final Object[] p1, final int p2,
            final int p3, final int p4, final int p5, final HashSet p6) {
        this.__$lsl_state = p0;
        this.keysStorage = p1;
        this.index = p2;
        this.fence = p3;
        this.est = p4;
        this.expectedModCount = p5;
        this.parent = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public HashSet_KeySpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0, 0, 0, null);
    }

    /**
     * [CONSTRUCTOR] HashSet_KeySpliteratorAutomaton::<init>(HashSet_KeySpliterator, HashMap, int, int, int, int) -> void
     * Source: java/util/HashSet.Spliterator.lsl:89
     */
    private HashSet_KeySpliterator(HashMap source, int origin, int fence, int est,
            int expectedModCount) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.index = origin;
            fence = fence;
            est = est;
            expectedModCount = expectedModCount;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] HashSet_KeySpliteratorAutomaton::_getFence() -> int
     * Source: java/util/HashSet.Spliterator.lsl:54
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            Engine.assume(this.parent != null);
            int hi = this.fence;
            if (hi < 0) {
                final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
                this.est = parentStorage.size();
                this.expectedModCount = ((HashSet) ((Object) this.parent)).modCount;
                this.fence = this.est;
                hi = this.fence;
            }
            result = hi;
        }
        return result;
    }

    /**
     * [SUBROUTINE] HashSet_KeySpliteratorAutomaton::_checkForComodification() -> void
     * Source: java/util/HashSet.Spliterator.lsl:79
     */
    private void _checkForComodification() {
        /* body */ {
            final int modCount = ((HashSet) ((Object) this.parent)).modCount;
            if (this.expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] HashSet_KeySpliteratorAutomaton::estimateSize(HashSet_KeySpliterator) -> long
     * Source: java/util/HashSet.Spliterator.lsl:101
     */
    public long estimateSize() {
        long result = 0L;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _getFence();
            result = ((long) this.est);
        }
        return result;
    }

    /**
     * [FUNCTION] HashSet_KeySpliteratorAutomaton::characteristics(HashSet_KeySpliterator) -> int
     * Source: java/util/HashSet.Spliterator.lsl:108
     */
    public int characteristics() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            result = 0;
            final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
            final int length = parentStorage.size();
            if ((this.fence < 0) || (this.est == length)) {
                result = LibSLGlobals.SPLITERATOR_SIZED;
            }
            result |= LibSLGlobals.SPLITERATOR_DISTINCT;
        }
        return result;
    }

    /**
     * [FUNCTION] HashSet_KeySpliteratorAutomaton::forEachRemaining(HashSet_KeySpliterator, Consumer) -> void
     * Source: java/util/HashSet.Spliterator.lsl:122
     */
    public void forEachRemaining(Consumer userAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int hi = this.fence;
            int mc = this.expectedModCount;
            int i = this.index;
            final LibSLRuntime.Map<Object, Object> parentStorage = ((HashSet) ((Object) this.parent)).storage;
            final int length = parentStorage.size();
            if (hi < 0) {
                this.expectedModCount = ((HashSet) ((Object) this.parent)).modCount;
                mc = this.expectedModCount;
                this.fence = length;
                hi = this.fence;
            }
            this.index = hi;
            if ((length > 0) && (length >= hi) && (i >= 0) && (i < this.index)) {
                final Object[] storage = this.keysStorage;
                Engine.assume(storage != null);
                while (i < hi) {
                    final Object key = storage[i];
                    userAction.accept(key);
                    i += 1;
                }
                ;
                final int modCount = ((HashSet) ((Object) this.parent)).modCount;
                if (modCount != mc) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    /**
     * [FUNCTION] HashSet_KeySpliteratorAutomaton::tryAdvance(HashSet_KeySpliterator, Consumer) -> boolean
     * Source: java/util/HashSet.Spliterator.lsl:173
     */
    public boolean tryAdvance(Consumer userAction) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int hi = _getFence();
            int i = this.index;
            if (i < hi) {
                final Object key = keysStorage[i];
                userAction.accept(key);
                this.index += 1;
                _checkForComodification();
                result = true;
            }
            result = false;
        }
        return result;
    }

    /**
     * [FUNCTION] HashSet_KeySpliteratorAutomaton::trySplit(HashSet_KeySpliterator) -> Spliterator
     * Source: java/util/HashSet.Spliterator.lsl:197
     */
    public Spliterator trySplit() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            final int hi = _getFence();
            final int lo = this.index;
            int mid = (hi + lo) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                this.est = this.est >>> 1;
                this.index = mid;
                result = (stub.java.util.HashSet_KeySpliterator) ((Object) new HashSet_KeySpliterator((Void) null, 
                    /* state = */ HashSet_KeySpliterator.__$lsl_States.Initialized, 
                    /* keysStorage = */ this.keysStorage, 
                    /* index = */ lo, 
                    /* fence = */ mid, 
                    /* est = */ this.est, 
                    /* expectedModCount = */ this.expectedModCount, 
                    /* parent = */ this.parent
                ));
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(HashSet_KeySpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
