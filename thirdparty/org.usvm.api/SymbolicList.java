package org.usvm.api;

public interface SymbolicList<E> {
   int size();

   E get(int index);

   void set(int index, E var2);

   void insert(int index, E var2);

   void remove(int index);

   void copy(SymbolicList<E> dst, int srcFrom, int dstFrom, int len);
}
