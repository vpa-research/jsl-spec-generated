// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.lang;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * LSLSecurityManagerAutomaton for LSLSecurityManager ~> java.lang.SecurityManager
 */
@Approximate(java.lang.SecurityManager.class)
public class SecurityManager implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    @LibSLRuntime.AutomatonConstructor
    public SecurityManager(Void __$lsl_token, final byte p0) {
        this.__$lsl_state = p0;
    }

    @LibSLRuntime.AutomatonConstructor
    public SecurityManager(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated);
    }

    /**
     * [CONSTRUCTOR] LSLSecurityManagerAutomaton::LSLSecurityManager(LSLSecurityManager) -> LSLSecurityManager
     */
    public SecurityManager() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkAccept(LSLSecurityManager, String, int) -> void
     */
    public void checkAccept(String host, int port) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (host == null) {
                throw new NullPointerException();
            }
            LibSLRuntime.todo();
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkAccess(LSLSecurityManager, Thread) -> void
     */
    public void checkAccess(Thread t) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkAccess(LSLSecurityManager, ThreadGroup) -> void
     */
    public void checkAccess(ThreadGroup g) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkConnect(LSLSecurityManager, String, int) -> void
     */
    public void checkConnect(String host, int port) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkConnect(LSLSecurityManager, String, int, Object) -> void
     */
    public void checkConnect(String host, int port, Object context) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkCreateClassLoader(LSLSecurityManager) -> void
     */
    public void checkCreateClassLoader() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkDelete(LSLSecurityManager, String) -> void
     */
    public void checkDelete(String file) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkExec(LSLSecurityManager, String) -> void
     */
    public void checkExec(String cmd) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (cmd == null) {
                throw new NullPointerException();
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkExit(LSLSecurityManager, int) -> void
     */
    public void checkExit(int status) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkLink(LSLSecurityManager, String) -> void
     */
    public void checkLink(String lib) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkListen(LSLSecurityManager, int) -> void
     */
    public void checkListen(int port) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkMulticast(LSLSecurityManager, InetAddress) -> void
     */
    public void checkMulticast(InetAddress maddr) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkMulticast(LSLSecurityManager, InetAddress, byte) -> void
     */
    public void checkMulticast(InetAddress maddr, byte ttl) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPackageAccess(LSLSecurityManager, String) -> void
     */
    public void checkPackageAccess(String pkg) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPackageDefinition(LSLSecurityManager, String) -> void
     */
    public void checkPackageDefinition(String pkg) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPermission(LSLSecurityManager, Permission) -> void
     */
    public void checkPermission(Permission perm) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPermission(LSLSecurityManager, Permission, Object) -> void
     */
    public void checkPermission(Permission perm, Object context) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPrintJobAccess(LSLSecurityManager) -> void
     */
    public void checkPrintJobAccess() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPropertiesAccess(LSLSecurityManager) -> void
     */
    public void checkPropertiesAccess() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkPropertyAccess(LSLSecurityManager, String) -> void
     */
    public void checkPropertyAccess(String key) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkRead(LSLSecurityManager, FileDescriptor) -> void
     */
    public void checkRead(FileDescriptor fd) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkRead(LSLSecurityManager, String) -> void
     */
    public void checkRead(String file) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkRead(LSLSecurityManager, String, Object) -> void
     */
    public void checkRead(String file, Object context) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkSecurityAccess(LSLSecurityManager, String) -> void
     */
    public void checkSecurityAccess(String _target) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (_target == null) {
                throw new NullPointerException();
            }
            if (_target.isEmpty()) {
                throw new IllegalArgumentException();
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkSetFactory(LSLSecurityManager) -> void
     */
    public void checkSetFactory() {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkWrite(LSLSecurityManager, FileDescriptor) -> void
     */
    public void checkWrite(FileDescriptor fd) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::checkWrite(LSLSecurityManager, String) -> void
     */
    public void checkWrite(String file) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException();
            }
        }
    }

    /**
     * [FUNCTION] LSLSecurityManagerAutomaton::getSecurityContext(LSLSecurityManager) -> Object
     */
    public Object getSecurityContext() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Object.class);
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(SecurityManager.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
