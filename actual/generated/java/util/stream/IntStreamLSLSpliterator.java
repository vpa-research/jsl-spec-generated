// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - java/util/stream/IntStream.lsl:45
//  - java/util/stream/IntStream.Spliterator.lsl:19
//
package generated.java.util.stream;

import generated.runtime.LibSLGlobals;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * IntStreamSpliteratorAutomaton for IntStreamLSLSpliterator ~> java.util.stream.IntStreamLSLSpliterator
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.java.util.stream.IntStreamLSLSpliterator.class)
public class IntStreamLSLSpliterator implements LibSLRuntime.Automaton, Spliterator.OfInt {
    static {
        Engine.assume(true);
    }

    public IntStreamLSL parent;

    public int characteristics;

    public int fence;

    public int index;

    @LibSLRuntime.AutomatonConstructor
    public IntStreamLSLSpliterator(Void __$lsl_token, final byte p0, final IntStreamLSL p1,
            final int p2, final int p3, final int p4) {
        this.parent = p1;
        this.characteristics = p2;
        this.fence = p3;
        this.index = p4;
    }

    @LibSLRuntime.AutomatonConstructor
    public IntStreamLSLSpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, 0, 0, 0);
    }

    /**
     * [SUBROUTINE] IntStreamSpliteratorAutomaton::_getFence() -> int
     * Source: java/util/stream/IntStream.Spliterator.lsl:60
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            if (this.fence < 0) {
                Engine.assume(this.parent != null);
                this.fence = ((IntStreamLSL) ((Object) this.parent)).length;
            }
            result = this.fence;
        }
        return result;
    }

    /**
     * [SUBROUTINE] IntStreamSpliteratorAutomaton::_hasCharacteristics(int) -> boolean
     * Source: java/util/stream/IntStream.Spliterator.lsl:72
     */
    private boolean _hasCharacteristics(int _characteristics) {
        boolean result = false;
        /* body */ {
            result = (this.characteristics & _characteristics) == _characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::characteristics(IntStreamLSLSpliterator) -> int
     * Source: java/util/stream/IntStream.Spliterator.lsl:80
     */
    public int characteristics() {
        int result = 0;
        /* body */ {
            result = this.characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::trySplit(IntStreamLSLSpliterator) -> Spliterator_OfInt
     * Source: java/util/stream/IntStream.Spliterator.lsl:86
     */
    public Spliterator.OfInt trySplit() {
        Spliterator.OfInt result = null;
        /* body */ {
            final int hi = _getFence();
            final int lo = this.index;
            final int mid = (lo + hi) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                result = (stub.java.util.stream.IntStreamLSLSpliterator) ((Object) new IntStreamLSLSpliterator((Void) null, 
                    /* state = */ IntStreamLSLSpliterator.__$lsl_States.Initialized, 
                    /* parent = */ this.parent, 
                    /* characteristics = */ this.characteristics, 
                    /* fence = */ mid, 
                    /* index = */ lo
                ));
            }
            this.index = mid;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::forEachRemaining(IntStreamLSLSpliterator, IntConsumer) -> void
     * Source: java/util/stream/IntStream.Spliterator.lsl:106
     */
    public void forEachRemaining(IntConsumer _action) {
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            Engine.assume(this.parent != null);
            final int[] a = ((IntStreamLSL) ((Object) this.parent)).storage;
            int hi = this.fence;
            int i = this.index;
            this.index = hi;
            for (i = i; i < hi; i += 1) {
                final int item = a[i];
                _action.accept(item);
            }
            ;
        }
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::forEachRemaining(IntStreamLSLSpliterator, Consumer) -> void
     * Source: java/util/stream/IntStream.Spliterator.lsl:132
     */
    public void forEachRemaining(Consumer _action) {
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            Engine.assume(this.parent != null);
            final int[] a = ((IntStreamLSL) ((Object) this.parent)).storage;
            int hi = this.fence;
            int i = this.index;
            this.index = hi;
            for (i = i; i < hi; i += 1) {
                final int item = a[i];
                _action.accept(item);
            }
            ;
        }
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::tryAdvance(IntStreamLSLSpliterator, IntConsumer) -> boolean
     * Source: java/util/stream/IntStream.Spliterator.lsl:158
     */
    public boolean tryAdvance(IntConsumer _action) {
        boolean result = false;
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int hi = _getFence();
            final int i = this.index;
            if (i < hi) {
                Engine.assume(this.parent != null);
                this.index = i + 1;
                final int[] parentStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
                final int item = parentStorage[i];
                _action.accept(item);
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::tryAdvance(IntStreamLSLSpliterator, Consumer) -> boolean
     * Source: java/util/stream/IntStream.Spliterator.lsl:185
     */
    public boolean tryAdvance(Consumer _action) {
        boolean result = false;
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            final int hi = _getFence();
            final int i = this.index;
            if (i < hi) {
                Engine.assume(this.parent != null);
                this.index = i + 1;
                final int[] parentStorage = ((IntStreamLSL) ((Object) this.parent)).storage;
                final int item = parentStorage[i];
                _action.accept(item);
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::estimateSize(IntStreamLSLSpliterator) -> long
     * Source: java/util/stream/IntStream.Spliterator.lsl:212
     */
    public long estimateSize() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::getComparator(IntStreamLSLSpliterator) -> Comparator
     * Source: java/util/stream/IntStream.Spliterator.lsl:218
     */
    public Comparator getComparator() {
        Comparator result = null;
        /* body */ {
            if (_hasCharacteristics(LibSLGlobals.SPLITERATOR_SORTED)) {
                result = null;
            } else {
                throw new IllegalStateException();
            }
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::getExactSizeIfKnown(IntStreamLSLSpliterator) -> long
     * Source: java/util/stream/IntStream.Spliterator.lsl:227
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] IntStreamSpliteratorAutomaton::hasCharacteristics(IntStreamLSLSpliterator, int) -> boolean
     * Source: java/util/stream/IntStream.Spliterator.lsl:233
     */
    public boolean hasCharacteristics(int _characteristics) {
        boolean result = false;
        /* body */ {
            result = _hasCharacteristics(_characteristics);
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(IntStreamLSLSpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
