// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.java.util.stream.LongStreamLSL;
import generated.runtime.LibSLGlobals;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Void;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * LongStreamSpliteratorAutomaton for LongStreamLSLSpliterator ~> java.util.LongStreamLSLSpliterator
 */
@Approximate(stub.java.util.LongStreamLSLSpliterator.class)
public class LongStreamLSLSpliterator implements LibSLRuntime.Automaton, Spliterator.OfLong {
    static {
        Engine.assume(true);
    }

    public LongStreamLSL parent;

    public int characteristics;

    public int fence;

    public int index;

    @LibSLRuntime.AutomatonConstructor
    public LongStreamLSLSpliterator(Void __$lsl_token, final byte p0, final LongStreamLSL p1,
            final int p2, final int p3, final int p4) {
        this.parent = p1;
        this.characteristics = p2;
        this.fence = p3;
        this.index = p4;
    }

    @LibSLRuntime.AutomatonConstructor
    public LongStreamLSLSpliterator(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, null, 0, 0, 0);
    }

    /**
     * [SUBROUTINE] LongStreamSpliteratorAutomaton::_getFence() -> int
     */
    private int _getFence() {
        int result = 0;
        /* body */ {
            if (this.fence < 0) {
                Engine.assume(this.parent != null);
                this.fence = ((LongStreamLSL) this.parent).length;
            }
            result = this.fence;
        }
        return result;
    }

    /**
     * [SUBROUTINE] LongStreamSpliteratorAutomaton::_hasCharacteristics(int) -> boolean
     */
    private boolean _hasCharacteristics(int _characteristics) {
        boolean result = false;
        /* body */ {
            result = (this.characteristics & _characteristics) == _characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::characteristics(LongStreamLSLSpliterator) -> int
     */
    public int characteristics() {
        int result = 0;
        /* body */ {
            result = this.characteristics;
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::trySplit(LongStreamLSLSpliterator) -> Spliterator_OfLong
     */
    public Spliterator.OfLong trySplit() {
        Spliterator.OfLong result = null;
        /* body */ {
            final int hi = _getFence();
            final int lo = this.index;
            final int mid = (lo + hi) >>> 1;
            if (lo >= mid) {
                result = null;
            } else {
                result = new LongStreamLSLSpliterator((Void) null, 
                    /* state = */ LongStreamLSLSpliterator.__$lsl_States.Initialized, 
                    /* parent = */ this.parent, 
                    /* characteristics = */ this.characteristics, 
                    /* fence = */ mid, 
                    /* index = */ lo
                );
            }
            this.index = mid;
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::forEachRemaining(LongStreamLSLSpliterator, LongConsumer) -> void
     */
    public void forEachRemaining(LongConsumer _action) {
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            Engine.assume(this.parent != null);
            final long[] a = ((LongStreamLSL) this.parent).storage;
            int hi = this.fence;
            int i = this.index;
            this.index = hi;
            for (i = i; i < hi; i += 1) {
                final long item = a[i];
                _action.accept(item);
            }
            ;
        }
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::forEachRemaining(LongStreamLSLSpliterator, Consumer) -> void
     */
    public void forEachRemaining(Consumer _action) {
        /* body */ {
            if (_action == null) {
                throw new NullPointerException();
            }
            Engine.assume(this.parent != null);
            final long[] a = ((LongStreamLSL) this.parent).storage;
            int hi = this.fence;
            int i = this.index;
            this.index = hi;
            for (i = i; i < hi; i += 1) {
                final long item = a[i];
                _action.accept(item);
            }
            ;
        }
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::tryAdvance(LongStreamLSLSpliterator, LongConsumer) -> boolean
     */
    public boolean tryAdvance(LongConsumer _action) {
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
                final long[] parentStorage = ((LongStreamLSL) this.parent).storage;
                final long item = parentStorage[i];
                _action.accept(item);
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::tryAdvance(LongStreamLSLSpliterator, Consumer) -> boolean
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
                final long[] parentStorage = ((LongStreamLSL) this.parent).storage;
                final long item = parentStorage[i];
                _action.accept(item);
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::estimateSize(LongStreamLSLSpliterator) -> long
     */
    public long estimateSize() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::getComparator(LongStreamLSLSpliterator) -> Comparator
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
     * [FUNCTION] LongStreamSpliteratorAutomaton::getExactSizeIfKnown(LongStreamLSLSpliterator) -> long
     */
    public long getExactSizeIfKnown() {
        long result = 0L;
        /* body */ {
            result = _getFence() - this.index;
        }
        return result;
    }

    /**
     * [FUNCTION] LongStreamSpliteratorAutomaton::hasCharacteristics(LongStreamLSLSpliterator, int) -> boolean
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

    @Approximate(LongStreamLSLSpliterator.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
