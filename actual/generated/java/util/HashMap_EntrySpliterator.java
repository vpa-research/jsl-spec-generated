// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/HashMap.lsl:108
//  - java/util/HashMap.EntrySpliterator.lsl:21
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * HashMap_EntrySpliteratorAutomaton for HashMap_EntrySpliterator ~> java.util.HashMap_EntrySpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.HashMap_EntrySpliterator.class)
public final class HashMap_EntrySpliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
        Engine.assume(true);
    }

    public HashMap parent;

    public Map.Entry<Object, Object>[] entryStorage;

    public int index;

    public int fence;

    public int est;

    public int expectedModCount;

    @LibSLRuntime.AutomatonConstructor
    public HashMap_EntrySpliterator(Void __$lsl_token, final byte p0, final HashMap p1,
            final Map.Entry<Object, Object>[] p2, final int p3, final int p4, final int p5,
            final int p6) {
        this.parent = p1;
        this.entryStorage = p2;
        this.index = p3;
        this.fence = p4;
        this.est = p5;
        this.expectedModCount = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public HashMap_EntrySpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, null, 0, -1, 0, 0);
    }

    /**
     * [SUBROUTINE] HashMap_EntrySpliteratorAutomaton::_getFence() -> int
     * Source: java/util/HashMap.EntrySpliterator.lsl:54
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            Engine.assume(this.parent != null);
            if (this.fence < 0) {
                final int storageSize = this.entryStorage.length;
                this.est = storageSize;
                this.fence = storageSize;
                this.expectedModCount = ((HashMap) ((Object) this.parent)).modCount;
            }
            result = this.fence;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::characteristics(HashMap_EntrySpliterator) -> int
     * Source: java/util/HashMap.EntrySpliterator.lsl:88
     */
    public int characteristics() {
        int result = 0;
        /* body */ {
            if ((this.fence < 0) || (this.est == this.entryStorage.length)) {
                result = LibSLGlobals.SPLITERATOR_SIZED | LibSLGlobals.SPLITERATOR_DISTINCT;
            } else {
                result = LibSLGlobals.SPLITERATOR_DISTINCT;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::estimateSize(HashMap_EntrySpliterator) -> long
     * Source: java/util/HashMap.EntrySpliterator.lsl:98
     */
    public final long estimateSize() {
        long result = 0L;
        /* body */ {
            _getFence();
            result = ((long) this.est);
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::forEachRemaining(HashMap_EntrySpliterator, Consumer) -> void
     * Source: java/util/HashMap.EntrySpliterator.lsl:105
     */
    public void forEachRemaining(Consumer userAction) {
        /* body */ {
            if (userAction == null) {
                throw new NullPointerException();
            }
            int hi = this.fence;
            int mc = this.expectedModCount;
            int i = this.index;
            final int storageSize = this.entryStorage.length;
            if (hi < 0) {
                mc = ((HashMap) ((Object) this.parent)).modCount;
                this.expectedModCount = mc;
                this.fence = storageSize;
                hi = storageSize;
            }
            this.index = hi;
            if ((storageSize > 0) && (storageSize >= hi) && (i >= 0) && (i < this.index)) {
                while (i < hi) {
                    Map.Entry<Object, Object> entry = entryStorage[i];
                    userAction.accept(entry);
                    i += 1;
                }
                ;
                if (((HashMap) ((Object) this.parent)).modCount != mc) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::getExactSizeIfKnown(HashMap_EntrySpliterator) -> long
     * Source: java/util/HashMap.EntrySpliterator.lsl:154
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::tryAdvance(HashMap_EntrySpliterator, Consumer) -> boolean
     * Source: java/util/HashMap.EntrySpliterator.lsl:167
     */
    public boolean tryAdvance(Consumer userAction) {
        boolean result = false;
        /* body */ {
            if (userAction == null) {
                throw new NullPointerException();
            }
            int hi = _getFence();
            int i = this.index;
            if (i < hi) {
                this.index = i + 1;
                userAction.accept(entryStorage[i]);
                if (this.expectedModCount != ((HashMap) ((Object) this.parent)).modCount) {
                    throw new ConcurrentModificationException();
                }
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_EntrySpliteratorAutomaton::trySplit(HashMap_EntrySpliterator) -> Spliterator
     * Source: java/util/HashMap.EntrySpliterator.lsl:192
     */
    public Spliterator trySplit() {
        Spliterator result = null;
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
                result = (stub.java.util.HashMap_EntrySpliterator) ((Object) new HashMap_EntrySpliterator((Void) null, 
                    /* state = */ HashMap_EntrySpliterator.__$lsl_States.Initialized, 
                    /* parent = */ this.parent, 
                    /* entryStorage = */ this.entryStorage, 
                    /* index = */ lo, 
                    /* fence = */ mid, 
                    /* est = */ this.est, 
                    /* expectedModCount = */ this.expectedModCount
                ));
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(HashMap_EntrySpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
