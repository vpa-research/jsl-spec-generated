// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.lang.Comparable;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
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
@Approximate(stub.java.util.ArrayList_SubList.class)
public final class ArrayList_SubList extends AbstractList implements LibSLRuntime.Automaton, List, RandomAccess {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public ArrayList root;

    public ArrayList_SubList parentList;

    public int offset;

    public int length;

    public int modCount;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList(Void __$lsl_token, final byte p0, final ArrayList p1,
            final ArrayList_SubList p2, final int p3, final int p4, final int p5) {
        this.__$lsl_state = p0;
        this.root = p1;
        this.parentList = p2;
        this.offset = p3;
        this.length = p4;
        this.modCount = p5;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_SubList(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, null, 0, 0, 0);
    }

    /**
     * [CONSTRUCTOR] ArrayList_SubListAutomaton::SubList(ArrayList_SubList, ArrayList, int, int) -> ArrayList_SubList
     */
    public ArrayList_SubList(ArrayList root, int fromIndex, int toIndex) {
        this((Void) null);
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
        this((Void) null);
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
            Engine.assume(this.root != null);
            final int effectiveIndex = this.offset + index;
            ((ArrayList) this.root)._rangeCheckForAdd(effectiveIndex);
            final int collectionSize = c.size();
            if (collectionSize == 0) {
                result = false;
            } else {
                result = true;
                ((ArrayList) this.root)._checkForComodification(this.modCount);
                ((ArrayList) this.root)._addAllElements(effectiveIndex, c);
                _updateSizeAndModCount(collectionSize);
            }
        }
        return result;
    }

    /**
     * [SUBROUTINE] ArrayList_SubListAutomaton::_updateSizeAndModCount(int) -> void
     */
    public void _updateSizeAndModCount(int sizeChange) {
        /* body */ {
            Engine.assume(this.root != null);
            this.length += sizeChange;
            this.modCount = ((ArrayList) this.root).modCount;
            ArrayList_SubList aList = this.parentList;
            while (aList != null) {
                ((ArrayList_SubList) aList).length += sizeChange;
                ((ArrayList_SubList) aList).modCount = this.modCount;
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final SymbolicList<Object> parentStorage = ((ArrayList) this.root).storage;
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
     * [SUBROUTINE] ArrayList_SubListAutomaton::_makeStream(boolean) -> Stream
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
     * [FUNCTION] ArrayList_SubListAutomaton::add(ArrayList_SubList, Object) -> boolean
     */
    public boolean add(Object e) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + this.length;
            ((ArrayList) this.root)._addElement(effectiveIndex, e);
            _updateSizeAndModCount(1);
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::add(ArrayList_SubList, int, Object) -> void
     */
    public void add(int index, Object element) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            ((ArrayList) this.root)._addElement(effectiveIndex, element);
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
            _addAllElements(this.length, c);
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int size = this.length;
            if (size != 0) {
                Engine.assume(size > 0);
                final int end = this.offset - 1;
                final int start = end + size;
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                int i = 0;
                for (i = start; i > end; i += -1) {
                    rootStorage.remove(i);
                }
                ;
                ((ArrayList) this.root).length -= size;
                ((ArrayList) this.root).modCount += 1;
                _updateSizeAndModCount(-size);
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::contains(ArrayList_SubList, Object) -> boolean
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
     * [FUNCTION] ArrayList_SubListAutomaton::containsAll(ArrayList_SubList, Collection) -> boolean
     */
    public boolean containsAll(Collection c) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = true;
            if (!c.isEmpty()) {
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final int end = this.offset + this.length;
                if ((c != null && c.getClass() == ArrayList_SubList.class)) {
                    final ArrayList otherRoot = ((ArrayList_SubList) c).root;
                    Engine.assume(otherRoot != null);
                    final SymbolicList<Object> otherStorage = ((ArrayList) otherRoot).storage;
                    final int otherOffset = ((ArrayList_SubList) c).offset;
                    final int otherEnd = otherOffset + ((ArrayList_SubList) c).length;
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
     * [FUNCTION] ArrayList_SubListAutomaton::equals(ArrayList_SubList, Object) -> boolean
     */
    public boolean equals(Object o) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (o == this) {
                result = true;
            } else {
                result = (o != null && o.getClass() == ArrayList_SubList.class);
                if (result) {
                    Engine.assume(this.root != null);
                    final int otherLength = ((ArrayList_SubList) o).length;
                    Engine.assume(otherLength >= 0);
                    result = this.length == otherLength;
                    if (result) {
                        result = ((ArrayList) this.root)._equalsRange(((List) o), this.offset, this.offset + this.length);
                        ((ArrayList) this.root)._checkForComodification(this.modCount);
                    }
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::forEach(ArrayList_SubList, Consumer) -> void
     */
    public void forEach(Consumer _action) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.length != 0) {
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final int expectedModCount = ((ArrayList) this.root).modCount;
                this.modCount = expectedModCount;
                int i = this.offset;
                final int end = this.offset + this.length;
                while ((i < end) && (((ArrayList) this.root).modCount == expectedModCount)) {
                    final Object item = rootStorage.get(i);
                    _action.accept(item);
                    i += 1;
                }
                ;
                ((ArrayList) this.root)._checkForComodification(expectedModCount);
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::get(ArrayList_SubList, int) -> Object
     */
    public Object get(int index) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkValidIndex(index, this.length);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            result = ((ArrayList) this.root).storage.get(effectiveIndex);
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
            result = 1;
            if (this.length != 0) {
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                int i = this.offset;
                final int end = this.offset + this.length;
                for (i = i; i < end; i += 1) {
                    final Object item = rootStorage.get(i);
                    result = (31 * result) + LibSLRuntime.hashCode(item);
                }
                ;
                ((ArrayList) this.root)._checkForComodification(this.modCount);
            }
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
            result = this.length == 0;
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
            result = new ArrayList_SubList$ListIterator((Void) null, 
            /* state = */ ArrayList_SubList$ListIterator.__$lsl_States.Initialized, 
            /* root = */ this.root, 
            /* sublist = */ this, 
            /* cursor = */ 0, 
            /* expectedModCount = */ this.modCount, 
            /* offset = */ this.offset, 
            /* size = */ this.length, 
            /* lastRet = */ -1);
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            if (this.length == 0) {
                result = -1;
            } else {
                Engine.assume(this.length > 0);
                final int end = this.offset + this.length;
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
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
     * [FUNCTION] ArrayList_SubListAutomaton::listIterator(ArrayList_SubList) -> ListIterator
     */
    public ListIterator listIterator() {
        ListIterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = new ArrayList_SubList$ListIterator((Void) null, 
            /* state = */ ArrayList_SubList$ListIterator.__$lsl_States.Initialized, 
            /* root = */ this.root, 
            /* sublist = */ this, 
            /* cursor = */ 0, 
            /* expectedModCount = */ this.modCount, 
            /* offset = */ this.offset, 
            /* size = */ this.length, 
            /* lastRet = */ -1);
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
            result = new ArrayList_SubList$ListIterator((Void) null, 
            /* state = */ ArrayList_SubList$ListIterator.__$lsl_States.Initialized, 
            /* root = */ this.root, 
            /* sublist = */ this, 
            /* cursor = */ index, 
            /* expectedModCount = */ this.modCount, 
            /* offset = */ this.offset, 
            /* size = */ this.length, 
            /* lastRet = */ -1);
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
            result = _makeStream(true);
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
            Engine.assume(this.root != null);
            final int end = this.offset + this.length;
            final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
            final int index = LibSLRuntime.ListActions.find(rootStorage, o, this.offset, end);
            result = index != -1;
            if (result) {
                ((ArrayList) this.root)._checkForComodification(this.modCount);
                ((ArrayList) this.root)._deleteElement(index);
                _updateSizeAndModCount(-1);
            }
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkValidIndex(index, this.length);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int effectiveIndex = this.offset + index;
            result = ((ArrayList) this.root)._deleteElement(effectiveIndex);
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
            final int size = this.length;
            if (size != 0) {
                Engine.assume(size > 0);
                Engine.assume(this.root != null);
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                LibSLRuntime.todo();
                result = this.length != size;
            } else {
                result = false;
            }
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            if (filter == null) {
                throw new NullPointerException();
            }
            final int size = this.length;
            if (size != 0) {
                Engine.assume(size > 0);
                final int expectedModCount = this.modCount;
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final int end = this.offset - 1;
                final int start = end + size;
                int delta = 0;
                int i = 0;
                for (i = start; i > end; i += -1) {
                    final Object item = rootStorage.get(i);
                    if (filter.test(item)) {
                        rootStorage.remove(i);
                        delta -= 1;
                    }
                }
                ;
                ((ArrayList) this.root)._checkForComodification(expectedModCount);
                ((ArrayList) this.root).length += delta;
                ((ArrayList) this.root).modCount += 1;
                _updateSizeAndModCount(delta);
                result = delta != 0;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::replaceAll(ArrayList_SubList, UnaryOperator) -> void
     */
    public void replaceAll(UnaryOperator operator) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            if (operator == null) {
                throw new NullPointerException();
            }
            final int size = this.length;
            if (size != 0) {
                Engine.assume(size > 0);
                final int expectedModCount = this.modCount;
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final int end = this.offset + size;
                int i = 0;
                for (i = this.offset; i < end; i += 1) {
                    Object item = rootStorage.get(i);
                    item = operator.apply(item);
                    rootStorage.set(i, item);
                }
                ;
                ((ArrayList) this.root)._checkForComodification(expectedModCount);
            }
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkValidIndex(index, this.length);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final SymbolicList<Object> parentStorage = ((ArrayList) this.root).storage;
            final int effectiveIndex = this.offset + index;
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            result = this.length;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::sort(ArrayList_SubList, Comparator) -> void
     */
    public void sort(Comparator c) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.length != 0) {
                Engine.assume(this.length > 0);
                Engine.assume(this.root != null);
                ((ArrayList) this.root)._checkForComodification(this.modCount);
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
                final int baseLimit = this.offset + this.length;
                final int outerLimit = baseLimit - 1;
                int innerLimit = 0;
                int i = 0;
                int j = 0;
                if (c == null) {
                    for (i = this.offset; i < outerLimit; i += 1) {
                        innerLimit = (baseLimit - i) - 1;
                        for (j = this.offset; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = rootStorage.get(idxA);
                            final Object b = rootStorage.get(idxB);
                            if (((Comparable) a).compareTo(b) > 0) {
                                rootStorage.set(idxA, b);
                                rootStorage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                } else {
                    for (i = this.offset; i < outerLimit; i += 1) {
                        innerLimit = (baseLimit - i) - 1;
                        for (j = this.offset; j < innerLimit; j += 1) {
                            final int idxA = j;
                            final int idxB = j + 1;
                            final Object a = rootStorage.get(idxA);
                            final Object b = rootStorage.get(idxB);
                            if (c.compare(a, b) > 0) {
                                rootStorage.set(idxA, b);
                                rootStorage.set(idxB, a);
                            }
                        }
                        ;
                    }
                    ;
                }
                this.modCount = ((ArrayList) this.root).modCount;
            }
        }
    }

    /**
     * [FUNCTION] ArrayList_SubListAutomaton::spliterator(ArrayList_SubList) -> Spliterator
     */
    public Spliterator spliterator() {
        Spliterator result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = new ArrayList_SubList$Spliterator((Void) null, 
            /* state = */ ArrayList_SubList$Spliterator.__$lsl_States.Initialized, 
            /* root = */ this.root, 
            /* parent = */ this, 
            /* index = */ 0, 
            /* fence = */ -1, 
            /* expectedModCount = */ 0);
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
            result = _makeStream(false);
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._subListRangeCheck(fromIndex, toIndex, this.length);
            result = new ArrayList_SubList((Void) null, 
            /* state = */ ArrayList_SubList.__$lsl_States.Initialized, 
            /* root = */ this.root, 
            /* parentList = */ this, 
            /* offset = */ this.offset + fromIndex, 
            /* length = */ toIndex - fromIndex, 
            /* modCount = */ this.modCount);
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
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            result = new Object[this.length];
            final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
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
     * [FUNCTION] ArrayList_SubListAutomaton::toArray(ArrayList_SubList, IntFunction) -> array<Object>
     */
    public Object[] toArray(IntFunction generator) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object[] a = ((Object[]) generator.apply(0));
            final int aSize = a.length;
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            result = new Object[this.length];
            final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
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
     * [FUNCTION] ArrayList_SubListAutomaton::toArray(ArrayList_SubList, array<Object>) -> array<Object>
     */
    public Object[] toArray(Object[] a) {
        Object[] result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Engine.assume(this.root != null);
            ((ArrayList) this.root)._checkForComodification(this.modCount);
            final int aSize = a.length;
            if (aSize < this.length) {
                a = new Object[this.length];
            }
            result = a;
            final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
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
     * [FUNCTION] ArrayList_SubListAutomaton::toString(ArrayList_SubList) -> String
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
                final SymbolicList<Object> rootStorage = ((ArrayList) this.root).storage;
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

    @Approximate(ArrayList_SubList.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
