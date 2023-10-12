// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.lang;

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
 * System_InputStreamAutomaton for System_InputStream ~> java.lang.System_InputStream
 */
@Approximate(stub.java.lang.System_InputStream.class)
public final class System_InputStream implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    public final int maxSize;

    public int dataSize;

    public byte[] data;

    public volatile boolean closed;

    @LibSLRuntime.AutomatonConstructor
    public System_InputStream(Void __$lsl_token, final byte p0, final int p1, final int p2,
            final byte[] p3, final boolean p4) {
        this.maxSize = p1;
        this.dataSize = p2;
        this.data = p3;
        this.closed = p4;
    }

    @LibSLRuntime.AutomatonConstructor
    public System_InputStream(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized, 0, -1, null, false);
    }

    /**
     * [SUBROUTINE] System_InputStreamAutomaton::_checkFromIndexSize(int, int, int) -> void
     */
    private void _checkFromIndexSize(int fromIndex, int size, int length) {
        /* body */ {
            if (((length | fromIndex | size) < 0) || (size > (length - fromIndex))) {
                throw new IndexOutOfBoundsException("Range [%s, %<s + %s) out of bounds for length %s");
            }
        }
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::available(System_InputStream) -> int
     */
    public int available() throws java.io.IOException {
        int result = 0;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = 0;
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::close(System_InputStream) -> void
     */
    public void close() throws java.io.IOException {
        /* body */ {
            this.closed = true;
        }
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::mark(System_InputStream, int) -> void
     */
    public synchronized void mark(int readlimit) {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::markSupported(System_InputStream) -> boolean
     */
    public boolean markSupported() {
        boolean result = false;
        /* body */ {
            result = false;
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::read(System_InputStream) -> int
     */
    public int read() throws java.io.IOException {
        int result = 0;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = -1;
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::read(System_InputStream, array<byte>) -> int
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
                if (this.data == null) {
                    Engine.assume(this.maxSize > 0);
                    final int newSize = Engine.makeSymbolicInt();
                    Engine.assume(0 <= newSize);
                    Engine.assume(newSize < this.maxSize);
                    this.dataSize = newSize;
                    if (newSize == 0) {
                        this.data = new byte[0];
                    } else {
                        this.data = Engine.makeSymbolicByteArray(newSize);
                    }
                }
                result = -1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::read(System_InputStream, array<byte>, int, int) -> int
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
                if (this.data == null) {
                    Engine.assume(this.maxSize > 0);
                    final int newSize = Engine.makeSymbolicInt();
                    Engine.assume(0 <= newSize);
                    Engine.assume(newSize < this.maxSize);
                    this.dataSize = newSize;
                    if (newSize == 0) {
                        this.data = new byte[0];
                    } else {
                        this.data = Engine.makeSymbolicByteArray(newSize);
                    }
                }
                result = -1;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::readAllBytes(System_InputStream) -> array<byte>
     */
    public byte[] readAllBytes() throws java.io.IOException {
        byte[] result = null;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = new byte[0];
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::readNBytes(System_InputStream, array<byte>, int, int) -> int
     */
    public int readNBytes(byte[] b, int off, int len) throws java.io.IOException {
        int result = 0;
        /* body */ {
            _checkFromIndexSize(off, len, b.length);
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = 0;
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::readNBytes(System_InputStream, int) -> array<byte>
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
                if (this.data == null) {
                    Engine.assume(this.maxSize > 0);
                    final int newSize = Engine.makeSymbolicInt();
                    Engine.assume(0 <= newSize);
                    Engine.assume(newSize < this.maxSize);
                    this.dataSize = newSize;
                    if (newSize == 0) {
                        this.data = new byte[0];
                    } else {
                        this.data = Engine.makeSymbolicByteArray(newSize);
                    }
                }
                result = new byte[0];
            }
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::reset(System_InputStream) -> void
     */
    public synchronized void reset() throws java.io.IOException {
        /* body */ {
            throw new IOException("mark/reset not supported");
        }
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::skip(System_InputStream, long) -> long
     */
    public long skip(long n) throws java.io.IOException {
        long result = 0L;
        /* body */ {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = 0L;
        }
        return result;
    }

    /**
     * [FUNCTION] System_InputStreamAutomaton::transferTo(System_InputStream, OutputStream) -> long
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
            if (this.data == null) {
                Engine.assume(this.maxSize > 0);
                final int newSize = Engine.makeSymbolicInt();
                Engine.assume(0 <= newSize);
                Engine.assume(newSize < this.maxSize);
                this.dataSize = newSize;
                if (newSize == 0) {
                    this.data = new byte[0];
                } else {
                    this.data = Engine.makeSymbolicByteArray(newSize);
                }
            }
            result = 0L;
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(System_InputStream.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
