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
@Approximate(java.util.ArrayList_SubList$Spliterator.class)
public final class ArrayList_SubList$Spliterator implements LibSLRuntime.Automaton, Spliterator {
    static {
    }

    public LibSLRuntime.Token __$lsl_token = null;

    public ArrayList root;

    public ArrayList_SubList parent;

    public int index = 0;

    public int fence = -1;

    public int expectedModCount = 0;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList$Spliterator(final LibSLRuntime.Token p0, final byte p1,
            final ArrayList p2, final ArrayList_SubList p3, final int p4, final int p5,
            final int p6) {
        this.__$lsl_token = p0;
        this.root = p2;
        this.parent = p3;
        this.index = p4;
        this.fence = p5;
        this.expectedModCount = p6;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList$Spliterator(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, null, 0, -1, 0);
    }

    /**
     * [SUBROUTINE] ArrayList_SubList_SpliteratorAutomaton::_getFence() -> int
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            if (fence < 0) {
                Engine.assume(parent != null);
                expectedModCount = ((ArrayList_SubList) parent).modCount;
                fence = ((ArrayList_SubList) parent).length;
            }
            result = fence;
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
            result = _getFence() - index;
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
            Engine.assume(root != null);
            Engine.assume(parent != null);
            final SymbolicList<Object> a = ((ArrayList) root).storage;
            if (a == null) {
                throw new ConcurrentModificationException();
            }
            int hi = fence;
            int mc = expectedModCount;
            if (hi < 0) {
                hi = ((ArrayList_SubList) parent).length;
                mc = ((ArrayList_SubList) parent).modCount;
            }
            int i = index;
            index = hi;
            if ((i < 0) || (hi > ((ArrayList_SubList) parent).length)) {
                throw new ConcurrentModificationException();
            }
            for (i = i; i < hi; i += 1) {
                final Object item = a.get(i);
                _action.accept(item);
            }
            ;
            if (mc != ((ArrayList_SubList) parent).modCount) {
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
            result = _getFence() - index;
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
            final int i = index;
            if (i < hi) {
                Engine.assume(root != null);
                index = i + 1;
                final SymbolicList<Object> rootStorage = ((ArrayList) root).storage;
                final Object item = rootStorage.get(i);
                _action.accept(item);
                if (((ArrayList) root).modCount != expectedModCount) {
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
            final int lo = index;
            final int mid = (lo + hi) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                result = new ArrayList_SubList$Spliterator(LibSLRuntime.Token.INSTANCE, ArrayList_SubList$Spliterator.__$lsl_States.Initialized, root, parent, lo, mid, expectedModCount);
            }
            index = mid;
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(ArrayList_SubList$Spliterator.class)
    public static final class __hook {
        private __hook(Void o) {
            Engine.assume(false);
        }
    }
}
