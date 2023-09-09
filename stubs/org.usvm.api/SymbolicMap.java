package org.usvm.api;

public interface SymbolicMap<Key, Value> {

    boolean containsKey(Key key);

    /**
     * Key should be in the map before calling this method!
     */
    Value get(Key key);

    void set(Key key, Value value);

    SymbolicMap<Key, Value> copy();

    void remove(Key key);

    int size();

    void union(SymbolicMap<Key, Value> other);

    void intersect(SymbolicMap<Key, Value> other);

    boolean equals(Object obj);

    String toString();

}
