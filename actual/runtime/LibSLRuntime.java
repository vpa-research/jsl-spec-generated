package runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.usvm.api.Engine;
import org.usvm.api.SymbolicList;

public final class LibSLRuntime {

    public static final class Token {
        public static final Token INSTANCE = new Token();

        private Token() {}
    }

    public interface HasAutomaton {
    }

    @Target(ElementType.CONSTRUCTOR)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DirectCallOnly {
    }

    public interface Automaton {
    }

    @Target(ElementType.CONSTRUCTOR)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AutomatonConstructor {
    }

    public static abstract class LibSLException extends Error {
        private LibSLException(final String msg) {
            super(msg);
        }
    }

    public static final class StateCheckException extends LibSLException {
        private StateCheckException(final String msg) {
            super(msg);
        }
    }

    public static final class SemanticViolationException extends LibSLException {
        private SemanticViolationException(final String msg) {
            super(msg);
        }
    }

    public static final class IncompleteSpecificationException extends LibSLException {
        private IncompleteSpecificationException(final String msg) {
            // #question: can we pass class and method names here? (counterargument: string bloat)
            super(msg);
        }
    }

    public static void error(final String msg) {
        Engine.assume(msg != null);
        throw new SemanticViolationException(msg);
    }

    public static void todo() {
        throw new IncompleteSpecificationException("TODO");
    }

    public static void not_implemented() {
        throw new IncompleteSpecificationException("NOT_IMPLEMENTED");
    }



    public static String toString(final boolean v) {
        return v ? "true" : "false";
    }

    public static String toString(final byte v) {
        // TODO: maybe use more sophisticated approach?
        final var str = Engine.makeSymbolic(String.class);
        Engine.assume(str != null);

        Engine.assume(str.length() <= 4); // '-128' _ '128'

        return str;
    }

    public static String toString(final short v) {
        // TODO: maybe use more sophisticated approach?
        final var str = Engine.makeSymbolic(String.class);
        Engine.assume(str != null);

        Engine.assume(str.length() <= 6); // '-32768' _ '32767'

        return str;
    }

    public static String toString(final int v) {
        // TODO: maybe use more sophisticated approach?
        final var str = Engine.makeSymbolic(String.class);
        Engine.assume(str != null);

        Engine.assume(str.length() <= 11); // '-2147483648' _ '2147483647'

        return str;
    }

    public static String toString(final long v) {
        // TODO: maybe use more sophisticated approach?
        final var str = Engine.makeSymbolic(String.class);
        Engine.assume(str != null);

        Engine.assume(str.length() <= 20); // '-9223372036854775808' _ '9223372036854775807'

        return str;
    }

    public static String toString(final char v) {
        return new String(new char[]{ v });
    }

    // TODO: do we need more variants for other primitive array types?
    public static String toString(final char[] v) {
        return new String(v);
    }

    public static String toString(final float v) {
        // FIXME: use less complex approach
        return Float.toString(v);
    }

    public static String toString(final double v) {
        // FIXME: use less complex approach
        return Double.toString(v);
    }

    public static String toString(final SymbolicList v) {
        // FIXME: use less complex approach
        var res = "[";

        var counter = v.size();
        Engine.assume(counter >= 0);
        for (var i = 0, c = counter; i < c; i++) {
            res = res.concat(toString(v.get(i)));

            if (counter --> 1)
                res = res.concat(", ");
        }

        return res.concat("]");
    }

    public static String toString(final SymbolicMap v) {
        // FIXME: use less complex approach
        var res = "[";

        var unseen = v.size();
        Engine.assume(unseen >= 0);

        final var visited = Engine.makeSymbolicMap<>();
        while (unseen != 0) {
            final var key = Engine.makeSymbolic<>();
            Engine.assume(!visited.containsKey(key));
            Engine.assume(v.containsKey(key));

            visited.set(key, Token.INSTANCE);

            res = res
                    .concat(toString(key))
                    .concat(": ")
                    .concat(toString(v.get(key)));

            if (unseen --> 1)
                res = res.concat(", ");
        }

        return res.concat("]");
    }

    public static String toString(final Object v) {
        return v == null ? "null" : v.toString();
    }

    public static String toString(final Object[] objects) {
        var str = "[";

        var counter = objects.length;
        Engine.assume(counter >= 0);
        for (int i = 0, c = counter; i < c; i++) {
            str = str.concat(toString(objects[i]));

            if (counter --> 1)
                str = str.concat(", ");
        }

        return str.concat("]");
    }

    // fool-proofing
    public static String toString(final String v) {
        return v == null ? "null" : v;
    }



    public static int hashCode(final boolean v) {
        // NOTE: copied from https://github.com/openjdk/jdk11/blob/master/src/java.base/share/classes/java/lang/Boolean.java#L227
        return v ? 1231 : 1237;
    }

    public static int hashCode(final byte v) {
        return (int) v;
    }

    public static int hashCode(final short v) {
        return (int) v;
    }

    public static int hashCode(final int v) {
        return v;
    }

    public static int hashCode(final long v) {
        return (int) (v ^ (v >>> 32));
    }

    public static int hashCode(final char v) {
        return (int) v;
    }

