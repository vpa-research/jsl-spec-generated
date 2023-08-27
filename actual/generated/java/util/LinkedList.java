// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.Serializable;
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
    public LibSLRuntime.Token __$lsl_token = null;

    public byte __$lsl_state = __$lsl_States.Allocated;

    public SymbolicList<Object> storage;

    public transient int size;

    public transient int modCount = 0;

    @LibSLRuntime.AutomatonConstructor
    public LinkedList(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final SymbolicList<Object> storage, final int size, final int modCount) {
        this.__$lsl_token = __$lsl_token;
        this.__$lsl_state = __$lsl_state;
        this.storage = storage;
        this.size = size;
        this.modCount = modCount;
    }

    @LibSLRuntime.AutomatonConstructor
    public LinkedList(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0);
    }

    /**
     * [CONSTRUCTOR] LinkedListAutomaton::LinkedList(LinkedList) -> LinkedList
     */
    public LinkedList() {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            storage = Engine.makeSymbolicList();
            size = 0;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] LinkedListAutomaton::LinkedList(LinkedList, Collection) -> LinkedList
     */
    public LinkedList(Collection c) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (c == null) {
                throw new NullPointerException();
            }
            storage = Engine.makeSymbolicList();
            size = 0;
            _addAllElements(size, c);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_unlinkAny(int) -> Object
     */
    private Object _unlinkAny(int index) {
        Object result = null;
        /* body */ {
            result = storage.get(index);
            storage.remove(index);
            size -= 1;
            modCount += 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_linkAny(int, Object) -> void
     */
    private void _linkAny(int index, Object e) {
        /* body */ {
            storage.insert(index, e);
            size += 1;
            modCount += 1;
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_checkElementIndex(int) -> void
     */
    private void _checkElementIndex(int index) {
        /* body */ {
            if (!_isValidIndex(index)) {
                final String message = "Index: ".concat(LibSLRuntime.toString(index)).concat(", Size: ").concat(LibSLRuntime.toString(size));
                throw new IndexOutOfBoundsException(message);
            }
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_isValidIndex(int) -> boolean
     */
    private boolean _isValidIndex(int index) {
        boolean result = false;
        /* body */ {
            result = (0 <= index) && (index < size);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_isPositionIndex(int) -> boolean
     */
    private boolean _isPositionIndex(int index) {
        boolean result = false;
        /* body */ {
            result = (0 <= index) && (index <= size);
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_checkPositionIndex(int) -> void
     */
    private void _checkPositionIndex(int index) {
        /* body */ {
            if (!_isPositionIndex(index)) {
                final String message = "Index: ".concat(LibSLRuntime.toString(index)).concat(", Size: ").concat(LibSLRuntime.toString(size));
                throw new IndexOutOfBoundsException(message);
            }
        }
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_unlinkFirst() -> Object
     */
    private Object _unlinkFirst() {
        Object result = null;
        /* body */ {
            if (size == 0) {
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
            final int index = LibSLRuntime.ListActions.find(storage, o, 0, size);
            result = index >= 0;
            if (result) {
                storage.remove(index);
                size -= 1;
                modCount += 1;
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
                storage.insert(index, item);
                index += 1;
                size += 1;
            }
            ;
            modCount += 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LinkedListAutomaton::_getFirstElement() -> Object
     */
    private Object _getFirstElement() {
        Object result = null;
        /* body */ {
            if (size == 0) {
                throw new NoSuchElementException();
            }
            result = storage.get(0);
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::add(LinkedList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _linkAny(size, e);
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
            result = _addAllElements(size, c);
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
            _linkAny(size, e);
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::clear(LinkedList) -> void
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            storage = Engine.makeSymbolicList();
            size = 0;
            modCount += 1;
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
            storage.copy(storageCopy, 0, 0, size);
            result = new LinkedList(LibSLRuntime.Token.INSTANCE, LinkedList.__$lsl_States.Initialized, storageCopy, size, 0);
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
            result = LibSLRuntime.ListActions.find(storage, o, 0, size) >= 0;
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
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            final int expectedModCount = modCount;
            final int length = size;
            int i = 0;
            while ((modCount == expectedModCount) && (i < length)) {
                final Object item = storage.get(i);
                _action.accept(item);
                i += 1;
            }
            ;
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
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
            result = storage.get(index);
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
            if (size == 0) {
                throw new NoSuchElementException();
            }
            result = storage.get(size - 1);
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
            result = LibSLRuntime.hashCode(storage);
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
            result = LibSLRuntime.ListActions.find(storage, o, 0, size);
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
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            result = LibSLRuntime.ListActions.find(storage, o, 0, size);
            if (result != -1) {
                final int nextIndex = result + 1;
                if (nextIndex < size) {
                    final int rightIndex = LibSLRuntime.ListActions.find(storage, o, nextIndex, size);
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
            _linkAny(size, e);
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
            _linkAny(size, e);
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
            LibSLRuntime.todo();
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
            if (size == 0) {
                result = null;
            } else {
                result = storage.get(0);
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
            if (size == 0) {
                result = null;
            } else {
                result = storage.get(0);
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
            if (size == 0) {
                result = null;
            } else {
                result = storage.get(size - 1);
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
            if (size == 0) {
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
            if (size == 0) {
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
            if (size == 0) {
                result = null;
            } else {
                result = _unlinkAny(size - 1);
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
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            if (size == 0) {
                throw new NoSuchElementException();
            }
            result = _unlinkAny(size - 1);
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
            final int index = LibSLRuntime.ListActions.find(storage, o, 0, size);
            if (index == -1) {
                result = false;
            } else {
                result = true;
                final int nextIndex = index + 1;
                if (nextIndex < size) {
                    final int rightIndex = LibSLRuntime.ListActions.find(storage, o, nextIndex, size);
                    Engine.assume(rightIndex == -1);
                }
                storage.remove(index);
                size -= 1;
                modCount += 1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::replaceAll(LinkedList, UnaryOperator) -> void
     */
    public void replaceAll(UnaryOperator operator) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
    }

    /**
     * [FUNCTION] LinkedListAutomaton::retainAll(LinkedList, Collection) -> boolean
     */
    public boolean retainAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
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
            storage.set(index, element);
            result = storage.get(index);
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
            result = size;
        }
        return result;
    }

    /**
     * [FUNCTION] LinkedListAutomaton::sort(LinkedList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            LibSLRuntime.todo();
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
            final int length = size;
            int i = 0;
            if (aLen < length) {
                result = new Object[length];
                for (i = 0; i < length; i += 1) {
                    result[i] = storage.get(i);
                }
                ;
            } else {
                result = a;
                for (i = 0; i < length; i += 1) {
                    result[i] = storage.get(i);
                }
                ;
                if (aLen > length) {
                    result[length] = null;
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
            result = LibSLRuntime.toString(storage);
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(LinkedList.class)
    public static final class __hook {
        private __hook(Void o) {
            Engine.assume(false);
        }
    }
}
