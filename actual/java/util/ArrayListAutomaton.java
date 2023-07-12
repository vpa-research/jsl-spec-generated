// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package java.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;
import runtime.LibSLRuntime;

public final class ArrayListAutomaton implements LibSLRuntime.Automaton {
    public byte __$lsl_state = __$lsl_States.Allocated;

    private SymbolicList<Object> storage;

    private int length;

    private int modCount;

    @LibSLRuntime.AutomatonConstructor
    public ArrayListAutomaton(final byte __$lsl_state, final SymbolicList<Object> storage,
            final int length, final int modCount) {
        this.__$lsl_state = __$lsl_state;
        this.storage = storage;
        this.length = length;
        this.modCount = modCount;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayListAutomaton() {
        this(__$lsl_States.Allocated, null, 0, 0);
    }

    public void ArrayList(ArrayList self, int initialCapacity) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialCapacity < 0) {
                String initCapacity = Engine.toString(initialCapacity);
                String message = "Illegal Capacity: " + initCapacity;
                throw new java.lang.IllegalArgumentException(message);
            }
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void ArrayList(ArrayList self) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            ACTION: "LIST_RESIZE"[, this.storage, 0];
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void ArrayList(ArrayList self, Collection c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void _checkValidIndex(int index, int length) {
        /* body */ {
            if ((index < 0) || (index >= length)) {
                String idx = Engine.toString(index);
                String len = Engine.toString(length);
                String message = "Index " + idx + " out of bounds for length " + len;
                throw new java.lang.IndexOutOfBoundsException(message);
            }
        }
    }

    public void _rangeCheckForAdd(int index, int length) {
        /* body */ {
            if ((index < 0) || (index > length)) {
                String idx = Engine.toString(index);
                String len = Engine.toString(length);
                String message = "Index: " + idx + ", Size: " + len;
                throw new java.lang.IndexOutOfBoundsException(message);
            }
        }
    }

    public boolean _addAllElements(int index, Collection c) {
        boolean result;
        /* body */ {
            this.modCount += 1;
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public void _subListRangeCheck(int fromIndex, int toIndex, int size) {
        /* body */ {
            if (fromIndex < 0) {
                String from = Engine.toString(fromIndex);
                String message = "fromIndex = " + from;
                throw new java.lang.IndexOutOfBoundsException(message);
            }
            if (toIndex > size) {
                String to = Engine.toString(toIndex);
                String message = "toIndex = " + to;
                throw new java.lang.IndexOutOfBoundsException(message);
            }
            if (fromIndex > toIndex) {
                String from = Engine.toString(fromIndex);
                String to = Engine.toString(toIndex);
                String message = "fromIndex(" + from + ") > toIndex(" + to + ")";
                throw new java.lang.IllegalArgumentException(message);
            }
        }
    }

    public void _checkForComodification(int expectedModCount) {
        /* body */ {
            if (this.modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }
    }

    public Object _deleteElement(int index) {
        Object result;
        /* body */ {
            _checkValidIndex(index, this.length);
            result = ACTION: "LIST_GET"[, this.storage, index];
            ACTION: "LIST_REMOVE"[, this.storage, index, 1];
            this.modCount += 1;
            this.length -= 1;
        }
        return result;
    }

    public void _addElement(int index, Object element) {
        /* body */ {
            _rangeCheckForAdd(index, this.length);
            this.modCount += 1;
            ACTION: "LIST_INSERT_AT"[, this.storage, index, element];
            this.length += 1;
        }
    }

    public Object _setElement(int index, Object element) {
        Object result;
        /* body */ {
            _checkValidIndex(index, this.length);
            result = ACTION: "LIST_GET"[, this.storage, index];
            ACTION: "LIST_SET"[, this.storage, index, element];
        }
        return result;
    }

    public void _throwNPE() {
        /* body */ {
            throw new java.lang.NullPointerException();
        }
    }

    public void trimToSize(ArrayList self) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.modCount += 1;
        }
    }

    public void ensureCapacity(ArrayList self, int minCapacity) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.modCount += 1;
        }
    }

