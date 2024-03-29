// Generated by the LibSL translator.  DO NOT EDIT!
// sources:
//  - libsl/utils/VoidOutputStream.lsl:15
//  - libsl/utils/VoidOutputStream.main.lsl:16
//
package generated.libsl.utils;

import java.io.IOException;
import java.lang.IndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.SuppressWarnings;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * VoidOutputStreamAutomaton for VoidOutputStream ~> libsl.utils.VoidOutputStream
 */
@SuppressWarnings({"all", "unchecked"})
@Approximate(stub.libsl.utils.VoidOutputStream.class)
public final class VoidOutputStream implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    public volatile boolean closed;

    @LibSLRuntime.AutomatonConstructor
    public VoidOutputStream(Void __$lsl_token, final byte p0, final boolean p1) {
        this.closed = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public VoidOutputStream(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, false);
    }

    /**
     * [SUBROUTINE] VoidOutputStreamAutomaton::_checkFromIndexSize(int, int, int) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:47
     */
    private void _checkFromIndexSize(int fromIndex, int size, int length) {
        /* body */ {
            if (((length | fromIndex | size) < 0) || (size > (length - fromIndex))) {
                throw new IndexOutOfBoundsException("Range [%s, %<s + %s) out of bounds for length %s");
            }
        }
    }

    /**
     * [FUNCTION] VoidOutputStreamAutomaton::close(VoidOutputStream) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:61
     */
    public void close() {
        /* body */ {
            this.closed = true;
        }
    }

    /**
     * [FUNCTION] VoidOutputStreamAutomaton::flush(VoidOutputStream) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:67
     */
    public void flush() throws java.io.IOException {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] VoidOutputStreamAutomaton::write(VoidOutputStream, array<byte>) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:75
     */
    public void write(byte[] b) throws java.io.IOException {
        /* body */ {
            if (b == null) {
                throw new NullPointerException();
            }
            if (this.closed) {
                throw new IOException("Stream closed");
            }
        }
    }

    /**
     * [FUNCTION] VoidOutputStreamAutomaton::write(VoidOutputStream, array<byte>, int, int) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:86
     */
    public void write(byte[] b, int off, int len) throws java.io.IOException {
        /* body */ {
            _checkFromIndexSize(off, len, b.length);
            if (this.closed) {
                throw new IOException("Stream closed");
            }
        }
    }

    /**
     * [FUNCTION] VoidOutputStreamAutomaton::write(VoidOutputStream, int) -> void
     * Source: libsl/utils/VoidOutputStream.main.lsl:94
     */
    public void write(int b) throws java.io.IOException {
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(VoidOutputStream.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
