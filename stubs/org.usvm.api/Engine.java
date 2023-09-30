package org.usvm.api;

public final class Engine {

    public static void assume(boolean predicate) {
        assert predicate;
    }

    /**
     * @return a nullable reference to something of type T.
     */
    public static <T> T makeSymbolic(Class<T> type) {
        return null;
    }

    /**
     * @return a nullable reference to a new array, each element being something or NULL!
     */
    public static <E> E[] makeSymbolicArray(Class<E> type, int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static boolean makeSymbolicBoolean() {
        return false;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static boolean[] makeSymbolicBooleanArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static byte makeSymbolicByte() {
        return 0;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static byte[] makeSymbolicByteArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static short makeSymbolicShort() {
        return 0;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static short[] makeSymbolicShortArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static int makeSymbolicInt() {
        return 0;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static int[] makeSymbolicIntArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static long makeSymbolicLong() {
        return 0;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static long[] makeSymbolicLongArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static char makeSymbolicChar() {
        return '0';
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static char[] makeSymbolicCharArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static float makeSymbolicFloat() {
        return 0.f;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static float[] makeSymbolicFloatArray(int size) {
        return null;
    }

    /**
     * @return a primitive non-nullable value.
     */
    public static double makeSymbolicDouble() {
        return 0.d;
    }

    /**
     * @return a nullable reference to a new array, each element being a non-nullable primitive value.
     */
    public static double[] makeSymbolicDoubleArray(int size) {
        return null;
    }

    /**
     * @return value CANNOT be null!
     */
    public static <K, V> SymbolicMap<K, V> makeSymbolicMap() {
        return null;
    }

    /**
     * @return value CANNOT be null!
     */
    public static <K, V> SymbolicMap<K, V> makeSymbolicIdentityMap() {
        return null;
    }

    /**
     * @return value CANNOT be null!
     */
    public static <V> SymbolicList<V> makeSymbolicList() {
        return null;
    }

    public static boolean typeEquals(Object a, Object b) {
        return false;
    }

}
