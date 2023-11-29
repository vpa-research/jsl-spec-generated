// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
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
 * LinkedHashSet_KeySpliteratorAutomaton for LinkedHashSet_KeySpliterator ~> java.util.LinkedHashSet_KeySpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.LinkedHashSet_KeySpliterator.class)
public final class LinkedHashSet_KeySpliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public Object[] keysStorage;

    public int index;

    public int fence;

    public int est;

    public int expectedModCount;

    public LinkedHashSet parent;

    @LibSLRuntime.AutomatonConstructor
    public LinkedHashSet_KeySpliterator(Void __$lsl_token, final byte p0, final Object[] p1,
            final int p2, final int p3, final int p4, final int p5, final LinkedHashSet p6) {
        this.__$lsl_state = p0;
        this.keysStorage = p1;
        this.index = p2;
        this.fence = p3;
        this.est = p4;
        this.expectedModCount = p5;
        this.parent = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public LinkedHashSet_KeySpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0, 0, 0, null);
    }

    /**
     * [CONSTRUCTOR] LinkedHashSet_KeySpliteratorAutomaton::LinkedHashSet_KeySpliterator(LinkedHashSet_KeySpliterator, HashMap, int, int, int, int) -> LinkedHashSet_KeySpliterator
     */
    private LinkedHashSet_KeySpliterator(HashMap source, int origin, int fence, int est,
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
     * [SUBROUTINE] LinkedHashSet_KeySpliteratorAutomaton::_getFence() -> int
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            Engine.assume(this.parent != null);
            int hi = this.fence;
            if (hi < 0) {
                final LibSLRuntime.Map<Object, Object> parentStorage = ((LinkedHashSet) ((Object) this.parent)).storage;
                this.est = ((LinkedHashSet) ((Object) this.parent)).length;
                this.expectedModCount = ((LinkedHashSet) ((Object) this.parent)).modCount;
                this.fence = this.est;
                hi = this.fence;
            }
            result = hi;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedHashSet_KeySpliteratorAutomaton::_checkForComodification() -> void
     */
    private void _checkForComodification() {
        /* body */ {
            final int modCount = ((LinkedHashSet) ((Object) this.parent)).modCount;
            if (this.expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] LinkedHashSet_KeySpliteratorAutomaton::estimateSize(LinkedHashSet_KeySpliterator) -> long
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
     * [FUNCTION] LinkedHashSet_KeySpliteratorAutomaton::characteristics(LinkedHashSet_KeySpliterator) -> int
     */
    public int characteristics() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.parent != null);
            int mask = 0;
            final int length = ((LinkedHashSet) ((Object) this.parent)).length;
            if ((this.fence < 0) || (this.est == length)) {
                mask = LibSLGlobals.SPLITERATOR_SIZED;
            }
            result = mask | LibSLGlobals.SPLITERATOR_DISTINCT;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedHashSet_KeySpliteratorAutomaton::forEachRemaining(LinkedHashSet_KeySpliterator, Consumer) -> void
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
            final int length = ((LinkedHashSet) ((Object) this.parent)).length;
            if (hi < 0) {
                this.expectedModCount = ((LinkedHashSet) ((Object) this.parent)).modCount;
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
                final int modCount = ((LinkedHashSet) ((Object) this.parent)).modCount;
                if (modCount != mc) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    /**
     * [FUNCTION] LinkedHashSet_KeySpliteratorAutomaton::tryAdvance(LinkedHashSet_KeySpliterator, Consumer) -> boolean
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
     * [FUNCTION] LinkedHashSet_KeySpliteratorAutomaton::trySplit(LinkedHashSet_KeySpliterator) -> Spliterator
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
                result = (stub.java.util.LinkedHashSet_KeySpliterator) ((Object) new LinkedHashSet_KeySpliterator((Void) null, 
                    /* state = */ LinkedHashSet_KeySpliterator.__$lsl_States.Initialized, 
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

    @Approximate(LinkedHashSet_KeySpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
