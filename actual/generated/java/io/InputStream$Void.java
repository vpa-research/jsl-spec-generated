// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.io;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.IllegalArgumentException;
import java.lang.IndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.Void;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * VoidInputStreamAutomaton for VoidInputStream ~> java.io.InputStream$Void
 */
@Approximate(stub.java.io.InputStream$Void.class)
public final class InputStream$Void implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    public volatile boolean closed;

    @LibSLRuntime.AutomatonConstructor
    public InputStream$Void(Void __$lsl_token, final byte p0, final boolean p1) {
        this.closed = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public InputStream$Void(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, false);
    }

    /**
     * [SUBROUTINE] VoidInputStreamAutomaton::_checkFromIndexSize(int, int, int) -> void
     */
    private void _checkFromIndexSize(int fromIndex, int size, int length) {
        /* body */ {
            if (((length | fromIndex | size) < 0) || (size > (length - fromIndex))) {
                throw new IndexOutOfBoundsException("Range [%s, %<s + %s) out of bounds for length %s");
            }
        }
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::available(VoidInputStream) -> int
     */
    public int available() throws java.io.IOException {
        int result = 0;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = 0;
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::close(VoidInputStream) -> void
     */
    public void close() throws java.io.IOException {
        /* body */ {
            this.closed = true;
        }
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::mark(VoidInputStream, int) -> void
     */
    public synchronized void mark(int readlimit) {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::markSupported(VoidInputStream) -> boolean
     */
    public boolean markSupported() {
        boolean result = false;
        /* body */ {
            result = false;
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::read(VoidInputStream) -> int
     */
    public int read() throws java.io.IOException {
        int result = 0;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = -1;
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::read(VoidInputStream, array<byte>) -> int
     */
    public int read(byte[] b) throws java.io.IOException {
        int result = 0;
        /* body */ {
            if (b.length == 0) {
                result = 0;
            } else {
                if (this.closed) {
                    throw new IOException("Stream closed");
                }
                result = -1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::read(VoidInputStream, array<byte>, int, int) -> int
     */
    public int read(byte[] b, int off, int len) throws java.io.IOException {
        int result = 0;
        /* body */ {
            _checkFromIndexSize(off, len, b.length);
            if (len == 0) {
                result = 0;
            } else {
                if (this.closed) {
                    throw new IOException("Stream closed");
                }
                result = -1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::readAllBytes(VoidInputStream) -> array<byte>
     */
    public byte[] readAllBytes() throws java.io.IOException {
        byte[] result = null;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = new byte[0];
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::readNBytes(VoidInputStream, array<byte>, int, int) -> int
     */
    public int readNBytes(byte[] b, int off, int len) throws java.io.IOException {
        int result = 0;
        /* body */ {
            _checkFromIndexSize(off, len, b.length);
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = 0;
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::readNBytes(VoidInputStream, int) -> array<byte>
     */
    public byte[] readNBytes(int len) throws java.io.IOException {
        byte[] result = null;
        /* body */ {
            if (len < 0) {
                throw new IllegalArgumentException("len < 0");
            } else {
                if (this.closed) {
                    throw new IOException("Stream closed");
                }
                result = new byte[0];
            }
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::reset(VoidInputStream) -> void
     */
    public synchronized void reset() throws java.io.IOException {
        /* body */ {
            throw new IOException("mark/reset not supported");
        }
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::skip(VoidInputStream, long) -> long
     */
    public long skip(long n) throws java.io.IOException {
        long result = 0L;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = 0L;
        }
        return result;
    }

    /**
     * [FUNCTION] VoidInputStreamAutomaton::transferTo(VoidInputStream, OutputStream) -> long
     */
    public long transferTo(OutputStream out) throws java.io.IOException {
        long result = 0L;
        /* body */ {
            if (out == null) {
                throw new NullPointerException();
            }
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            result = 0L;
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(InputStream$Void.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