    public static int hashCode(final float v) {
        // FIXME: use less complex approach
        return Float.hashCode(v);
    }

    public static int hashCode(final double v) {
        // FIXME: use less complex approach
        return Double.hashCode(v);
    }

    public static int hashCode(final SymbolicList v) {
        // FIXME: use less complex approach
        int res = 1;

        final var count = v.size();
        Engine.assume(count >= 0);
        for (var i = 0; i < count; i++)
            res = 31 * res + hashCode(v.get(i));

        return res;
    }

    public static int hashCode(final SymbolicMap v) {
        // FIXME: use less complex approach
        int res = 1;

        var unseen = v.size();
        Engine.assume(unseen >= 0);

        final var visited = Engine.makeSymbolicMap<>();
        while (unseen != 0) {
            final var key = Engine.makeSymbolic(Object.class);
            Engine.assume(!visited.containsKey(key));
            Engine.assume(v.containsKey(key));

            res += hashCode(key) ^ hashCode(v.get(key));

            visited.set(key, Token.INSTANCE);
            unseen -= 1;
        }

        return res;
    }

    public static int hashCode(final Object v) {
        return v == null ? 0 : v.hashCode();
    }

    public static int hashCode(final Object[] objects) {
        if (objects == null)
            return 0;

        int res = 1;
        
        final var count = objects.length;
        Engine.assume(count >= 0);
        for (var i = 0; i < count; i++)
            res = 31 * res + hashCode(objects[i]);

        return res;
    }



    public static boolean equals(final boolean a, final boolean b) {
        return a == b;
    }

    public static boolean equals(final byte a, final byte b) {
        return a == b;
    }

    public static boolean equals(final short a, final short b) {
        return a == b;
    }

    public static boolean equals(final int a, final int b) {
        return a == b;
    }

    public static boolean equals(final long a, final long b) {
        return a == b;
    }

    public static boolean equals(final char a, final char b) {
        return a == b;
    }

    public static boolean equals(final float a, final float b) {
        // FIXME: use Float.compare(a, b) ?
        return a == b;
    }

    public static boolean equals(final double a, final double b) {
        // FIXME: use Double.compare(a, b) ?
        return a == b;
    }

    public static boolean equals(final SymbolicList a, final SymbolicList b) {
        if (a == b)
            return true;
        if (a == null || b == null)
            return false;

        var length = a.size();
        if (b.size() != length)
            return false;

        Engine.assume(length >= 0);
        for (var i = 0; i < length; i++)
            if (!equals(a.get(i), b.get(i)))
                return false;

        return true;
    }

    public static boolean equals(final SymbolicMap a, final SymbolicMap b) {
        if (a == b)
            return true;
        if (a == null || b == null)
            return false;

        var length = a.size();
        if (b.size() != length)
            return false;

        Engine.assume(length >= 0);
        final var visited = Engine.makeSymbolicMap();
        while (length != 0) {
            final var key = Engine.makeSymbolic(Object.class);
            Engine.assume(a.containsKey(key));
            Engine.assume(!visited.containsKey(key));

            if (!equals(a.get(key), b.get(key)))
                return false;

            visited.set(key, Token.INSTANCE);
            length -= 1;
        }

        return true;
    }

    public static boolean equals(final Object a, final Object b) {
        if (a == b)
            return true;

        if (a == null && b != null)
            return false;

        return a.equals(b);
    }

    public static boolean equals(final Object[] a, final Object[] b) {
        if (a == b)
            return true;
        if (a == null || b == null)
            return false;

        var length = a.length;
        if (b.length != length)
            return false;

        Engine.assume(length >= 0);
        for (var i = 0; i < length; i++)
            if (!equals(a[i], b[i]))
                return false;

        return true;
    }



    // A marker class to attach unknown actions to. Makes it easier to do manual code inspections.
    public static final class UnknownAction {
    }



    // a helper class for complex "array-type"-related actions
    public static final class ArrayActions {

        public static <T> void copy(final T[] src, final int srcPos,
                                    final T[] dst, final int dstPos,
                                    final int count) {
            Engine.assume(src != null);
            Engine.assume(dst != null);

            // TODO: use Engine.memcpy instead (but check bounds!)

            for (int i = 0; i < count; i++)
                dst[dstPos + i] = src[srcPos + i];
        }

        public static <T> void fill(final T[] arr, final T value) {
            Engine.assume(arr != null);

            final var count = arr.length;
            Engine.assume(count >= 0);
            for (int i = 0; i < count; i++)
                arr[i] = value;
        }

    }



    // a helper class for complex "list-type"-related actions
    public static final class ListActions {

        public static int find(final SymbolicList<?> list, final Object value,
                               final int from, final int to) {
            // general assumptions for this function to do something useful
            Engine.assume(0 <= from);
            Engine.assume(from < to);
            Engine.assume(list != null);

            final var idx = Engine.makeSymbolicInt();
            Engine.assume(from <= idx);
            Engine.assume(idx < to);

            final var something = list.get(idx);
            return value == something
                    ? idx : -1;
        }

    }



    // a helper class for complex "map-type"-related actions
    public static final class MapActions {

        ;

    }

}