    public int size(ArrayList self) {
        int result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.length;
        }
        return result;
    }

    public boolean isEmpty(ArrayList self) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.length == 0;
        }
        return result;
    }

    public boolean contains(ArrayList self, Object o) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ACTION: "LIST_FIND"[, this.storage, o, 0, this.length, 1] >= 0;
        }
        return result;
    }

    public int indexOf(ArrayList self, Object o) {
        int result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ACTION: "LIST_FIND"[, this.storage, o, 0, this.length, 1];
        }
        return result;
    }

    public int lastIndexOf(ArrayList self, Object o) {
        int result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = ACTION: "LIST_FIND"[, this.storage, o, this.length - 1, -1, -1];
        }
        return result;
    }

    public Object clone(ArrayList self) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            SymbolicList<Object> storageCopy = ACTION: "LIST_DUP"[, this.storage];
            result = new ArrayList(new ArrayListAutomaton(ArrayListAutomaton.__$lsl_States.Initialized, storageCopy, this.length, null));
        }
        return result;
    }

    public Object[] toArray(ArrayList self) {
        Object[] result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public Object[] toArray(ArrayList self, Object[] a) {
        Object[] result;
        Engine.assume();
        /* body */ {
            result = ACTION: "LIST_TO_ARRAY"[, this.storage, a, 0, this.length];
        }
        return result;
    }

    public Object get(ArrayList self, int index) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _checkValidIndex(index, this.length);
            result = ACTION: "LIST_GET"[, this.storage, index];
        }
        return result;
    }

    public Object set(ArrayList self, int index, Object element) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _setElement(index, element);
        }
        return result;
    }

    public boolean add(ArrayList self, Object e) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.modCount += 1;
            ACTION: "LIST_INSERT_AT"[, this.storage, this.length, e];
            this.length += 1;
            result = true;
        }
        return result;
    }

    public void add(ArrayList self, int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _addElement(index, element);
        }
    }

    public Object remove(ArrayList self, int index) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _deleteElement(index);
        }
        return result;
    }

    public boolean equals(ArrayList self, Object other) {
        boolean result;
        Engine.assume();
        /* body */ {
            if (other == self) {
                result = true;
            } else {
                final boolean isSameType = Engine.isSameType(self, other);
                if (isSameType) {
                    final int expectedModCount = this.modCount;
                    final int otherExpectedModCount = LibSLRuntime.getAutomatonFrom(other, ArrayListAutomaton.class).modCount;
                    final SymbolicList<Object> otherStorage = LibSLRuntime.getAutomatonFrom(other, ArrayListAutomaton.class).storage;
                    final int otherLength = LibSLRuntime.getAutomatonFrom(other, ArrayListAutomaton.class).length;
                    if (this.length == otherLength) {
                        result = Engine.equals(this.storage, otherStorage);
                    } else {
                        result = false;
                    }
                    ACTION: "DO"[, "other._checkForComodification(otherExpectedModCount)"];
                    ACTION: "DO"[, "this._checkForComodification(expectedModCount)"];
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public String toString(ArrayList self) {
        String result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public int hashCode(ArrayList self) {
        int result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.hashCode(this.storage);
        }
        return result;
    }

    public boolean remove(ArrayList self, Object o) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            int index = ACTION: "LIST_FIND"[, this.storage, o, 0, this.length, 1];
            if (index == -1) {
                result = false;
            } else {
                ACTION: "LIST_REMOVE"[, this.storage, index, 1];
                result = true;
            }
        }
        return result;
    }

    public void clear(ArrayList self) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            ACTION: "LIST_RESIZE"[, this.storage, 0];
            this.length = 0;
            this.modCount += 1;
        }
    }

    public boolean addAll(ArrayList self, Collection c) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _addAllElements(this.length, c);
        }
        return result;
    }

    public boolean addAll(ArrayList self, int index, Collection c) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _rangeCheckForAdd(index, this.length);
            result = _addAllElements(index, c);
        }
        return result;
    }

    public boolean removeAll(ArrayList self, Collection c) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public boolean retainAll(ArrayList self, Collection c) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public void writeObject(ArrayList self, ObjectOutputStream s) throws java.io.IOException {
        Engine.assume();
        /* body */ {
            int expectedModCount = this.modCount;
            LibSLRuntime.not_implemented();
            if (this.modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }
    }

    public void readObject(ArrayList self, ObjectInputStream s) throws java.io.IOException,
            java.lang.ClassNotFoundException {
        Engine.assume();
        /* body */ {
            LibSLRuntime.not_implemented();
        }
    }

    public Object listIterator(ArrayList self, int index) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    public Object listIterator(ArrayList self) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    public Object iterator(ArrayList self) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    public Object subList(ArrayList self, int fromIndex, int toIndex) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _subListRangeCheck(fromIndex, toIndex, this.length);
            LibSLRuntime.todo();
        }
        return result;
    }

    public void forEach(ArrayList self, Consumer anAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
    }

    public Object spliterator(ArrayList self) {
        Object result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    public boolean removeIf(ArrayList self, Predicate filter) {
        boolean result;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (filter == null) {
                throw new java.lang.NullPointerException();
            }
            int expectedModCount = this.modCount;
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public void replaceAll(ArrayList self, Object op) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (op == null) {
                throw new java.lang.NullPointerException();
            }
            int expectedModCount = this.modCount;
            LibSLRuntime.not_implemented();
            if (this.modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            this.modCount += 1;
        }
    }

    public void sort(ArrayList self, Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            int expectedModCount = this.modCount;
            LibSLRuntime.not_implemented();
            if (this.modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            this.modCount += 1;
        }
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }
}
