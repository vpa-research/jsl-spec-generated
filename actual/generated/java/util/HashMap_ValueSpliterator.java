// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/HashMap.lsl:54
//  - java/util/HashMap.ValueSpliterator.lsl:21
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * HashMap_ValueSpliteratorAutomaton for HashMap_ValueSpliterator ~> java.util.HashMap_ValueSpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.HashMap_ValueSpliterator.class)
public final class HashMap_ValueSpliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
        Engine.assume(true);
    }

    public Object[] valuesStorage;

    public HashMap parent;

    public int index;

    public int fence;

    public int est;

    public int expectedModCount;

    @LibSLRuntime.AutomatonConstructor
    public HashMap_ValueSpliterator(Void __$lsl_token, final byte p0, final Object[] p1,
            final HashMap p2, final int p3, final int p4, final int p5, final int p6) {
        this.valuesStorage = p1;
        this.parent = p2;
        this.index = p3;
        this.fence = p4;
        this.est = p5;
        this.expectedModCount = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public HashMap_ValueSpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, null, 0, -1, 0, 0);
    }

    /**
     * [SUBROUTINE] HashMap_ValueSpliteratorAutomaton::_getFence() -> int
     * Source: java/util/HashMap.ValueSpliterator.lsl:55
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            Engine.assume(this.parent != null);
            if (this.fence < 0) {
                final int storageSize = this.valuesStorage.length;
                this.est = storageSize;
                this.fence = storageSize;
                this.expectedModCount = ((HashMap) ((Object) this.parent)).modCount;
            }
            result = this.fence;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::characteristics(HashMap_ValueSpliterator) -> int
     * Source: java/util/HashMap.ValueSpliterator.lsl:89
     */
    public int characteristics() {
        int result = 0;
        /* body */ {
            if ((this.fence < 0) || (this.est == this.valuesStorage.length)) {
                result = LibSLGlobals.SPLITERATOR_SIZED;
            } else {
                result = 0;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::estimateSize(HashMap_ValueSpliterator) -> long
     * Source: java/util/HashMap.ValueSpliterator.lsl:99
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
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::forEachRemaining(HashMap_ValueSpliterator, Consumer) -> void
     * Source: java/util/HashMap.ValueSpliterator.lsl:106
     */
    public void forEachRemaining(Consumer userAction) {
        /* body */ {
            if (userAction == null) {
                throw new NullPointerException();
            }
            int hi = this.fence;
            int mc = this.expectedModCount;
            int i = this.index;
            final int storageSize = this.valuesStorage.length;
            if (hi < 0) {
                mc = ((HashMap) ((Object) this.parent)).modCount;
                this.expectedModCount = mc;
                this.fence = storageSize;
                hi = storageSize;
            }
            this.index = hi;
            if ((storageSize > 0) && (storageSize >= hi) && (i >= 0) && (i < this.index)) {
                while (i < hi) {
                    userAction.accept(valuesStorage[i]);
                    i += 1;
                }
                ;
                final int modCount = ((HashMap) ((Object) this.parent)).modCount;
                if (modCount != mc) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    /**
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::getExactSizeIfKnown(HashMap_ValueSpliterator) -> long
     * Source: java/util/HashMap.ValueSpliterator.lsl:156
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::tryAdvance(HashMap_ValueSpliterator, Consumer) -> boolean
     * Source: java/util/HashMap.ValueSpliterator.lsl:169
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
                userAction.accept(valuesStorage[i]);
                if (((HashMap) ((Object) this.parent)).modCount != this.expectedModCount) {
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
     * [FUNCTION] HashMap_ValueSpliteratorAutomaton::trySplit(HashMap_ValueSpliterator) -> Spliterator
     * Source: java/util/HashMap.ValueSpliterator.lsl:194
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
                result = (stub.java.util.HashMap_ValueSpliterator) ((Object) new HashMap_ValueSpliterator((Void) null, 
                    /* state = */ HashMap_ValueSpliterator.__$lsl_States.Initialized, 
                    /* valuesStorage = */ this.valuesStorage, 
                    /* parent = */ this.parent, 
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

    @Approximate(HashMap_ValueSpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
