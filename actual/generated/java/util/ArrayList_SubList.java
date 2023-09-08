// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.util.AbstractList;
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
 * ArrayList_SubListAutomaton for ArrayList_SubList ~> java.util.ArrayList_SubList
 */
@Approximate(java.util.ArrayList_SubList.class)
public final class ArrayList_SubList extends AbstractList implements LibSLRuntime.Automaton, List, RandomAccess {
    static {
    }

    public LibSLRuntime.Token __$lsl_token = null;

    public byte __$lsl_state = __$lsl_States.Allocated;

    public ArrayList root;

    public ArrayList_SubList parentList;

    public int offset;

    public int length;

    public int modCount;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final ArrayList root, final ArrayList_SubList parentList, final int offset,
            final int length, final int modCount) {
        this.__$lsl_token = __$lsl_token;
        this.__$lsl_state = __$lsl_state;
        this.root = root;
        this.parentList = parentList;
        this.offset = offset;
        this.length = length;
        this.modCount = modCount;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, null, 0, 0, 0);
    }

    /**
     * [CONSTRUCTOR] ArrayList_SubListAutomaton::SubList(ArrayList_SubList, ArrayList, int, int) -> ArrayList_SubList
     */
    public ArrayList_SubList(ArrayList root, int fromIndex, int toIndex) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* inaccessible constructor */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] ArrayList_SubListAutomaton::SubList(ArrayList_SubList, ArrayList_SubList, int, int) -> ArrayList_SubList
     */
    private ArrayList_SubList(ArrayList_SubList parent, int fromIndex, int toIndex) {
        this(LibSLRuntime.Token.INSTANCE);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.not_implemented(/* inaccessible constructor */);
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] ArrayList_SubListAutomaton::_addAllElements(int, Collection) -> boolean
     */
    private boolean _addAllElements(int index, Collection c) {
        boolean result = false;
        /* body */ {
            Engine.assume(root != null);
            final int effectiveIndex = offset + index;
            ((ArrayList) root)._rangeCheckForAdd(effectiveIndex);
            final int collectionSize = c.size();
            if (collectionSize == 0) {
                result = false;
            } else {
                result = true;
                ((ArrayList) root)._checkForComodification(modCount);
                ((ArrayList) root)._addAllElements(effectiveIndex, c);
                _updateSizeAndModCount(collectionSize);
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayList_SubListAutomaton::_updateSizeAndModCount(int) -> void
     */
    private void _updateSizeAndModCount(int sizeChange) {
        /* body */ {
            Engine.assume(root != null);
            length += sizeChange;
            modCount = ((ArrayList) root).modCount;
            ArrayList_SubList aList = parentList;
            while (aList != null) {
                ((ArrayList_SubList) aList).length += sizeChange;
                ((ArrayList_SubList) aList).modCount = modCount;
                aList = ((ArrayList_SubList) aList).parentList;
            }
            ;
        }
    }

    /**
     * [SUBROUTINE] ArrayList_SubListAutomaton::_indexOfElement(Object) -> int
     */
    private int _indexOfElement(Object o) {
        int result = 0;
        /* body */ {
            Engine.assume(root != null);
            ((ArrayList) root)._checkForComodification(modCount);
            final SymbolicList<Object> parentStorage = ((ArrayList) root).storage;
            final int parentLength = ((ArrayList) root).length;
            final int index = LibSLRuntime.ListActions.find(parentStorage, o, 0, parentLength);
            if (index >= 0) {
                result = index - offset;
            } else {
                result = -1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::add(ArrayList_SubList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::add(ArrayList_SubList, int, Object) -> void
     */
    public void add(int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            final int effectiveIndex = offset + index;
            ((ArrayList) root)._rangeCheckForAdd(effectiveIndex);
            ((ArrayList) root)._checkForComodification(modCount);
            ((ArrayList) root)._addElement(effectiveIndex, element);
            _updateSizeAndModCount(1);
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::addAll(ArrayList_SubList, Collection) -> boolean
     */
    public boolean addAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            _addAllElements(length, c);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::addAll(ArrayList_SubList, int, Collection) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::clear(ArrayList_SubList) -> void
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::contains(ArrayList_SubList, Object) -> boolean
     */
    public boolean contains(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = _indexOfElement(o) >= 0;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::containsAll(ArrayList_SubList, Collection) -> boolean
     */
    public boolean containsAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = true;
            if (!c.isEmpty()) {
                Engine.assume(root != null);
                final SymbolicList<Object> rootStorage = ((ArrayList) root).storage;
                final int end = offset + length;
                final Iterator iter = c.iterator();
                while (iter.hasNext() && result) {
                    final Object item = iter.next();
                    result = LibSLRuntime.ListActions.find(rootStorage, item, offset, end);
                }
                ;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::equals(ArrayList_SubList, Object) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::forEach(ArrayList_SubList, Consumer) -> void
     */
    public void forEach(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::get(ArrayList_SubList, int) -> Object
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            final int effectiveIndex = offset + index;
            ((ArrayList) root)._checkValidIndex(effectiveIndex);
            ((ArrayList) root)._checkForComodification(modCount);
            result = ((ArrayList) root).storage.get(effectiveIndex);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::hashCode(ArrayList_SubList) -> int
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::indexOf(ArrayList_SubList, Object) -> int
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
     * [FUNCTION] ArrayList_SubListAutomaton::isEmpty(ArrayList_SubList) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::iterator(ArrayList_SubList) -> Iterator
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
     * [FUNCTION] ArrayList_SubListAutomaton::lastIndexOf(ArrayList_SubList, Object) -> int
     */
    public int lastIndexOf(Object o) {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::listIterator(ArrayList_SubList) -> ListIterator
     */
    public ListIterator listIterator() {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::listIterator(ArrayList_SubList, int) -> ListIterator
     */
    public ListIterator listIterator(int index) {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::parallelStream(ArrayList_SubList) -> Stream
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
     * [FUNCTION] ArrayList_SubListAutomaton::remove(ArrayList_SubList, Object) -> boolean
     */
    public boolean remove(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::remove(ArrayList_SubList, int) -> Object
     */
    public Object remove(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            final int effectiveIndex = offset + index;
            ((ArrayList) root)._checkValidIndex(effectiveIndex);
            ((ArrayList) root)._checkForComodification(modCount);
            result = ((ArrayList) root)._deleteElement(effectiveIndex);
            _updateSizeAndModCount(-1);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::removeAll(ArrayList_SubList, Collection) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::removeIf(ArrayList_SubList, Predicate) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::replaceAll(ArrayList_SubList, UnaryOperator) -> void
     */
    public void replaceAll(UnaryOperator operator) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::retainAll(ArrayList_SubList, Collection) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::set(ArrayList_SubList, int, Object) -> Object
     */
    public Object set(int index, Object element) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            final int effectiveIndex = offset + index;
            ((ArrayList) root)._checkValidIndex(effectiveIndex);
            ((ArrayList) root)._checkForComodification(modCount);
            final SymbolicList<Object> parentStorage = ((ArrayList) root).storage;
            result = parentStorage.get(effectiveIndex);
            parentStorage.set(effectiveIndex, element);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::size(ArrayList_SubList) -> int
     */
    public int size() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            ((ArrayList) root)._checkForComodification(modCount);
            result = length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::sort(ArrayList_SubList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::spliterator(ArrayList_SubList) -> Spliterator
     */
    public Spliterator spliterator() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::stream(ArrayList_SubList) -> Stream
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
     * [FUNCTION] ArrayList_SubListAutomaton::subList(ArrayList_SubList, int, int) -> List
     */
    public List subList(int fromIndex, int toIndex) {
        List result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(root != null);
            ((ArrayList) root)._subListRangeCheck(fromIndex, toIndex, length);
            result = new ArrayList_SubList(LibSLRuntime.Token.INSTANCE, ArrayList_SubList.__$lsl_States.Initialized, root, this, offset + fromIndex, toIndex - fromIndex, modCount);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::toArray(ArrayList_SubList) -> array<Object>
     */
    public Object[] toArray() {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = new Object[length];
            final int end = offset + length;
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::toArray(ArrayList_SubList, IntFunction) -> array<Object>
     */
    public Object[] toArray(IntFunction generator) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = ((Object[]) generator.apply(0));
            if (a == null) {
                throw new NullPointerException();
            }
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::toArray(ArrayList_SubList, array<Object>) -> array<Object>
     */
    public Object[] toArray(Object[] a) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final int end = offset + length;
            LibSLRuntime.todo();
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::toString(ArrayList_SubList) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.todo();
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(ArrayList_SubList.class)
    public static final class __hook {
        private __hook(Void o) {
            Engine.assume(false);
        }
    }
}
