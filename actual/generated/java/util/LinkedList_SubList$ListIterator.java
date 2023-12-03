// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/LinkedList.lsl:74
//  - java/util/LinkedList.SubList.ListIterator.lsl:15
//
package generated.java.util;

import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

/**
 * LinkedList_SubList_ListIteratorAutomaton for LinkedList_SubList_ListIterator ~> java.util.LinkedList_SubList$ListIterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.LinkedList_SubList$ListIterator.class)
public final class LinkedList_SubList$ListIterator implements LibSLRuntime.Automaton, ListIterator {
    static {
        Engine.assume(true);
    }

    public LinkedList root;

    public LinkedList_SubList sublist;

    public int cursor;

    public int expectedModCount;

    public int offset;

    public int size;

    public int lastRet;

    @LibSLRuntime.AutomatonConstructor
    public LinkedList_SubList$ListIterator(Void __$lsl_token, final byte p0, final LinkedList p1,
            final LinkedList_SubList p2, final int p3, final int p4, final int p5, final int p6,
            final int p7) {
        this.root = p1;
        this.sublist = p2;
        this.cursor = p3;
        this.expectedModCount = p4;
        this.offset = p5;
        this.size = p6;
        this.lastRet = p7;
    }

    @LibSLRuntime.AutomatonConstructor
    public LinkedList_SubList$ListIterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, null, 0, 0, 0, 0, -1);
    }

    /**
     * [SUBROUTINE] LinkedList_SubList_ListIteratorAutomaton::_checkForComodification() -> void
     */
    private void _checkForComodification() {
        /* body */ {
            final int modCount = ((LinkedList) ((Object) this.root)).modCount;
            if (modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::hasPrevious(LinkedList_SubList_ListIterator) -> boolean
     */
    public boolean hasPrevious() {
        boolean result = false;
        /* body */ {
            result = this.cursor != 0;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::nextIndex(LinkedList_SubList_ListIterator) -> int
     */
    public int nextIndex() {
        int result = 0;
        /* body */ {
            result = this.cursor;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::previousIndex(LinkedList_SubList_ListIterator) -> int
     */
    public int previousIndex() {
        int result = 0;
        /* body */ {
            result = this.cursor - 1;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::hasNext(LinkedList_SubList_ListIterator) -> boolean
     */
    public boolean hasNext() {
        boolean result = false;
        /* body */ {
            result = this.cursor != this.size;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::next(LinkedList_SubList_ListIterator) -> Object
     */
    public Object next() {
        Object result = null;
        /* body */ {
            Engine.assume(this.root != null);
            _checkForComodification();
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int i = this.offset + this.cursor;
            if (i >= rootStorage.size()) {
                throw new NoSuchElementException();
            }
            this.lastRet = this.cursor;
            this.cursor += 1;
            result = rootStorage.get(i);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::previous(LinkedList_SubList_ListIterator) -> Object
     */
    public Object previous() {
        Object result = null;
        /* body */ {
            Engine.assume(this.root != null);
            _checkForComodification();
            final int i = (this.offset + this.cursor) - 1;
            if (i < this.offset) {
                throw new NoSuchElementException();
            }
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            if (i >= rootStorage.size()) {
                throw new ConcurrentModificationException();
            }
            this.cursor -= 1;
            this.lastRet = this.cursor;
            result = rootStorage.get(i);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::remove(LinkedList_SubList_ListIterator) -> void
     */
    public void remove() {
        /* body */ {
            Engine.assume(this.root != null);
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            _checkForComodification();
            if (this.lastRet >= this.size) {
                throw new ConcurrentModificationException();
            } else {
                ((LinkedList) ((Object) this.root))._unlinkAny(this.offset + this.lastRet);
                ((LinkedList_SubList) ((Object) this.sublist))._updateSizeAndModCount(-1);
                this.expectedModCount = ((LinkedList) ((Object) this.root)).modCount;
                this.size -= 1;
            }
            this.cursor = this.lastRet;
            this.lastRet = -1;
        }
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::set(LinkedList_SubList_ListIterator, Object) -> void
     */
    public void set(Object e) {
        /* body */ {
            Engine.assume(this.root != null);
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            _checkForComodification();
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int index = this.offset + this.lastRet;
            if (index >= rootStorage.size()) {
                throw new ConcurrentModificationException();
            } else {
                rootStorage.set(index, e);
            }
        }
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::add(LinkedList_SubList_ListIterator, Object) -> void
     */
    public void add(Object e) {
        /* body */ {
            Engine.assume(this.root != null);
            _checkForComodification();
            final int i = this.offset + this.cursor;
            if ((this.offset + this.lastRet) > ((LinkedList) ((Object) this.root)).storage.size()) {
                throw new ConcurrentModificationException();
            } else {
                ((LinkedList) ((Object) this.root))._linkAny(i, e);
                ((LinkedList_SubList) ((Object) this.sublist))._updateSizeAndModCount(1);
                this.expectedModCount = ((LinkedList) ((Object) this.root)).modCount;
                this.size += 1;
            }
            this.cursor += 1;
            this.lastRet = -1;
        }
    }

    /**
     * [FUNCTION] LinkedList_SubList_ListIteratorAutomaton::forEachRemaining(LinkedList_SubList_ListIterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer userAction) {
        /* body */ {
            Engine.assume(this.root != null);
            if (userAction == null) {
                throw new NullPointerException();
            }
            int i = this.cursor;
            if (i < this.size) {
                i += this.offset;
                final SymbolicList<Object> es = ((LinkedList) ((Object) this.root)).storage;
                if (i >= es.size()) {
                    throw new ConcurrentModificationException();
                }
                final int end = this.offset + this.size;
                for (i = i; i < end; i += 1) {
                    final Object item = es.get(i);
                    userAction.accept(item);
                }
                ;
                this.cursor = i - this.offset;
                this.lastRet = this.cursor - 1;
                _checkForComodification();
            }
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(LinkedList_SubList$ListIterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
