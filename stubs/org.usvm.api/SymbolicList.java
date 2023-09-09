package org.usvm.api;

public interface SymbolicList<Value> {

    Value get(int index);

    void set(int index, Value value);

    SymbolicList<Value> copy();

    void remove(int index);

    int size();

    boolean equals(Object obj);

    String toString();

    void insert(int at, Value value);

    void copy(SymbolicList<Value> dst, int srcFrom, int dstFrom, int len);

}
