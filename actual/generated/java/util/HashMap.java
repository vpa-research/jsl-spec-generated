// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/HashMap.lsl:23
//  - java/util/HashMap.main.lsl:25
//
package generated.java.util;

import java.io.Serializable;
import java.lang.ClassCastException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * HashMapAutomaton for HashMap ~> java.util.HashMap
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(java.util.HashMap.class)
public class HashMap implements LibSLRuntime.Automaton, Map, Cloneable, Serializable {
    private static final long serialVersionUID = 362498820763181265L;

    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public LibSLRuntime.Map<Object, Map.Entry<Object, Object>> storage;

    public transient int modCount;

    @LibSLRuntime.AutomatonConstructor
    public HashMap(Void __$lsl_token, final byte p0,
            final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> p1, final int p2) {
        this.__$lsl_state = p0;
        this.storage = p1;
        this.modCount = p2;
    }

    @LibSLRuntime.AutomatonConstructor
    public HashMap(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null, 0);
    }

    /**
     * [CONSTRUCTOR] HashMapAutomaton::<init>(HashMap) -> void
     * Source: java/util/HashMap.main.lsl:153
     */
    public HashMap() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.storage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] HashMapAutomaton::<init>(HashMap, Map) -> void
     * Source: java/util/HashMap.main.lsl:159
     */
    public HashMap(Map m) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            this.storage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
            final Set<Map.Entry<Object, Object>> entrySet = ((Set<Map.Entry<Object, Object>>) m.entrySet());
            final Iterator<Map.Entry<Object, Object>> iter = entrySet.iterator();
            while (iter.hasNext()) {
                final Map.Entry<Object, Object> oEntry = iter.next();
                final Object key = oEntry.getKey();
                final Object value = oEntry.getValue();
                Map.Entry<Object, Object> entry = null;
                if (this.storage.hasKey(key)) {
                    entry = this.storage.get(key);
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = value;
                } else {
                    entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                        /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                        /* key = */ key, 
                        /* value = */ value
                    ));
                    this.storage.set(key, entry);
                }
                this.modCount += 1;
            }
            ;
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] HashMapAutomaton::<init>(HashMap, int) -> void
     * Source: java/util/HashMap.main.lsl:167
     */
    public HashMap(int initialCapacity) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException();
            }
            this.storage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] HashMapAutomaton::<init>(HashMap, int, float) -> void
     * Source: java/util/HashMap.main.lsl:179
     */
    public HashMap(int initialCapacity, float loadFactor) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException();
            }
            if ((loadFactor <= 0) || (loadFactor != loadFactor)) {
                throw new IllegalArgumentException();
            }
            this.storage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] HashMapAutomaton::_checkForComodification(int) -> void
     * Source: java/util/HashMap.main.lsl:130
     */
    public void _checkForComodification(int expectedModCount) {
        /* body */ {
            if (this.modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /**
     * [FUNCTION] HashMapAutomaton::clear(HashMap) -> void
     * Source: java/util/HashMap.main.lsl:199
     */
    public void clear() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            this.modCount += 1;
            this.storage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
        }
    }

    /**
     * [FUNCTION] HashMapAutomaton::clone(HashMap) -> Object
     * Source: java/util/HashMap.main.lsl:206
     */
    public Object clone() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> otherStorage = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());
            result = (java.util.HashMap) ((Object) new HashMap((Void) null, 
                /* state = */ HashMap.__$lsl_States.Initialized, 
                /* storage = */ otherStorage, 
                /* modCount = */ 0
            ));
            final int size = this.storage.size();
            if (size != 0) {
                final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> unseen = this.storage.duplicate();
                int c = 0;
                for (c = size; c > 0; c += -1) {
                    final Object key = unseen.anyKey();
                    final Map.Entry<Object, Object> entry = unseen.get(key);
                    final Object value = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                    final Map.Entry<Object, Object> otherEntry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                        /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                        /* key = */ key, 
                        /* value = */ value
                    ));
                    otherStorage.set(key, otherEntry);
                    unseen.remove(key);
                }
                ;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::compute(HashMap, Object, BiFunction) -> Object
     * Source: java/util/HashMap.main.lsl:244
     */
    public Object compute(Object key, BiFunction remappingFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (remappingFunction == null) {
                throw new NullPointerException();
            }
            Object oldValue = null;
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                oldValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            }
            final int expectedModCount = this.modCount;
            final Object newValue = remappingFunction.apply(key, oldValue);
            _checkForComodification(expectedModCount);
            if (newValue == null) {
                this.storage.remove(key);
            } else {
                if (entry != null) {
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = newValue;
                } else {
                    entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                        /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                        /* key = */ key, 
                        /* value = */ newValue
                    ));
                    this.storage.set(key, entry);
                }
            }
            result = newValue;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::computeIfAbsent(HashMap, Object, Function) -> Object
     * Source: java/util/HashMap.main.lsl:287
     */
    public Object computeIfAbsent(Object key, Function mappingFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (mappingFunction == null) {
                throw new NullPointerException();
            }
            Object oldValue = null;
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                oldValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            }
            if (oldValue != null) {
                result = oldValue;
            } else {
                final int expectedModCount = this.modCount;
                final Object newValue = mappingFunction.apply(key);
                _checkForComodification(expectedModCount);
                if (newValue != null) {
                    if (entry != null) {
                        ((AbstractMap_SimpleEntry) ((Object) entry)).value = newValue;
                    } else {
                        entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                            /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                            /* key = */ key, 
                            /* value = */ newValue
                        ));
                        this.storage.set(key, entry);
                    }
                }
                result = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::computeIfPresent(HashMap, Object, BiFunction) -> Object
     * Source: java/util/HashMap.main.lsl:331
     */
    public Object computeIfPresent(Object key, BiFunction remappingFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (remappingFunction == null) {
                throw new NullPointerException();
            }
            Object oldValue = null;
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                oldValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            }
            if (oldValue == null) {
                result = oldValue;
            } else {
                final int expectedModCount = this.modCount;
                final Object newValue = remappingFunction.apply(key, oldValue);
                _checkForComodification(expectedModCount);
                if (newValue == null) {
                    this.storage.remove(key);
                } else {
                    if (entry != null) {
                        ((AbstractMap_SimpleEntry) ((Object) entry)).value = newValue;
                    } else {
                        entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                            /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                            /* key = */ key, 
                            /* value = */ newValue
                        ));
                        this.storage.set(key, entry);
                    }
                }
                result = newValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::containsKey(HashMap, Object) -> boolean
     * Source: java/util/HashMap.main.lsl:378
     */
    public boolean containsKey(Object key) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.storage.size() == 0) {
                result = false;
            } else {
                result = this.storage.hasKey(key);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::containsValue(HashMap, Object) -> boolean
     * Source: java/util/HashMap.main.lsl:387
     */
    public boolean containsValue(Object value) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = false;
            int storageSize = this.storage.size();
            if (storageSize != 0) {
                final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> unseen = this.storage.duplicate();
                while ((result != true) && (storageSize != 0)) {
                    final Object curKey = unseen.anyKey();
                    final Map.Entry<Object, Object> entry = this.storage.get(curKey);
                    final Object curValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                    if (LibSLRuntime.equals(curValue, value)) {
                        result = true;
                    }
                    unseen.remove(curKey);
                    storageSize -= 1;
                }
                ;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::entrySet(HashMap) -> Set
     * Source: java/util/HashMap.main.lsl:416
     */
    public Set entrySet() {
        Set result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.HashMap_EntrySet) ((Object) new HashMap_EntrySet((Void) null, 
                /* state = */ HashMap_EntrySet.__$lsl_States.Initialized, 
                /* storageRef = */ this.storage, 
                /* parent = */ this
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::equals(HashMap, Object) -> boolean
     * Source: java/util/HashMap.main.lsl:426
     */
    public boolean equals(Object other) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == this) {
                result = true;
            } else {
                result = false;
                if ((other instanceof Map)) {
                    final Map<Object, Object> m = ((Map<Object, Object>) other);
                    int thisLength = this.storage.size();
                    if (thisLength == m.size()) {
                        try {
                            result = true;
                            final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> unseen = this.storage.duplicate();
                            while (result && (thisLength != 0)) {
                                final Object key = unseen.anyKey();
                                final Map.Entry<Object, Object> entry = this.storage.get(key);
                                final Object value = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                                if (value == null) {
                                    if (m.get(key) != null) {
                                        result = false;
                                    } else {
                                        if (!m.containsKey(key)) {
                                            result = false;
                                        }
                                    }
                                } else {
                                    result = LibSLRuntime.equals(value, m.get(key));
                                }
                                unseen.remove(key);
                                thisLength -= 1;
                            }
                            ;
                        } catch (ClassCastException __$lsl_exception) {
                            result = false;
                        } catch (NullPointerException __$lsl_exception) {
                            result = false;
                        }
                        ;
                    }
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::forEach(HashMap, BiConsumer) -> void
     * Source: java/util/HashMap.main.lsl:494
     */
    public void forEach(BiConsumer userAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (userAction == null) {
                throw new NullPointerException();
            }
            final int storageSize = this.storage.size();
            if (storageSize > 0) {
                final int expectedModCount = this.modCount;
                final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> unseen = this.storage.duplicate();
                int i = 0;
                for (i = 0; i < storageSize; i += 1) {
                    final Object curKey = unseen.anyKey();
                    final Map.Entry<Object, Object> entry = this.storage.get(curKey);
                    final Object curValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                    userAction.accept(curKey, curValue);
                    unseen.remove(curKey);
                }
                ;
                _checkForComodification(expectedModCount);
            }
        }
    }

    /**
     * [FUNCTION] HashMapAutomaton::get(HashMap, Object) -> Object
     * Source: java/util/HashMap.main.lsl:529
     */
    public Object get(Object key) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            final Object defaultValue = null;
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            } else {
                result = defaultValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::getOrDefault(HashMap, Object, Object) -> Object
     * Source: java/util/HashMap.main.lsl:536
     */
    public Object getOrDefault(Object key, Object defaultValue) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            } else {
                result = defaultValue;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::hashCode(HashMap) -> int
     * Source: java/util/HashMap.main.lsl:543
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
     * [FUNCTION] HashMapAutomaton::isEmpty(HashMap) -> boolean
     * Source: java/util/HashMap.main.lsl:549
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.storage.size() == 0;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::keySet(HashMap) -> Set
     * Source: java/util/HashMap.main.lsl:555
     */
    public Set keySet() {
        Set result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.HashMap_KeySet) ((Object) new HashMap_KeySet((Void) null, 
                /* state = */ HashMap_KeySet.__$lsl_States.Initialized, 
                /* storageRef = */ this.storage, 
                /* parent = */ this
            ));
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::merge(HashMap, Object, Object, BiFunction) -> Object
     * Source: java/util/HashMap.main.lsl:564
     */
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (value == null) {
                throw new NullPointerException();
            }
            if (remappingFunction == null) {
                throw new NullPointerException();
            }
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                final Object oldValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                if (oldValue == null) {
                    result = value;
                } else {
                    final int expectedModCount = this.modCount;
                    result = remappingFunction.apply(oldValue, value);
                    _checkForComodification(expectedModCount);
                }
                if (result == null) {
                    this.storage.remove(key);
                } else {
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = result;
                }
            } else {
                entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                    /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                    /* key = */ key, 
                    /* value = */ value
                ));
                this.storage.set(key, entry);
                this.modCount += 1;
                result = value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::put(HashMap, Object, Object) -> Object
     * Source: java/util/HashMap.main.lsl:607
     */
    public Object put(Object key, Object value) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = null;
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                ((AbstractMap_SimpleEntry) ((Object) entry)).value = value;
            } else {
                entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                    /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                    /* key = */ key, 
                    /* value = */ value
                ));
                this.storage.set(key, entry);
            }
            this.modCount += 1;
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::putAll(HashMap, Map) -> void
     * Source: java/util/HashMap.main.lsl:633
     */
    public void putAll(Map m) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (m == null) {
                throw new NullPointerException();
            }
            final Set<Map.Entry<Object, Object>> entrySet = ((Set<Map.Entry<Object, Object>>) m.entrySet());
            final Iterator<Map.Entry<Object, Object>> iter = entrySet.iterator();
            while (iter.hasNext()) {
                final Map.Entry<Object, Object> oEntry = iter.next();
                final Object key = oEntry.getKey();
                final Object value = oEntry.getValue();
                Map.Entry<Object, Object> entry = null;
                if (this.storage.hasKey(key)) {
                    entry = this.storage.get(key);
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = value;
                } else {
                    entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                        /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                        /* key = */ key, 
                        /* value = */ value
                    ));
                    this.storage.set(key, entry);
                }
                this.modCount += 1;
            }
            ;
        }
    }

    /**
     * [FUNCTION] HashMapAutomaton::putIfAbsent(HashMap, Object, Object) -> Object
     * Source: java/util/HashMap.main.lsl:642
     */
    public Object putIfAbsent(Object key, Object value) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            Map.Entry<Object, Object> entry = null;
            if (this.storage.hasKey(key)) {
                entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
            } else {
                result = null;
                entry = (stub.java.util.AbstractMap_SimpleEntry) ((Object) new AbstractMap_SimpleEntry((Void) null, 
                    /* state = */ AbstractMap_SimpleEntry.__$lsl_States.Initialized, 
                    /* key = */ key, 
                    /* value = */ value
                ));
                this.storage.set(key, entry);
                this.modCount += 1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::remove(HashMap, Object) -> Object
     * Source: java/util/HashMap.main.lsl:664
     */
    public Object remove(Object key) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                this.storage.remove(key);
                this.modCount += 1;
            } else {
                result = null;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::remove(HashMap, Object, Object) -> boolean
     * Source: java/util/HashMap.main.lsl:682
     */
    public boolean remove(Object key, Object value) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                final Object curValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                if (LibSLRuntime.equals(curValue, value)) {
                    this.storage.remove(key);
                    this.modCount += 1;
                    result = true;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::replace(HashMap, Object, Object) -> Object
     * Source: java/util/HashMap.main.lsl:703
     */
    public Object replace(Object key, Object value) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                result = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                ((AbstractMap_SimpleEntry) ((Object) entry)).value = value;
            } else {
                result = null;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::replace(HashMap, Object, Object, Object) -> boolean
     * Source: java/util/HashMap.main.lsl:719
     */
    public boolean replace(Object key, Object oldValue, Object newValue) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = false;
            if (this.storage.hasKey(key)) {
                final Map.Entry<Object, Object> entry = this.storage.get(key);
                final Object curValue = ((AbstractMap_SimpleEntry) ((Object) entry)).value;
                if (LibSLRuntime.equals(curValue, oldValue)) {
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = newValue;
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::replaceAll(HashMap, BiFunction) -> void
     * Source: java/util/HashMap.main.lsl:737
     */
    public void replaceAll(BiFunction function) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (function == null) {
                throw new NullPointerException();
            }
            final int size = this.storage.size();
            if (size > 0) {
                final int expectedModCount = this.modCount;
                final LibSLRuntime.Map<Object, Map.Entry<Object, Object>> unseen = this.storage.duplicate();
                int i = 0;
                for (i = 0; i < size; i += 1) {
                    final Object key = unseen.anyKey();
                    final Map.Entry<Object, Object> entry = this.storage.get(key);
                    ((AbstractMap_SimpleEntry) ((Object) entry)).value = function.apply(key, ((AbstractMap_SimpleEntry) ((Object) entry)).value);
                    unseen.remove(key);
                }
                ;
                _checkForComodification(expectedModCount);
            }
        }
    }

    /**
     * [FUNCTION] HashMapAutomaton::size(HashMap) -> int
     * Source: java/util/HashMap.main.lsl:773
     */
    public int size() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.storage.size();
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::toString(HashMap) -> String
     * Source: java/util/HashMap.main.lsl:780
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.toString(this.storage);
        }
        return result;
    }

    /**
     * [FUNCTION] HashMapAutomaton::values(HashMap) -> Collection
     * Source: java/util/HashMap.main.lsl:786
     */
    public Collection values() {
        Collection result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = (stub.java.util.HashMap_Values) ((Object) new HashMap_Values((Void) null, 
                /* state = */ HashMap_Values.__$lsl_States.Initialized, 
                /* storageRef = */ this.storage, 
                /* parent = */ this
            ));
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(HashMap.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
