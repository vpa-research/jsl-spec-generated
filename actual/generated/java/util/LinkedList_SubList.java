// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/LinkedList.lsl:53
//  - java/util/LinkedList.SubList.lsl:15
//
package generated.java.util;

import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

/**
 * LinkedList_SubListAutomaton for LinkedList_SubList ~> java.util.LinkedList_SubList
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.LinkedList_SubList.class)
public final class LinkedList_SubList implements LibSLRuntime.Automaton, List, RandomAccess {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public LinkedList root;

    public LinkedList_SubList parentList;

    public int offset;

    public int length;

    public int modCount;

    @LibSLRuntime.AutomatonConstructor
    public LinkedList_SubList(Void __$lsl_token, final byte p0, final LinkedList p1,
            final LinkedList_SubList p2, final int p3, final int p4, final int p5) {
        this.__$lsl_state = p0;
        this.root = p1;
        this.parentList = p2;
        this.offset = p3;
        this.length = p4;
        this.modCount = p5;
    }

    @LibSLRuntime.AutomatonConstructor
    public LinkedList_SubList(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, null, 0, 0, 0);
    }

    /**
     * [CONSTRUCTOR] LinkedList_SubListAutomaton::<init>(LinkedList_SubList, LinkedList, int, int) -> void
     * Source: java/util/LinkedList.SubList.lsl:187
     */
    public LinkedList_SubList(LinkedList root, int fromIndex, int toIndex) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* inaccessible constructor */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] LinkedList_SubListAutomaton::<init>(LinkedList_SubList, LinkedList_SubList, int, int) -> void
     * Source: java/util/LinkedList.SubList.lsl:194
     */
    private LinkedList_SubList(LinkedList_SubList parent, int fromIndex, int toIndex) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* inaccessible constructor */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] LinkedList_SubListAutomaton::_addAllElements(int, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:90
     */
    private boolean _addAllElements(int index, Collection c) {
        boolean result = false;
        /* body */ {
            Engine.assume(this.root != null);
            final int effectiveIndex = this.offset + index;
            ((LinkedList) ((Object) this.root))._checkPositionIndex(effectiveIndex);
            final int collectionSize = c.size();
            if (collectionSize == 0) {
                result = false;
            } else {
                result = true;
                ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
                ((LinkedList) ((Object) this.root))._addAllElements(effectiveIndex, c);
                _updateSizeAndModCount(collectionSize);
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedList_SubListAutomaton::_updateSizeAndModCount(int) -> void
     * Source: java/util/LinkedList.SubList.lsl:113
     */
    public void _updateSizeAndModCount(int sizeChange) {
        /* body */ {
            Engine.assume(this.root != null);
            this.length += sizeChange;
            this.modCount = ((LinkedList) ((Object) this.root)).modCount;
            LinkedList_SubList aList = this.parentList;
            while (aList != null) {
                ((LinkedList_SubList) ((Object) aList)).length += sizeChange;
                ((LinkedList_SubList) ((Object) aList)).modCount = this.modCount;
                aList = ((LinkedList_SubList) ((Object) aList)).parentList;
            }
            ;
        }
    }

    /**
     * [SUBROUTINE] LinkedList_SubListAutomaton::_indexOfElement(Object) -> int
     * Source: java/util/LinkedList.SubList.lsl:138
     */
    private int _indexOfElement(Object o) {
        int result = 0;
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final SymbolicList<Object> parentStorage = ((LinkedList) ((Object) this.root)).storage;
            final int index = LibSLRuntime.ListActions.find(parentStorage, o, this.offset, this.offset + this.length);
            if (index != -1) {
                result = index - this.offset;
            } else {
                result = -1;
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedList_SubListAutomaton::_makeStream(boolean) -> Stream
     * Source: java/util/LinkedList.SubList.lsl:153
     */
    private Stream _makeStream(boolean parallel) {
        Stream result = null;
        /* body */ {
            result = Engine.makeSymbolic(Stream.class);
            Engine.assume(result != null);
            Engine.assume(result.isParallel() == parallel);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedList_SubListAutomaton::_batchRemove(Collection, boolean) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:162
     */
    private boolean _batchRemove(Collection c, boolean complement) {
        boolean result = false;
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            if (this.length != 0) {
                final int oldRootLength = ((LinkedList) ((Object) this.root)).storage.size();
                result = ((LinkedList) ((Object) this.root))._batchRemove(c, complement, this.offset, this.offset + this.length);
                if (result) {
                    final int newRootLength = ((LinkedList) ((Object) this.root)).storage.size();
                    _updateSizeAndModCount(newRootLength - oldRootLength);
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::add(LinkedList_SubList, Object) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:206
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + this.length;
            ((LinkedList) ((Object) this.root))._linkAny(effectiveIndex, e);
            _updateSizeAndModCount(1);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::add(LinkedList_SubList, int, Object) -> void
     * Source: java/util/LinkedList.SubList.lsl:219
     */
    public void add(int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            ((LinkedList) ((Object) this.root))._linkAny(effectiveIndex, element);
            _updateSizeAndModCount(1);
        }
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::addAll(LinkedList_SubList, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:232
     */
    public boolean addAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _addAllElements(this.length, c);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::addAll(LinkedList_SubList, int, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:238
     */
    public boolean addAll(int index, Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _addAllElements(index, c);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::clear(LinkedList_SubList) -> void
     * Source: java/util/LinkedList.SubList.lsl:245
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int size = this.length;
            if (size != 0) {
                Engine.assume(size > 0);
                final int end = this.offset - 1;
                final int start = end + size;
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                int i = 0;
                for (i = start; i > end; i += -1) {
                    rootStorage.remove(i);
                }
                ;
                ((LinkedList) ((Object) this.root)).modCount += 1;
                _updateSizeAndModCount(-size);
            }
        }
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::contains(LinkedList_SubList, Object) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:277
     */
    public boolean contains(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _indexOfElement(o) != -1;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::containsAll(LinkedList_SubList, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:284
     */
    public boolean containsAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = true;
            if (!c.isEmpty()) {
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                final int end = this.offset + this.length;
                if ((c != null && c.getClass() == stub.java.util.LinkedList_SubList.class)) {
                    final LinkedList otherRoot = ((LinkedList_SubList) ((Object) c)).root;
                    Engine.assume(otherRoot != null);
                    final SymbolicList<Object> otherStorage = ((LinkedList) ((Object) otherRoot)).storage;
                    final int otherOffset = ((LinkedList_SubList) ((Object) c)).offset;
                    final int otherEnd = otherOffset + ((LinkedList_SubList) ((Object) c)).length;
                    Engine.assume(otherStorage != null);
                    Engine.assume(otherOffset >= 0);
                    Engine.assume(otherEnd >= 0);
                    int i = otherOffset;
                    while (result && (i < otherEnd)) {
                        final Object item = otherStorage.get(i);
                        result = LibSLRuntime.ListActions.find(rootStorage, item, this.offset, end) != -1;
                        i += 1;
                    }
                    ;
                } else {
                    final Iterator iter = c.iterator();
                    while (result && iter.hasNext()) {
                        final Object item = iter.next();
                        result = LibSLRuntime.ListActions.find(rootStorage, item, this.offset, end) != -1;
                    }
                    ;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::equals(LinkedList_SubList, Object) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:340
     */
    public boolean equals(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (o == this) {
                result = true;
            } else {
                result = (o != null && o.getClass() == stub.java.util.LinkedList_SubList.class);
                if (result) {
                    Engine.assume(this.root != null);
                    final int otherLength = ((LinkedList_SubList) ((Object) o)).length;
                    Engine.assume(otherLength >= 0);
                    result = this.length == otherLength;
                    if (result) {
                        result = ((LinkedList) ((Object) this.root))._equalsRange(((List) o), this.offset, this.offset + this.length);
                        ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
                    }
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::forEach(LinkedList_SubList, Consumer) -> void
     * Source: java/util/LinkedList.SubList.lsl:368
     */
    public void forEach(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.length != 0) {
                Engine.assume(this.length > 0);
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                final int expectedModCount = ((LinkedList) ((Object) this.root)).modCount;
                this.modCount = expectedModCount;
                int i = this.offset;
                final int end = this.offset + this.length;
                while ((i < end) && (((LinkedList) ((Object) this.root)).modCount == expectedModCount)) {
                    final Object item = rootStorage.get(i);
                    _action.accept(item);
                    i += 1;
                }
                ;
                ((LinkedList) ((Object) this.root))._checkForComodification(expectedModCount);
            }
        }
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::get(LinkedList_SubList, int) -> Object
     * Source: java/util/LinkedList.SubList.lsl:400
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkElementIndex(index, this.length);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            result = ((LinkedList) ((Object) this.root)).storage.get(effectiveIndex);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::hashCode(LinkedList_SubList) -> int
     * Source: java/util/LinkedList.SubList.lsl:412
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = 1;
            if (this.length != 0) {
                Engine.assume(this.length > 0);
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                int i = this.offset;
                final int end = this.offset + this.length;
                for (i = i; i < end; i += 1) {
                    final Object item = rootStorage.get(i);
                    result = (31 * result) + LibSLRuntime.hashCode(item);
                }
                ;
                ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::indexOf(LinkedList_SubList, Object) -> int
     * Source: java/util/LinkedList.SubList.lsl:440
     */
    public int indexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _indexOfElement(o);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::isEmpty(LinkedList_SubList) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:447
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.length == 0;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::iterator(LinkedList_SubList) -> Iterator
     * Source: java/util/LinkedList.SubList.lsl:453
     */
    public Iterator iterator() {
        Iterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.LinkedList_SubList$ListIterator) ((Object) new LinkedList_SubList$ListIterator((Void) null, 
                /* state = */ LinkedList_SubList$ListIterator.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* sublist = */ this, 
                /* cursor = */ 0, 
                /* expectedModCount = */ this.modCount, 
                /* offset = */ this.offset, 
                /* size = */ this.length, 
                /* lastRet = */ -1
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::lastIndexOf(LinkedList_SubList, Object) -> int
     * Source: java/util/LinkedList.SubList.lsl:466
     */
    public int lastIndexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            if (this.length == 0) {
                result = -1;
            } else {
                Engine.assume(this.length > 0);
                final int end = this.offset + this.length;
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                result = LibSLRuntime.ListActions.find(rootStorage, o, this.offset, end);
                if (result != -1) {
                    final int nextIndex = result + 1;
                    if (nextIndex < end) {
                        final int rightIndex = LibSLRuntime.ListActions.find(rootStorage, o, nextIndex, end);
                        Engine.assume(rightIndex == -1);
                    }
                    result -= this.offset;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::listIterator(LinkedList_SubList) -> ListIterator
     * Source: java/util/LinkedList.SubList.lsl:500
     */
    public ListIterator listIterator() {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.LinkedList_SubList$ListIterator) ((Object) new LinkedList_SubList$ListIterator((Void) null, 
                /* state = */ LinkedList_SubList$ListIterator.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* sublist = */ this, 
                /* cursor = */ 0, 
                /* expectedModCount = */ this.modCount, 
                /* offset = */ this.offset, 
                /* size = */ this.length, 
                /* lastRet = */ -1
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::listIterator(LinkedList_SubList, int) -> ListIterator
     * Source: java/util/LinkedList.SubList.lsl:513
     */
    public ListIterator listIterator(int index) {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.LinkedList_SubList$ListIterator) ((Object) new LinkedList_SubList$ListIterator((Void) null, 
                /* state = */ LinkedList_SubList$ListIterator.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* sublist = */ this, 
                /* cursor = */ index, 
                /* expectedModCount = */ this.modCount, 
                /* offset = */ this.offset, 
                /* size = */ this.length, 
                /* lastRet = */ -1
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::parallelStream(LinkedList_SubList) -> Stream
     * Source: java/util/LinkedList.SubList.lsl:527
     */
    public Stream parallelStream() {
        Stream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _makeStream(true);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::remove(LinkedList_SubList, Object) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:534
     */
    public boolean remove(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            final int end = this.offset + this.length;
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int index = LibSLRuntime.ListActions.find(rootStorage, o, this.offset, end);
            result = index != -1;
            if (result) {
                ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
                ((LinkedList) ((Object) this.root))._unlinkAny(index);
                _updateSizeAndModCount(-1);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::remove(LinkedList_SubList, int) -> Object
     * Source: java/util/LinkedList.SubList.lsl:554
     */
    public Object remove(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkElementIndex(index, this.length);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            result = ((LinkedList) ((Object) this.root))._unlinkAny(effectiveIndex);
            _updateSizeAndModCount(-1);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::removeAll(LinkedList_SubList, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:568
     */
    public boolean removeAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _batchRemove(c, false);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::removeIf(LinkedList_SubList, Predicate) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:574
     */
    public boolean removeIf(Predicate filter) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int size = this.length;
            if (size != 0) {
                final int oldRootLength = ((LinkedList) ((Object) this.root)).storage.size();
                result = ((LinkedList) ((Object) this.root))._removeIf(filter, this.offset, this.offset + this.length);
                if (result) {
                    final int newRootLength = ((LinkedList) ((Object) this.root)).storage.size();
                    _updateSizeAndModCount(newRootLength - oldRootLength);
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::replaceAll(LinkedList_SubList, UnaryOperator) -> void
     * Source: java/util/LinkedList.SubList.lsl:598
     */
    public void replaceAll(UnaryOperator operator) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._replaceAllRange(operator, this.offset, this.offset + this.length);
        }
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::retainAll(LinkedList_SubList, Collection) -> boolean
     * Source: java/util/LinkedList.SubList.lsl:605
     */
    public boolean retainAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _batchRemove(c, true);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::set(LinkedList_SubList, int, Object) -> Object
     * Source: java/util/LinkedList.SubList.lsl:611
     */
    public Object set(int index, Object element) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkElementIndex(index, this.length);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final SymbolicList<Object> parentStorage = ((LinkedList) ((Object) this.root)).storage;
            final int effectiveIndex = this.offset + index;
            result = parentStorage.get(effectiveIndex);
            parentStorage.set(effectiveIndex, element);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::size(LinkedList_SubList) -> int
     * Source: java/util/LinkedList.SubList.lsl:625
     */
    public int size() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            result = this.length;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::sort(LinkedList_SubList, Comparator) -> void
     * Source: java/util/LinkedList.SubList.lsl:635
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._do_sort(this.offset, this.offset + this.length, c);
            this.modCount = ((LinkedList) ((Object) this.root)).modCount;
        }
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::spliterator(LinkedList_SubList) -> Spliterator
     * Source: java/util/LinkedList.SubList.lsl:643
     */
    public Spliterator spliterator() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.LinkedList_SubList$Spliterator) ((Object) new LinkedList_SubList$Spliterator((Void) null, 
                /* state = */ LinkedList_SubList$Spliterator.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* parent = */ this, 
                /* index = */ 0, 
                /* fence = */ -1, 
                /* expectedModCount = */ 0
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::stream(LinkedList_SubList) -> Stream
     * Source: java/util/LinkedList.SubList.lsl:653
     */
    public Stream stream() {
        Stream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _makeStream(false);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::subList(LinkedList_SubList, int, int) -> List
     * Source: java/util/LinkedList.SubList.lsl:659
     */
    public List subList(int fromIndex, int toIndex) {
        List result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._subListRangeCheck(fromIndex, toIndex, this.length);
            result = (stub.java.util.LinkedList_SubList) ((Object) new LinkedList_SubList((Void) null, 
                /* state = */ LinkedList_SubList.__$lsl_States.Initialized, 
                /* root = */ this.root, 
                /* parentList = */ this, 
                /* offset = */ this.offset + fromIndex, 
                /* length = */ toIndex - fromIndex, 
                /* modCount = */ this.modCount
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::toArray(LinkedList_SubList) -> array<Object>
     * Source: java/util/LinkedList.SubList.lsl:675
     */
    public Object[] toArray() {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            result = new Object[this.length];
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int end = this.offset + this.length;
            int i = 0;
            int j = 0;
            for (i = this.offset; i < end; i += 1) {
                result[j] = rootStorage.get(i);
                j += 1;
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::toArray(LinkedList_SubList, IntFunction) -> array<Object>
     * Source: java/util/LinkedList.SubList.lsl:700
     */
    public Object[] toArray(IntFunction generator) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = ((Object[]) generator.apply(0));
            final int aSize = a.length;
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            result = new Object[this.length];
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int end = this.offset + this.length;
            int i = 0;
            int j = 0;
            for (i = this.offset; i < end; i += 1) {
                result[j] = rootStorage.get(i);
                j += 1;
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::toArray(LinkedList_SubList, array<Object>) -> array<Object>
     * Source: java/util/LinkedList.SubList.lsl:722
     */
    public Object[] toArray(Object[] a) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((LinkedList) ((Object) this.root))._checkForComodification(this.modCount);
            final int aSize = a.length;
            if (aSize < this.length) {
                a = new Object[this.length];
            }
            result = a;
            final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
            final int end = this.offset + this.length;
            int i = 0;
            int j = 0;
            for (i = this.offset; i < end; i += 1) {
                result[j] = rootStorage.get(i);
                j += 1;
            }
            ;
            if (aSize > this.length) {
                result[aSize] = null;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedList_SubListAutomaton::toString(LinkedList_SubList) -> String
     * Source: java/util/LinkedList.SubList.lsl:749
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.length == 0) {
                result = "[]";
            } else {
                result = "[";
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((LinkedList) ((Object) this.root)).storage;
                int i = this.offset;
                final int end = this.offset + this.length;
                int counter = this.length;
                for (i = i; i < end; i += 1) {
                    final Object item = rootStorage.get(i);
                    result = result.concat(LibSLRuntime.toString(item));
                    counter -= 1;
                    if (counter != 0) {
                        result = result.concat(", ");
                    }
                }
                ;
                result = result.concat("]");
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(LinkedList_SubList.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
