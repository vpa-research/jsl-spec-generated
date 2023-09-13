// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
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
 * ArrayListAutomaton for ArrayList ~> java.util.ArrayList
 */
@Approximate(java.util.ArrayList.class)
public class ArrayList extends AbstractList implements LibSLRuntime.Automaton, List, RandomAccess, Cloneable, Serializable {
    static {
    }

    public LibSLRuntime.Token __$lsl_token = null;

    public byte __$lsl_state = __$lsl_States.Allocated;

    public SymbolicList<Object> storage;

    public transient int length;

    public transient int modCount = 0;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final SymbolicList<Object> storage, final int length, final int modCount) {
        this.__$lsl_token = __$lsl_token;
        this.__$lsl_state = __$lsl_state;
        this.storage = storage;
        this.length = length;
        this.modCount = modCount;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0, 0);
    }

    /**
     * [CONSTRUCTOR] ArrayListAutomaton::ArrayList(ArrayList) -> ArrayList
     */
    public ArrayList() {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            storage = Engine.makeSymbolicList();
            length = 0;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] ArrayListAutomaton::ArrayList(ArrayList, Collection) -> ArrayList
     */
    public ArrayList(Collection c) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (c == null) {
                throw new NullPointerException();
            }
            storage = Engine.makeSymbolicList();
            length = 0;
            _addAllElements(0, c);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] ArrayListAutomaton::ArrayList(ArrayList, int) -> ArrayList
     */
    public ArrayList(int initialCapacity) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException();
            }
            storage = Engine.makeSymbolicList();
            length = 0;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_checkValidIndex(int, int) -> void
     */
    public void _checkValidIndex(int index, int length) {
        /* body */ {
            if ((index < 0) || (length <= index)) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_rangeCheckForAdd(int) -> void
     */
    public void _rangeCheckForAdd(int index) {
        /* body */ {
            if ((index > length) || (index < 0)) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_addAllElements(int, Collection) -> boolean
     */
    public boolean _addAllElements(int index, Collection c) {
        boolean result = false;
        /* body */ {
            final int oldLength = length;
            if ((c instanceof ArrayList && ((ArrayList) c).__$lsl_token != null)) {
                final SymbolicList<Object> otherStorage = ((ArrayList) c).storage;
                final int otherLength = ((ArrayList) c).length;
                Engine.assume(otherStorage != null);
                Engine.assume(otherLength >= 0);
                int i = 0;
                for (i = 0; i < otherLength; i += 1) {
                    final Object item = otherStorage.get(i);
                    storage.insert(index, item);
                    index += 1;
                    length += 1;
                }
                ;
            } else {
                final Iterator iter = c.iterator();
                while (iter.hasNext()) {
                    final Object item = iter.next();
                    storage.insert(index, item);
                    index += 1;
                    length += 1;
                }
                ;
            }
            result = oldLength != length;
            if (result) {
                modCount += 1;
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_subListRangeCheck(int, int, int) -> void
     */
    public void _subListRangeCheck(int fromIndex, int toIndex, int size) {
        /* body */ {
            if (fromIndex < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (toIndex > size) {
                throw new IndexOutOfBoundsException();
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_checkForComodification(int) -> void
     */
    public void _checkForComodification(int expectedModCount) {
        /* body */ {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_deleteElement(int) -> Object
     */
    public Object _deleteElement(int index) {
        Object result = null;
        /* body */ {
            _checkValidIndex(index, length);
            result = storage.get(index);
            storage.remove(index);
            length -= 1;
            modCount += 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_addElement(int, Object) -> void
     */
    public void _addElement(int index, Object element) {
        /* body */ {
            _rangeCheckForAdd(index);
            storage.insert(index, element);
            length += 1;
            modCount += 1;
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_setElement(int, Object) -> Object
     */
    private Object _setElement(int index, Object element) {
        Object result = null;
        /* body */ {
            _checkValidIndex(index, length);
            result = storage.get(index);
            storage.set(index, element);
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_replaceAllRange(int, int, UnaryOperator) -> void
     */
    private void _replaceAllRange(int i, int end, UnaryOperator op) {
        /* body */ {
            final int expectedModCount = modCount;
            while ((modCount == expectedModCount) && (i < end)) {
                final Object oldItem = storage.get(i);
                final Object newItem = op.apply(oldItem);
                storage.set(i, newItem);
                i += 1;
            }
            ;
            _checkForComodification(expectedModCount);
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_removeIf(Predicate, int, int) -> boolean
     */
    public boolean _removeIf(Predicate filter, int start, int end) {
        boolean result = false;
        /* body */ {
            if (filter == null) {
                throw new NullPointerException();
            }
            final int oldLength = length;
            final int expectedModCount = modCount;
            int i = 0;
            for (i = end - 1; i > start; i += -1) {
                final Object item = storage.get(i);
                if (filter.test(item)) {
                    storage.remove(i);
                    length -= 1;
                }
            }
            ;
            _checkForComodification(expectedModCount);
            result = oldLength != length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::add(ArrayList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            storage.insert(length, e);
            length += 1;
            modCount += 1;
            result = true;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::add(ArrayList, int, Object) -> void
     */
    public void add(int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _addElement(index, element);
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::addAll(ArrayList, Collection) -> boolean
     */
    public boolean addAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _addAllElements(length, c);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::addAll(ArrayList, int, Collection) -> boolean
     */
    public boolean addAll(int index, Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _rangeCheckForAdd(index);
            result = _addAllElements(index, c);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::clear(ArrayList) -> void
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            storage = Engine.makeSymbolicList();
            length = 0;
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::clone(ArrayList) -> Object
     */
    public Object clone() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final SymbolicList<Object> storageCopy = Engine.makeSymbolicList();
            storage.copy(storageCopy, 0, 0, length);
            result = new ArrayList(LibSLRuntime.Token.INSTANCE, ArrayList.__$lsl_States.Initialized, storageCopy, length, 0);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::contains(ArrayList, Object) -> boolean
     */
    public boolean contains(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(storage, o, 0, length) >= 0;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::containsAll(ArrayList, Collection) -> boolean
     */
    public boolean containsAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = true;
            if ((c instanceof ArrayList && ((ArrayList) c).__$lsl_token != null)) {
                final SymbolicList<Object> otherStorage = ((ArrayList) c).storage;
                final int otherLength = ((ArrayList) c).length;
                Engine.assume(otherStorage != null);
                Engine.assume(otherLength >= 0);
                int i = 0;
                while (result && (i < otherLength)) {
                    final Object item = otherStorage.get(i);
                    result = LibSLRuntime.ListActions.find(storage, item, 0, length) >= 0;
                    i += 1;
                }
                ;
            } else {
                final Iterator iter = c.iterator();
                while (result && iter.hasNext()) {
                    final Object item = iter.next();
                    result = LibSLRuntime.ListActions.find(storage, item, 0, length) >= 0;
                }
                ;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::ensureCapacity(ArrayList, int) -> void
     */
    public void ensureCapacity(int minCapacity) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::equals(ArrayList, Object) -> boolean
     */
    public boolean equals(Object other) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == this) {
                result = true;
            } else {
                if ((other instanceof ArrayList && ((ArrayList) other).__$lsl_token != null)) {
                    final int expectedModCount = modCount;
                    final int otherExpectedModCount = ((ArrayList) other).modCount;
                    final SymbolicList<Object> otherStorage = ((ArrayList) other).storage;
                    final int otherLength = ((ArrayList) other).length;
                    if (length == otherLength) {
                        result = LibSLRuntime.equals(storage, otherStorage);
                    } else {
                        result = false;
                    }
                    ((ArrayList) other)._checkForComodification(otherExpectedModCount);
                    _checkForComodification(expectedModCount);
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::forEach(ArrayList, Consumer) -> void
     */
    public void forEach(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int expectedModCount = modCount;
            int i = 0;
            while ((modCount == expectedModCount) && (i < length)) {
                final Object item = storage.get(i);
                _action.accept(item);
                i += 1;
            }
            ;
            _checkForComodification(expectedModCount);
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::get(ArrayList, int) -> Object
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkValidIndex(index, length);
            result = storage.get(index);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::hashCode(ArrayList) -> int
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
     * [FUNCTION] ArrayListAutomaton::indexOf(ArrayList, Object) -> int
     */
    public int indexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(storage, o, 0, length);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::isEmpty(ArrayList) -> boolean
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = length == 0;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::iterator(ArrayList) -> Iterator
     */
    public Iterator iterator() {
        Iterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = new ArrayList_ListItr(LibSLRuntime.Token.INSTANCE, ArrayList_ListItr.__$lsl_States.Initialized, this, 0, modCount, -1);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::lastIndexOf(ArrayList, Object) -> int
     */
    public int lastIndexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.ListActions.find(storage, o, 0, length);
            if (result != -1) {
                final int nextIndex = result + 1;
                if (nextIndex < length) {
                    final int rightIndex = LibSLRuntime.ListActions.find(storage, o, nextIndex, length);
                    Engine.assume(rightIndex == -1);
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::listIterator(ArrayList) -> ListIterator
     */
    public ListIterator listIterator() {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = new ArrayList_ListItr(LibSLRuntime.Token.INSTANCE, ArrayList_ListItr.__$lsl_States.Initialized, this, 0, modCount, -1);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::listIterator(ArrayList, int) -> ListIterator
     */
    public ListIterator listIterator(int index) {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _rangeCheckForAdd(index);
            result = new ArrayList_ListItr(LibSLRuntime.Token.INSTANCE, ArrayList_ListItr.__$lsl_States.Initialized, this, index, modCount, -1);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::parallelStream(ArrayList) -> Stream
     */
    public Stream parallelStream() {
        Stream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Stream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::remove(ArrayList, Object) -> boolean
     */
    public boolean remove(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int index = LibSLRuntime.ListActions.find(storage, o, 0, length);
            result = index >= 0;
            if (result) {
                _deleteElement(index);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::remove(ArrayList, int) -> Object
     */
    public Object remove(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _deleteElement(index);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::removeAll(ArrayList, Collection) -> boolean
     */
    public boolean removeAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int oldLength = length;
            if ((c instanceof ArrayList && ((ArrayList) c).__$lsl_token != null)) {
                final SymbolicList<Object> otherStorage = ((ArrayList) c).storage;
                final int otherLength = ((ArrayList) c).length;
                Engine.assume(otherStorage != null);
                Engine.assume(otherLength >= 0);
                int i = 0;
                for (i = 0; i < otherLength; i += 1) {
                    final Object o = otherStorage.get(i);
                    final int index = LibSLRuntime.ListActions.find(storage, o, 0, length);
                    if (index >= 0) {
                        _deleteElement(index);
                    }
                }
                ;
            } else {
                final Iterator iter = c.iterator();
                while (iter.hasNext()) {
                    final Object o = iter.next();
                    final int index = LibSLRuntime.ListActions.find(storage, o, 0, length);
                    if (index >= 0) {
                        _deleteElement(index);
                    }
                }
                ;
            }
            result = oldLength != length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::removeIf(ArrayList, Predicate) -> boolean
     */
    public boolean removeIf(Predicate filter) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _removeIf(filter, 0, length);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::replaceAll(ArrayList, UnaryOperator) -> void
     */
    public void replaceAll(UnaryOperator op) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (op == null) {
                throw new NullPointerException();
            }
            _replaceAllRange(0, length, op);
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::retainAll(ArrayList, Collection) -> boolean
     */
    public boolean retainAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int oldLength = length;
            int i = 0;
            if ((c instanceof ArrayList && ((ArrayList) c).__$lsl_token != null)) {
                final SymbolicList<Object> otherStorage = ((ArrayList) c).storage;
                final int otherLength = ((ArrayList) c).length;
                Engine.assume(otherStorage != null);
                Engine.assume(otherLength >= 0);
                for (i = length - 1; i > 0; i += -1) {
                    final Object item = storage.get(i);
                    final boolean otherHasItem = LibSLRuntime.ListActions.find(otherStorage, item, 0, otherLength) >= 0;
                    if (!otherHasItem) {
                        _deleteElement(i);
                    }
                }
                ;
            } else {
                for (i = length - 1; i > 0; i += -1) {
                    final Object item = storage.get(i);
                    final boolean otherHasItem = c.contains(item);
                    if (!otherHasItem) {
                        _deleteElement(i);
                    }
                }
                ;
            }
            result = oldLength != length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::set(ArrayList, int, Object) -> Object
     */
    public Object set(int index, Object element) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _setElement(index, element);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::size(ArrayList) -> int
     */
    public int size() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::sort(ArrayList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (length != 0) {
                final int expectedModCount = modCount;
                Engine.assume(length > 0);
                final int outerLimit = length - 1;
                int innerLimit = 0;
                int i = 0;
                int j = 0;
                if (c == null) {
                    for (i = 0; i < outerLimit; i += 1) {
                        innerLimit = (length - i) - 1;
                        for (j = 0; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = storage.get(idxA);
                            final Object b = storage.get(idxB);
                            if (((Comparable) a).compareTo(b) > 0) {
                                storage.set(idxA, b);
                                storage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                } else {
                    for (i = 0; i < outerLimit; i += 1) {
                        innerLimit = (length - i) - 1;
                        for (j = 0; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = storage.get(idxA);
                            final Object b = storage.get(idxB);
                            if (c.compare(a, b) > 0) {
                                storage.set(idxA, b);
                                storage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                }
                _checkForComodification(expectedModCount);
            }
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::spliterator(ArrayList) -> Spliterator
     */
    public Spliterator spliterator() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = new ArrayList_Spliterator(LibSLRuntime.Token.INSTANCE, ArrayList_Spliterator.__$lsl_States.Initialized, this, 0, -1, 0);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::stream(ArrayList) -> Stream
     */
    public Stream stream() {
        Stream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Stream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::subList(ArrayList, int, int) -> List
     */
    public List subList(int fromIndex, int toIndex) {
        List result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _subListRangeCheck(fromIndex, toIndex, length);
            result = new ArrayList_SubList(LibSLRuntime.Token.INSTANCE, ArrayList_SubList.__$lsl_States.Initialized, this, null, fromIndex, toIndex - fromIndex, modCount);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::toArray(ArrayList) -> array<Object>
     */
    public Object[] toArray() {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int len = length;
            result = new Object[len];
            int i = 0;
            for (i = 0; i < len; i += 1) {
                result[i] = storage.get(i);
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::toArray(ArrayList, IntFunction) -> array<Object>
     */
    public Object[] toArray(IntFunction generator) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = ((Object[]) generator.apply(0));
            final int aLen = a.length;
            final int len = length;
            result = new Object[len];
            int i = 0;
            for (i = 0; i < len; i += 1) {
                result[i] = storage.get(i);
            }
            ;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::toArray(ArrayList, array<Object>) -> array<Object>
     */
    public Object[] toArray(Object[] a) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int aLen = a.length;
            final int len = length;
            if (aLen < len) {
                a = new Object[len];
            }
            result = a;
            int i = 0;
            for (i = 0; i < len; i += 1) {
                result[i] = storage.get(i);
            }
            ;
            if (aLen > len) {
                result[len] = null;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::toString(ArrayList) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.toString(storage);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::trimToSize(ArrayList) -> void
     */
    public void trimToSize() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::writeObject(ArrayList, ObjectOutputStream) -> void
     */
    private void writeObject(ObjectOutputStream s) throws java.io.IOException {
        /* body */ {
            LibSLRuntime.not_implemented(/* no serialization support yet */);
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::readObject(ArrayList, ObjectInputStream) -> void
     */
    private void readObject(ObjectInputStream s) throws java.io.IOException,
            java.lang.ClassNotFoundException {
        /* body */ {
            LibSLRuntime.not_implemented(/* no serialization support yet */);
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(ArrayList.class)
    public static final class __hook {
        private __hook(Void o) {
            Engine.assume(false);
        }
    }
}
