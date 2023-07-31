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
    }

    public interface HasAutomaton {
        Automaton __$lsl_getAutomaton();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InsteadOf {
        String value();
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

    public static boolean hasAutomaton(final Object obj, final Class<? extends Automaton> type) {
        if (!hasAutomaton(obj))
            return false;

        return type.isInstance(getAutomatonFrom(obj));
    }

    public static boolean hasAutomaton(final Object obj) {
        return obj instanceof HasAutomaton;
    }

    /**
     * <b> You have to be sure the automaton exists in the provided object!<b>
     */
    public static Automaton getAutomatonFrom(final Object obj) {
        Engine.assume(obj instanceof HasAutomaton);
        final var objWithAutomaton = ((HasAutomaton) obj);
        Engine.assume(objWithAutomaton != null);

        final var automaton = objWithAutomaton.__$lsl_getAutomaton();
        Engine.assume(automaton != null);

        return automaton;
    }

    /**
     * <b> You have to be sure the automaton exists in the provided object!<b>
     */
    public static <T extends Automaton> T getAutomatonFrom(final Object obj, final Class<T> expectedAutomaton) {
        Engine.assume(obj != null);
        Engine.assume(expectedAutomaton != null);

        final var automaton = getAutomatonFrom(obj);
        Engine.assume(expectedAutomaton.isInstance(automaton));

        @SuppressWarnings("unchecked") var result = (T) automaton;
        return result;
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

    public static String toString(final float v) {
        // FIXME: use less complex approach
        return Float.toString(v);
    }

    public static String toString(final double v) {
        // FIXME: use less complex approach
        return Double.toString(v);
    }

    public static String toString(final Object v) {
        return v == null ? "null" : v.toString();
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

    public static int hashCode(final Object v) {
        return v == null ? 0 : v.hashCode();
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

    public static boolean equals(final Object a, final Object b) {
        if (a == b)
            return true;

        if (a == null && b != null)
            return false;

        return a.equals(b);
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
            
            for (int i = 0, c = arr.length; i < c; i++)
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

            final var key = Engine.makeSymbolic(Integer.class);
            Engine.assume(key != null);
            Engine.assume(from <= key);
            Engine.assume(key < to);

            final var something = list.get(key);
            return value == something && list.containsKey(key)
                    ? key : -1;
        }

    }



    // a helper class for complex "map-type"-related actions
    public static final class MapActions {

        ;

    }

}
