// LibSL globals class
package runtime;

import actual.java.util.OptionalDouble;
import actual.java.util.OptionalDoubleAutomaton;

public class LibSLGlobals {
    public static final OptionalDouble EMPTY_OPTIONAL_DOUBLE;

    static {
        EMPTY_OPTIONAL_DOUBLE = new OptionalDouble(new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, 0.0f, false));
    }
}
