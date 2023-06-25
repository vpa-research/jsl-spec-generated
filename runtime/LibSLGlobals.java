// LibSL globals class
package runtime;

import actual.java.util.OptionalDouble;
import actual.java.util.OptionalDoubleAutomaton;

class LibSLGlobals {
    static {
        EMPTY_OPTIONAL_DOUBLE = new OptionalDouble(new OptionalDoubleAutomaton(OptionalDoubleAutomaton.__$lsl_States.Initialized, 0.0f, false));
    }

    public final OptionalDouble EMPTY_OPTIONAL_DOUBLE;
}
