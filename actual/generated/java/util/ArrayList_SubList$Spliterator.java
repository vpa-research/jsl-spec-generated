// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.util.ConcurrentModificationException;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

/**
 * ArrayList_SubList_SpliteratorAutomaton for ArrayList_SubList_Spliterator ~> java.util.ArrayList_SubList$Spliterator
 */
@Approximate(stub.java.util.ArrayList_SubList$Spliterator.class)
public final class ArrayList_SubList$Spliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
    }

    public ArrayList root;

    public ArrayList_SubList parent;

    public int index = 0;

    public int fence = -1;

    public int expectedModCount = 0;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList$Spliterator(Void __$lsl_token, final byte p0, final ArrayList p1,
            final ArrayList_SubList p2, final int p3, final int p4, final int p5) {
        this.root = p1;
        this.parent = p2;
        this.index = p3;
        this.fence = p4;
        this.expectedModCount = p5;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList$Spliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, null, 0, -1, 0);
    }

    /**
     * [SUBROUTINE] ArrayList_SubList_SpliteratorAutomaton::_getFence() -> int
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            if (this.fence == -1) {
                Engine.assume(this.parent != null);
                this.expectedModCount = ((ArrayList_SubList) this.parent).modCount;
                this.fence = ((ArrayList_SubList) this.parent).length;
            }
            result = this.fence;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::characteristics(ArrayList_SubList_Spliterator) -> int
     */
    public int characteristics() {
        int result = 0;
        /* body */ {
            result = LibSLGlobals.SPLITERATOR_ORDERED | LibSLGlobals.SPLITERATOR_SIZED | LibSLGlobals.SPLITERATOR_SUBSIZED;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::estimateSize(ArrayList_SubList_Spliterator) -> long
     */
    public long estimateSize() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::forEachRemaining(ArrayList_SubList_Spliterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer _action) {
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            Engine.assume(this.root != null);
            Engine.assume(this.parent != null);
            final SymbolicList<Object> a = ((ArrayList) this.root).storage;
            if (a == null) {
                throw new ConcurrentModificationException();
            }
            int hi = this.fence;
            int mc = this.expectedModCount;
            if (hi == -1) {
                hi = ((ArrayList_SubList) this.parent).length;
                mc = ((ArrayList_SubList) this.parent).modCount;
            }
            int i = this.index;
            this.index = hi;
            if ((i < 0) || (hi > ((ArrayList_SubList) this.parent).length)) {
                throw new ConcurrentModificationException();
            }
            for (i = i; i < hi; i += 1) {
                final Object item = a.get(i);
                _action.accept(item);
            }
            ;
            if (mc != ((ArrayList_SubList) this.parent).modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::getExactSizeIfKnown(ArrayList_SubList_Spliterator) -> long
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::tryAdvance(ArrayList_SubList_Spliterator, Consumer) -> boolean
     */
    public boolean tryAdvance(Consumer _action) {
        boolean result = false;
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int hi = _getFence();
            final int i = this.index;
            if (i < hi) {
                Engine.assume(this.root != null);
                this.index = i + 1;
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final Object item = rootStorage.get(i);
                _action.accept(item);
                if (((ArrayList) this.root).modCount != this.expectedModCount) {
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
     * [FUNCTION] ArrayList_SubList_SpliteratorAutomaton::trySplit(ArrayList_SubList_Spliterator) -> ArrayList_SubList_Spliterator
     */
    public ArrayList_SubList$Spliterator trySplit() {
        ArrayList_SubList$Spliterator result = null;
        /* body */ {
            final int hi = _getFence();
            final int lo = this.index;
            final int mid = (lo + hi) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                result = new ArrayList_SubList$Spliterator((Void) null, 
                /* state = */ ArrayList_SubList$Spliterator.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* parent = */ this.parent, 
                /* index = */ lo, 
                /* fence = */ mid, 
                /* expectedModCount = */ this.expectedModCount);
            }
            this.index = mid;
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(ArrayList_SubList$Spliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
