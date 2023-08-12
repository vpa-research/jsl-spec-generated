// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import java.util.ArrayList_ListItr;
import java.util.Iterator;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

@Approximate(ArrayList_ListItr.class)
public final class ArrayList_ListIterator implements LibSLRuntime.Automaton, Iterator {
    public byte __$lsl_state = __$lsl_States.Initialized;

    public ArrayList parent;

    public int cursor;

    public int expectedModCount;

    public int lastRet = -1;

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_ListIterator(final LibSLRuntime.Token __$lsl_token, final byte __$lsl_state,
            final ArrayList parent, final int cursor, final int expectedModCount,
            final int lastRet) {
        this.__$lsl_state = __$lsl_state;
        this.parent = parent;
        this.cursor = cursor;
        this.expectedModCount = expectedModCount;
        this.lastRet = lastRet;
    }

    @LibSLRuntime.AutomatonConstructor
    public ArrayList_ListIterator(final LibSLRuntime.Token __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, 0, 0, -1);
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::hasNext(ArrayList_ListIterator) -> boolean
     */
    public boolean hasNext() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = cursor != 0;
        }
        return result;
    }

    /**
     * [FUNCTION] ArrayList_ListIteratorAutomaton::next(ArrayList_ListIterator) -> Object
     */
    public Object next() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Object.class);
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }
}
