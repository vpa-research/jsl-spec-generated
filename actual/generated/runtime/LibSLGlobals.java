// Generated by the LibSL translator.  DO NOT EDIT!
// source: *global variables*
//
package generated.runtime;

import generated.java.util.Optional;
import generated.java.util.OptionalDouble;
import generated.java.util.OptionalInt;
import generated.java.util.OptionalLong;
import java.lang.Object;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;

@Approximate(runtime.LibSLGlobals.class)
public final class LibSLGlobals {
    public static final Optional EMPTY_OPTIONAL;

    public static final OptionalDouble EMPTY_OPTIONAL_DOUBLE;

    public static final OptionalInt EMPTY_OPTIONAL_INT;

    public static final OptionalLong EMPTY_OPTIONAL_LONG;

    public static final int MAX_CODE_POINT;

    public static final int MIN_CODE_POINT;

    public static final int MIN_HIGH_SURROGATE;

    public static final int MIN_LOW_SURROGATE;

    public static final int MIN_SUPPLEMENTARY_CODE_POINT;

    public static final Object SOMETHING;

    public static final int SPLITERATOR_CONCURRENT;

    public static final int SPLITERATOR_DISTINCT;

    public static final int SPLITERATOR_IMMUTABLE;

    public static final int SPLITERATOR_NONNULL;

    public static final int SPLITERATOR_ORDERED;

    public static final int SPLITERATOR_SIZED;

    public static final int SPLITERATOR_SORTED;

    public static final int SPLITERATOR_SUBSIZED;

    public static final boolean SYSTEM_IS_WINDOWS;

    static {
        EMPTY_OPTIONAL = new Optional((Void) null, 
                /* state = */ Optional.__$lsl_States.Initialized, 
                /* value = */ null);
        EMPTY_OPTIONAL_DOUBLE = new OptionalDouble((Void) null, 
                /* state = */ OptionalDouble.__$lsl_States.Initialized, 
                /* value = */ 0.0d, 
                /* present = */ false);
        EMPTY_OPTIONAL_INT = new OptionalInt((Void) null, 
                /* state = */ OptionalInt.__$lsl_States.Initialized, 
                /* value = */ 0, 
                /* present = */ false);
        EMPTY_OPTIONAL_LONG = new OptionalLong((Void) null, 
                /* state = */ OptionalLong.__$lsl_States.Initialized, 
                /* value = */ 0L, 
                /* present = */ false);
        MAX_CODE_POINT = 1114111;
        MIN_CODE_POINT = 0;
        MIN_HIGH_SURROGATE = 55296;
        MIN_LOW_SURROGATE = 56320;
        MIN_SUPPLEMENTARY_CODE_POINT = 65536;
        SOMETHING = new java.lang.Object();
        SPLITERATOR_CONCURRENT = 4096;
        SPLITERATOR_DISTINCT = 1;
        SPLITERATOR_IMMUTABLE = 1024;
        SPLITERATOR_NONNULL = 256;
        SPLITERATOR_ORDERED = 16;
        SPLITERATOR_SIZED = 64;
        SPLITERATOR_SORTED = 4;
        SPLITERATOR_SUBSIZED = 16384;
        SYSTEM_IS_WINDOWS = Engine.makeSymbolicBoolean();
    }

    @Approximate(LibSLGlobals.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
