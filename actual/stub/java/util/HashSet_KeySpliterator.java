// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/HashSet.lsl:33
//
package stub.java.util;

import java.lang.InternalError;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.HashMap;
import java.util.Spliterator;
import java.util.function.Consumer;
import runtime.LibSLRuntime;

@SuppressWarnings({"all", "unchecked"})
public final class HashSet_KeySpliterator implements LibSLRuntime.HasAutomaton, Spliterator {
    private HashSet_KeySpliterator(Void a, Void b) {
        super();
    }

    private HashSet_KeySpliterator(HashMap source, int origin, int fence, int est,
            int expectedModCount) {
        throw new InternalError();
    }

    public long estimateSize() {
        throw new InternalError();
    }

    public int characteristics() {
        throw new InternalError();
    }

    public void forEachRemaining(Consumer userAction) {
        throw new InternalError();
    }

    public boolean tryAdvance(Consumer userAction) {
        throw new InternalError();
    }

    public Spliterator trySplit() {
        throw new InternalError();
    }
}
