// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/stream/IntStream.lsl:45
//
package stub.java.util.stream;

import java.lang.InternalError;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import runtime.LibSLRuntime;

@SuppressWarnings({"all", "unchecked"})
public class IntStreamLSLSpliterator implements LibSLRuntime.HasAutomaton, Spliterator.OfInt {
    private IntStreamLSLSpliterator(Void a, Void b) {
        super();
    }

    public int characteristics() {
        throw new InternalError();
    }

    public Spliterator.OfInt trySplit() {
        throw new InternalError();
    }

    public void forEachRemaining(IntConsumer _action) {
        throw new InternalError();
    }

    public void forEachRemaining(Consumer _action) {
        throw new InternalError();
    }

    public boolean tryAdvance(IntConsumer _action) {
        throw new InternalError();
    }

    public boolean tryAdvance(Consumer _action) {
        throw new InternalError();
    }

    public long estimateSize() {
        throw new InternalError();
    }

    public Comparator getComparator() {
        throw new InternalError();
    }

    public long getExactSizeIfKnown() {
        throw new InternalError();
    }

    public boolean hasCharacteristics(int _characteristics) {
        throw new InternalError();
    }
}
