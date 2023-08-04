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
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

@Approximate(java.util.ArrayList.class)
public class ArrayList extends AbstractList implements LibSLRuntime.Automaton, List, RandomAccess, Cloneable, Serializable {
    public byte __$lsl_state = __$lsl_States.Allocated;

    public SymbolicList<Object> storage;

    public int length;

    public int modCount;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final SymbolicList<Object> storage, final int length, final int modCount) {
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
     * [CONSTRUCTOR] ArrayListAutomaton::ArrayList(ArrayList, int) -> ArrayList
     */
    public ArrayList(int initialCapacity) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialCapacity < 0) {
                final String message = "Illegal Capacity: ".concat(LibSLRuntime.toString(initialCapacity));
                throw new IllegalArgumentException(message);
            }
            storage = Engine.makeSymbolicList();
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] ArrayListAutomaton::ArrayList(ArrayList) -> ArrayList
     */
    public ArrayList() {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            storage = Engine.makeSymbolicList();
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
            storage = Engine.makeSymbolicList();
            LibSLRuntime.not_implemented();
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_checkValidIndex(int) -> void
     */
    public void _checkValidIndex() {
        /* body */ {
            if ((index < 0) || (length <= index)) {
                final String idx = LibSLRuntime.toString(index);
                final String len = LibSLRuntime.toString(length);
                final String message = "Index ".concat(idx).concat(" out of bounds for length ").concat(len);
                throw new IndexOutOfBoundsException(message);
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_rangeCheckForAdd(int) -> void
     */
    public void _rangeCheckForAdd() {
        /* body */ {
            if ((index > length) || (index < 0)) {
                final String idx = LibSLRuntime.toString(index);
                final String len = LibSLRuntime.toString(length);
                final String message = "Index: ".concat(idx).concat(", Size: ").concat(len);
                throw new IndexOutOfBoundsException(message);
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_addAllElements(int, Collection) -> boolean
     */
    public boolean _addAllElements(Collection c) {
        boolean result = false;
        /* body */ {
            modCount += 1;
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_subListRangeCheck(int, int, int) -> void
     */
    public void _subListRangeCheck(int toIndex, int size) {
        /* body */ {
            if (fromIndex < 0) {
                final String message = "fromIndex = ".concat(LibSLRuntime.toString(fromIndex));
                throw new IndexOutOfBoundsException(message);
            }
            if (toIndex > size) {
                final String message = "toIndex = ".concat(LibSLRuntime.toString(toIndex));
                throw new IndexOutOfBoundsException(message);
            }
            if (fromIndex > toIndex) {
                final String from = LibSLRuntime.toString(fromIndex);
                final String to = LibSLRuntime.toString(toIndex);
                final String message = "fromIndex(".concat(from).concat(") > toIndex(").concat(to).concat(")");
                throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_checkForComodification(int) -> void
     */
    public void _checkForComodification() {
        /* body */ {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_deleteElement(int) -> Object
     */
    public Object _deleteElement() {
        Object result = null;
        /* body */ {
            _checkValidIndex(index);
            result = storage.get(index);
            storage.remove(index);
            modCount += 1;
            length -= 1;
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_addElement(int, Object) -> void
     */
    public void _addElement(Object element) {
        /* body */ {
            _rangeCheckForAdd(index);
            modCount += 1;
            storage.insert(index, element);
            length += 1;
        }
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_setElement(int, Object) -> Object
     */
    public Object _setElement(Object element) {
        Object result = null;
        /* body */ {
            _checkValidIndex(index);
            result = storage.get(index);
            storage.set(index, element);
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayListAutomaton::_throwNPE() -> void
     */
    public void _throwNPE() {
        /* body */ {
            throw new NullPointerException();
        }
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
     * [FUNCTION] ArrayListAutomaton::ensureCapacity(ArrayList, int) -> void
     */
    public void ensureCapacity(int minCapacity) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            modCount += 1;
        }
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
     * [FUNCTION] ArrayListAutomaton::lastIndexOf(ArrayList, Object) -> int
     */
    public int lastIndexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
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
     * [FUNCTION] ArrayListAutomaton::toArray(ArrayList) -> array<Object>
     */
    public Object[] toArray() {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int size = length;
            result = new Object[size];
            int i = 0;
            for (i = 0; i < size; i += 1) {
                final Object item = storage.get(i);
                result[i] = item;
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
        /* body */ {
            final int aLen = a.length;
            final int size = length;
            int i = 0;
            if (aLen < size) {
                result = new Object[size];
                for (i = 0; i < size; i += 1) {
                    final Object item = storage.get(i);
                    result[i] = item;
                }
                ;
            } else {
                result = a;
                for (i = 0; i < size; i += 1) {
                    final Object item = storage.get(i);
                    result[i] = item;
                }
                ;
                if (aLen > size) {
                    result[size] = null;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::get(ArrayList, int) -> Object
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkValidIndex(index);
            result = storage.get(index);
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
     * [FUNCTION] ArrayListAutomaton::add(ArrayList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            modCount += 1;
            storage.insert(length, e);
            length += 1;
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
     * [FUNCTION] ArrayListAutomaton::equals(ArrayList, Object) -> boolean
     */
    public boolean equals(Object other) {
        boolean result = false;
        /* body */ {
            if (other == this) {
                result = true;
            } else {
                final boolean isSameType = Engine.typeEquals(this, other);
                if (isSameType) {
                    final int expectedModCount = modCount;
                    final int otherExpectedModCount = LibSLRuntime.getAutomatonFrom(other, ArrayList.class).modCount;
                    final SymbolicList<Object> otherStorage = LibSLRuntime.getAutomatonFrom(other, ArrayList.class).storage;
                    final int otherLength = LibSLRuntime.getAutomatonFrom(other, ArrayList.class).length;
                    if (length == otherLength) {
                        result = LibSLRuntime.equals(storage, otherStorage);
                    } else {
                        result = false;
                    }
                    other._checkForComodification(otherExpectedModCount);
                    _checkForComodification(expectedModCount);
                } else {
                    result = false;
                }
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
            LibSLRuntime.not_implemented();
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
     * [FUNCTION] ArrayListAutomaton::remove(ArrayList, Object) -> boolean
     */
    public boolean remove(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int index = LibSLRuntime.ListActions.find(storage, o, 0, length);
            if (index == -1) {
                result = false;
            } else {
                storage.remove(index);
                result = true;
            }
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
     * [FUNCTION] ArrayListAutomaton::removeAll(ArrayList, Collection) -> boolean
     */
    public boolean removeAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::retainAll(ArrayList, Collection) -> boolean
     */
    public boolean retainAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::writeObject(ArrayList, ObjectOutputStream) -> void
     */
    private void writeObject(ObjectOutputStream s) throws java.io.IOException {
        /* body */ {
            LibSLRuntime.not_implemented();
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::readObject(ArrayList, ObjectInputStream) -> void
     */
    private void readObject(ObjectInputStream s) throws java.io.IOException,
            java.lang.ClassNotFoundException {
        /* body */ {
            LibSLRuntime.not_implemented();
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::listIterator(ArrayList, int) -> ListIterator
     */
    public ListIterator listIterator(int index) {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _rangeCheckForAdd(index);
            result = Engine.makeSymbolic(ListIterator.class);
            Engine.assume(result != null);
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
            result = Engine.makeSymbolic(ListIterator.class);
            Engine.assume(result != null);
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
            result = Engine.makeSymbolic(Iterator.class);
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
            result = Engine.makeSymbolic(List.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayListAutomaton::forEach(ArrayList, Consumer) -> void
     */
    public void forEach(Consumer anAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (anAction == null) {
                throw new NullPointerException();
            }
            final int expectedModCount = modCount;
            final int size = length;
            int i = 0;
            while ((modCount == expectedModCount) && (i < size)) {
                final Object item = storage.get(i);
                anAction.accept(item);
                i += 1;
            }
            ;
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::spliterator(ArrayList) -> Spliterator
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
     * [FUNCTION] ArrayListAutomaton::removeIf(ArrayList, Predicate) -> boolean
     */
    public boolean removeIf(Predicate filter) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (filter == null) {
                throw new NullPointerException();
            }
            final int expectedModCount = modCount;
            LibSLRuntime.not_implemented();
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
            final int expectedModCount = modCount;
            LibSLRuntime.not_implemented();
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            modCount += 1;
        }
    }

    /**
     * [FUNCTION] ArrayListAutomaton::sort(ArrayList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int expectedModCount = modCount;
            LibSLRuntime.not_implemented();
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            modCount += 1;
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }
}
