// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Comparable;
import java.lang.IndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
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
 * LinkedListAutomaton for LinkedList ~> java.util.LinkedList
 */
@Approximate(java.util.LinkedList.class)
public class LinkedList extends AbstractSequentialList implements LibSLRuntime.Automaton, List, Deque, Cloneable, Serializable {
    private static final long serialVersionUID = 876323262645176354L;

    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public SymbolicList<Object> storage;

    public transient int size;

    public transient int modCount;

    @LibSLRuntime.AutomatonConstructor
    public LinkedList(Void __$lsl_token, final byte p0, final SymbolicList<Object> p1, final int p2,
            final int p3) {
        this.__$lsl_state = p0;
        this.storage = p1;
        this.size = p2;
        this.modCount = p3;
    }

    @LibSLRuntime.AutomatonConstructor
    public LinkedList(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0);
    }

    /**
     * [CONSTRUCTOR] LinkedListAutomaton::LinkedList(LinkedList) -> LinkedList
     */
    public LinkedList() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.storage = Engine.makeSymbolicList();
            this.size = 0;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] LinkedListAutomaton::LinkedList(LinkedList, Collection) -> LinkedList
     */
    public LinkedList(Collection c) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (c == null) {
                throw new NullPointerException();
            }
            this.storage = Engine.makeSymbolicList();
            this.size = 0;
            _addAllElements(this.size, c);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_checkForComodification(int) -> void
     */
    public void _checkForComodification(int expectedModCount) {
        /* body */ {
            if (this.modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_unlinkAny(int) -> Object
     */
    private Object _unlinkAny(int index) {
        Object result = null;
        /* body */ {
            result = this.storage.get(index);
            this.storage.remove(index);
            this.size -= 1;
            this.modCount += 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_linkAny(int, Object) -> void
     */
    private void _linkAny(int index, Object e) {
        /* body */ {
            this.storage.insert(index, e);
            this.size += 1;
            this.modCount += 1;
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_checkElementIndex(int) -> void
     */
    private void _checkElementIndex(int index) {
        /* body */ {
            if (!_isValidIndex(index)) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_isValidIndex(int) -> boolean
     */
    private boolean _isValidIndex(int index) {
        boolean result = false;
        /* body */ {
            result = (0 <= index) && (index < this.size);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_isPositionIndex(int) -> boolean
     */
    private boolean _isPositionIndex(int index) {
        boolean result = false;
        /* body */ {
            result = (0 <= index) && (index <= this.size);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_checkPositionIndex(int) -> void
     */
    private void _checkPositionIndex(int index) {
        /* body */ {
            if (!_isPositionIndex(index)) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_unlinkFirst() -> Object
     */
    private Object _unlinkFirst() {
        Object result = null;
        /* body */ {
            if (this.size == 0) {
                throw new NoSuchElementException();
            }
            result = _unlinkAny(0);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_unlinkByFirstEqualsObject(Object) -> boolean
     */
    private boolean _unlinkByFirstEqualsObject(Object o) {
        boolean result = false;
        /* body */ {
            final int index = LibSLRuntime.ListActions.find(this.storage, o, 0, this.size);
            result = index != -1;
            if (result) {
                this.storage.remove(index);
                this.size -= 1;
                this.modCount += 1;
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_addAllElements(int, Collection) -> boolean
     */
    private boolean _addAllElements(int index, Collection c) {
        boolean result = false;
        /* body */ {
            final Iterator iter = c.iterator();
            result = iter.hasNext();
            while (iter.hasNext()) {
                final Object item = iter.next();
                this.storage.insert(index, item);
                index += 1;
                this.size += 1;
            }
            ;
            this.modCount += 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_getFirstElement() -> Object
     */
    private Object _getFirstElement() {
        Object result = null;
        /* body */ {
            if (this.size == 0) {
                throw new NoSuchElementException();
            }
            result = this.storage.get(0);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_replaceAllRange(UnaryOperator, int, int) -> void
     */
    public void _replaceAllRange(UnaryOperator op, int i, int end) {
        /* body */ {
            final int expectedModCount = this.modCount;
            while ((this.modCount == expectedModCount) && (i < end)) {
                final Object oldItem = this.storage.get(i);
                final Object newItem = op.apply(oldItem);
                this.storage.set(i, newItem);
                i += 1;
            }
            ;
            _checkForComodification(expectedModCount);
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_removeIf(Predicate, int, int) -> boolean
     */
    public boolean _removeIf(Predicate filter, int start, int end) {
        boolean result = false;
        /* body */ {
            if (filter == null) {
                throw new NullPointerException();
            }
            final int oldSize = this.size;
            final int expectedModCount = this.modCount;
            Engine.assume(start <= end);
            int i = 0;
            for (i = end - 1; i > start; i += -1) {
                final Object item = this.storage.get(i);
                if (filter.test(item)) {
                    this.storage.remove(i);
                    this.size -= 1;
                }
            }
            ;
            _checkForComodification(expectedModCount);
            result = oldSize != this.size;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_equalsRange(List, int, int) -> boolean
     */
    public boolean _equalsRange(List other, int from, int to) {
        boolean result = false;
        /* body */ {
            result = true;
            int i = from;
            int otherLength = 0;
            SymbolicList<Object> otherStorage = null;
            if ((other != null && other.getClass() == LinkedList.class)) {
                otherLength = ((LinkedList) other).size;
                Engine.assume(otherLength >= 0);
                result = to == otherLength;
                if (result) {
                    otherStorage = ((LinkedList) other).storage;
                    Engine.assume(otherStorage != null);
                    while (result && (i < to)) {
                        final Object a = otherStorage.get(i);
                        final Object b = this.storage.get(i);
                        result = LibSLRuntime.equals(a, b);
                        i += 1;
                    }
                    ;
                }
            } else {
                final Iterator iter = other.iterator();
                while (result && (i < to) && iter.hasNext()) {
                    final Object a = iter.next();
                    final Object b = this.storage.get(i);
                    result = LibSLRuntime.equals(a, b);
                    i += 1;
                }
                ;
                result &= !iter.hasNext();
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_makeStream(boolean) -> Stream
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
     * [SUBROUTINE] LinkedListAutomaton::_batchRemove(Collection, boolean, int, int) -> boolean
     */
    public boolean _batchRemove(Collection c, boolean complement, int start, int end) {
        boolean result = false;
        /* body */ {
            final int oldSize = this.size;
            if ((oldSize == 0) || (start >= end)) {
                result = false;
            } else {
                final int otherLength = c.size();
                if (otherLength == 0) {
                    result = false;
                } else {
                    Engine.assume(otherLength > 0);
                    int i = 0;
                    start -= 1;
                    end -= 1;
                    if ((c != null && c.getClass() == LinkedList.class)) {
                        final SymbolicList<Object> otherStorage = ((LinkedList) c).storage;
                        Engine.assume(otherStorage != null);
                        for (i = end; i > start; i += -1) {
                            final Object item = this.storage.get(i);
                            if ((LibSLRuntime.ListActions.find(otherStorage, item, 0, this.size) == -1) == complement) {
                                _unlinkAny(i);
                            }
                        }
                        ;
                    } else {
                        for (i = end; i > start; i += -1) {
                            final Object item = this.storage.get(i);
                            if (c.contains(item) != complement) {
                                _unlinkAny(i);
                            }
                        }
                        ;
                    }
                    result = oldSize != this.size;
                }
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_do_sort(int, int, Comparator) -> void
     */
    public void _do_sort(int start, int end, Comparator c) {
        /* body */ {
            if (start < end) {
                final int expectedModCount = this.modCount;
                Engine.assume(start >= 0);
                Engine.assume(end > 0);
                final int outerLimit = end - 1;
                int innerLimit = 0;
                int i = 0;
                int j = 0;
                if (c == null) {
                    for (i = start; i < outerLimit; i += 1) {
                        innerLimit = (end - i) - 1;
                        for (j = start; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = this.storage.get(idxA);
                            final Object b = this.storage.get(idxB);
                            if (((Comparable) a).compareTo(b) > 0) {
                                this.storage.set(idxA, b);
                                this.storage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                } else {
                    for (i = start; i < outerLimit; i += 1) {
                        innerLimit = (end - i) - 1;
                        for (j = start; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = this.storage.get(idxA);
                            final Object b = this.storage.get(idxB);
                            if (c.compare(a, b) > 0) {
                                this.storage.set(idxA, b);
                                this.storage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                }
                _checkForComodification(expectedModCount);
            }
            this.modCount += 1;
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::add(LinkedList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(this.size, e);
            result = true;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::add(LinkedList, int, Object) -> void
     */
    public void add(int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkPositionIndex(index);
            _linkAny(index, element);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::addAll(LinkedList, Collection) -> boolean
     */
    public boolean addAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _addAllElements(this.size, c);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::addAll(LinkedList, int, Collection) -> boolean
     */
    public boolean addAll(int index, Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _addAllElements(index, c);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::addFirst(LinkedList, Object) -> void
     */
    public void addFirst(Object e) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(0, e);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::addLast(LinkedList, Object) -> void
     */
    public void addLast(Object e) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(this.size, e);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::clear(LinkedList) -> void
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.storage = Engine.makeSymbolicList();
            this.size = 0;
            this.modCount += 1;
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::clone(LinkedList) -> Object
     */
    public Object clone() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final SymbolicList<Object> storageCopy = Engine.makeSymbolicList();
            this.storage.copy(storageCopy, 0, 0, this.size);
            result = new LinkedList((Void) null, 
                /* state = */ LinkedList.__$lsl_States.Initialized, 
                /* storage = */ storageCopy, 
                /* size = */ this.size, 
                /* modCount = */ 0
            );
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::contains(LinkedList, Object) -> boolean
     */
    public boolean contains(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(this.storage, o, 0, this.size) != -1;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::containsAll(LinkedList, Collection) -> boolean
     */
    public boolean containsAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = true;
            if ((c != null && c.getClass() == LinkedList.class)) {
                final SymbolicList<Object> otherStorage = ((LinkedList) c).storage;
                final int otherSize = ((LinkedList) c).size;
                Engine.assume(otherStorage != null);
                Engine.assume(otherSize >= 0);
                int i = 0;
                while (result && (i < otherSize)) {
                    final Object item = otherStorage.get(i);
                    result = LibSLRuntime.ListActions.find(this.storage, item, 0, this.size) != -1;
                    i += 1;
                }
                ;
            } else {
                final Iterator iter = c.iterator();
                while (result && iter.hasNext()) {
                    final Object item = iter.next();
                    result = LibSLRuntime.ListActions.find(this.storage, item, 0, this.size) != -1;
                }
                ;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::descendingIterator(LinkedList) -> Iterator
     */
    public Iterator descendingIterator() {
        Iterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Iterator.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::element(LinkedList) -> Object
     */
    public Object element() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _getFirstElement();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::equals(LinkedList, Object) -> boolean
     */
    public boolean equals(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this == o) {
                result = true;
            } else {
                if ((o != null && o.getClass() == LinkedList.class)) {
                    final int expectedModCount = this.modCount;
                    final int otherExpectedModCount = ((LinkedList) o).modCount;
                    final SymbolicList<Object> otherStorage = ((LinkedList) o).storage;
                    final int otherSize = ((LinkedList) o).size;
                    if (this.size == otherSize) {
                        result = LibSLRuntime.equals(this.storage, otherStorage);
                    } else {
                        result = false;
                    }
                    ((LinkedList) o)._checkForComodification(otherExpectedModCount);
                    _checkForComodification(expectedModCount);
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::forEach(LinkedList, Consumer) -> void
     */
    public void forEach(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int expectedModCount = this.modCount;
            int i = 0;
            while ((this.modCount == expectedModCount) && (i < this.size)) {
                final Object item = this.storage.get(i);
                _action.accept(item);
                i += 1;
            }
            ;
            _checkForComodification(expectedModCount);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::get(LinkedList, int) -> Object
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkElementIndex(index);
            result = this.storage.get(index);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::getFirst(LinkedList) -> Object
     */
    public Object getFirst() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _getFirstElement();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::getLast(LinkedList) -> Object
     */
    public Object getLast() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                throw new NoSuchElementException();
            }
            result = this.storage.get(this.size - 1);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::hashCode(LinkedList) -> int
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.hashCode(this.storage);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::indexOf(LinkedList, Object) -> int
     */
    public int indexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(this.storage, o, 0, this.size);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::isEmpty(LinkedList) -> boolean
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.size == 0;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::iterator(LinkedList) -> Iterator
     */
    public Iterator iterator() {
        Iterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Iterator.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::lastIndexOf(LinkedList, Object) -> int
     */
    public int lastIndexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(this.storage, o, 0, this.size);
            if (result != -1) {
                final int nextIndex = result + 1;
                if (nextIndex < this.size) {
                    final int rightIndex = LibSLRuntime.ListActions.find(this.storage, o, nextIndex, this.size);
                    Engine.assume(rightIndex == -1);
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::listIterator(LinkedList) -> ListIterator
     */
    public ListIterator listIterator() {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(ListIterator.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::listIterator(LinkedList, int) -> ListIterator
     */
    public ListIterator listIterator(int index) {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkPositionIndex(index);
            result = Engine.makeSymbolic(ListIterator.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::offer(LinkedList, Object) -> boolean
     */
    public boolean offer(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(this.size, e);
            result = true;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::offerFirst(LinkedList, Object) -> boolean
     */
    public boolean offerFirst(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(0, e);
            result = true;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::offerLast(LinkedList, Object) -> boolean
     */
    public boolean offerLast(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(this.size, e);
            result = true;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::parallelStream(LinkedList) -> Stream
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
     * [FUNCTION] LinkedListAutomaton::peek(LinkedList) -> Object
     */
    public Object peek() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = this.storage.get(0);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::peekFirst(LinkedList) -> Object
     */
    public Object peekFirst() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = this.storage.get(0);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::peekLast(LinkedList) -> Object
     */
    public Object peekLast() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = this.storage.get(this.size - 1);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::poll(LinkedList) -> Object
     */
    public Object poll() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = _unlinkAny(0);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::pollFirst(LinkedList) -> Object
     */
    public Object pollFirst() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = _unlinkAny(0);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::pollLast(LinkedList) -> Object
     */
    public Object pollLast() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                result = null;
            } else {
                result = _unlinkAny(this.size - 1);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::pop(LinkedList) -> Object
     */
    public Object pop() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _unlinkFirst();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::push(LinkedList, Object) -> void
     */
    public void push(Object e) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(0, e);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::remove(LinkedList) -> Object
     */
    public Object remove() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _unlinkFirst();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::remove(LinkedList, Object) -> boolean
     */
    public boolean remove(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _unlinkByFirstEqualsObject(o);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::remove(LinkedList, int) -> Object
     */
    public Object remove(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkElementIndex(index);
            result = _unlinkAny(index);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeAll(LinkedList, Collection) -> boolean
     */
    public boolean removeAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _batchRemove(c, false, 0, this.size);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeFirst(LinkedList) -> Object
     */
    public Object removeFirst() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _unlinkFirst();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeFirstOccurrence(LinkedList, Object) -> boolean
     */
    public boolean removeFirstOccurrence(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _unlinkByFirstEqualsObject(o);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeIf(LinkedList, Predicate) -> boolean
     */
    public boolean removeIf(Predicate filter) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _removeIf(filter, 0, this.size);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeLast(LinkedList) -> Object
     */
    public Object removeLast() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.size == 0) {
                throw new NoSuchElementException();
            }
            result = _unlinkAny(this.size - 1);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::removeLastOccurrence(LinkedList, Object) -> boolean
     */
    public boolean removeLastOccurrence(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int index = LibSLRuntime.ListActions.find(this.storage, o, 0, this.size);
            if (index == -1) {
                result = false;
            } else {
                result = true;
                final int nextIndex = index + 1;
                if (nextIndex < this.size) {
                    final int rightIndex = LibSLRuntime.ListActions.find(this.storage, o, nextIndex, this.size);
                    Engine.assume(rightIndex == -1);
                }
                this.storage.remove(index);
                this.size -= 1;
                this.modCount += 1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::replaceAll(LinkedList, UnaryOperator) -> void
     */
    public void replaceAll(UnaryOperator op) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (op == null) {
                throw new NullPointerException();
            }
            _replaceAllRange(op, 0, this.size);
            this.modCount += 1;
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::retainAll(LinkedList, Collection) -> boolean
     */
    public boolean retainAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _batchRemove(c, true, 0, this.size);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::set(LinkedList, int, Object) -> Object
     */
    public Object set(int index, Object element) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkElementIndex(index);
            result = this.storage.get(index);
            this.storage.set(index, element);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::size(LinkedList) -> int
     */
    public int size() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.size;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::sort(LinkedList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _do_sort(0, this.size, c);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::spliterator(LinkedList) -> Spliterator
     */
    public Spliterator spliterator() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Spliterator.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::stream(LinkedList) -> Stream
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
     * [FUNCTION] LinkedListAutomaton::subList(LinkedList, int, int) -> List
     */
    public List subList(int fromIndex, int toIndex) {
        List result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::toArray(LinkedList) -> array<Object>
     */
    public Object[] toArray() {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int len = this.size;
            result = new Object[len];
            int i = 0;
            for (i = 0; i < len; i += 1) {
                result[i] = this.storage.get(i);
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::toArray(LinkedList, IntFunction) -> array<Object>
     */
    public Object[] toArray(IntFunction generator) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = ((Object[]) generator.apply(0));
            final int aLen = a.length;
            final int len = this.size;
            result = new Object[len];
            int i = 0;
            for (i = 0; i < len; i += 1) {
                result[i] = this.storage.get(i);
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::toArray(LinkedList, array<Object>) -> array<Object>
     */
    public Object[] toArray(Object[] a) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int aLen = a.length;
            final int len = this.size;
            int i = 0;
            if (aLen < len) {
                result = new Object[len];
                for (i = 0; i < len; i += 1) {
                    result[i] = this.storage.get(i);
                }
                ;
            } else {
                result = a;
                for (i = 0; i < len; i += 1) {
                    result[i] = this.storage.get(i);
                }
                ;
                if (aLen > len) {
                    result[len] = null;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::toString(LinkedList) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.toString(this.storage);
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(LinkedList.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
