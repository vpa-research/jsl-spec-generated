// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.lang;

import generated.runtime.LibSLGlobals;
import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.SecurityException;
import java.lang.SecurityManager;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;
import java.lang.Void;
import java.util.Properties;
import jdk.internal.misc.VM;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;
import stub.runtime.utils.SymbolicInputStream;

/**
 * SystemAutomaton for LSLSystem ~> java.lang.System
 */
@Approximate(java.lang.System.class)
public final class System implements LibSLRuntime.Automaton {
    private static final LibSLRuntime.Map<String, String> propsMap = new LibSLRuntime.Map<>(new LibSLRuntime.HashMapContainer<>());

    private static volatile SecurityManager security = null;

    private static Properties props = null;

    private static Console console = null;

    public static InputStream in = null;

    public static PrintStream out = null;

    public static PrintStream err = null;

    private static final long NANOTIME_BEGINNING_OF_TIME = 1000L;

    private static final long NANOTIME_WARP_MAX = 1000L;

    private static final LibSLRuntime.Map<Object, Integer> identityHashCodeMap = new LibSLRuntime.Map<>(new LibSLRuntime.IdentityMapContainer<>());

    static {
        /* SystemAutomaton::__clinit__() */ {
            initPhase1();
            initPhase2();
            initPhase3();
        }
    }

    @LibSLRuntime.AutomatonConstructor
    public System(Void __$lsl_token, final byte p0) {
    }

    @LibSLRuntime.AutomatonConstructor
    public System(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Initialized);
    }

    /**
     * [CONSTRUCTOR] SystemAutomaton::LSLSystem(LSLSystem) -> LSLSystem
     */
    private System() {
        this((Void) null);
        /* body */ {
        }
    }

    /**
     * [SUBROUTINE] SystemAutomaton::_initProperties() -> void
     */
    private static void _initProperties() {
        /* body */ {
            final LibSLRuntime.Map<String, String> pm = propsMap;
            final int javaVersion = 8;
            final String userName = "Admin";
            pm.set("file.encoding", "Cp1251");
            pm.set("sun.io.unicode.encoding", "UnicodeLittle");
            pm.set("sun.jnu.encoding", "Cp1251");
            pm.set("sun.stderr.encoding", "cp866");
            pm.set("sun.stdout.encoding", "cp866");
            final String[] versionStrings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };
            final String versionString = versionStrings[javaVersion];
            pm.set("java.specification.name", "Java Platform API Specification");
            pm.set("java.specification.vendor", "Oracle Corporation");
            pm.set("java.specification.version", versionString);
            pm.set("java.vm.info", "mixed mode");
            pm.set("java.vm.name", "OpenJDK 64-Bit Server VM");
            pm.set("java.vm.specification.name", "Java Virtual Machine Specification");
            pm.set("java.vm.specification.vendor", "Oracle Corporation");
            pm.set("java.vm.specification.version", versionString);
            pm.set("java.vm.vendor", "Eclipse Adoptium");
            pm.set("java.vm.version", versionString.concat(".0.362+9"));
            pm.set("java.library.path", "C:\\Program Files\\Eclipse Adoptium\\jdk-8.0.362.9-hotspot\\bin;C:\\Windows\\Sun\\Java\\bin;C:\\Windows\\system32;.");
            pm.set("java.home", "C:\\Program Files\\Eclipse Adoptium\\jdk-8.0.362.9-hotspot");
            pm.set("sun.boot.library.path", "C:\\Program Files\\Eclipse Adoptium\\jdk-8.0.362.9-hotspot\\bin");
            pm.set("java.io.tmpdir", "T:\\Temp\\");
            pm.set("java.class.path", ".");
            if (LibSLGlobals.SYSTEM_IS_WINDOWS) {
                pm.set("file.separator", "\\");
                pm.set("line.separator", "\r\n");
                pm.set("path.separator", ";");
            } else {
                pm.set("file.separator", "/");
                pm.set("line.separator", "\n");
                pm.set("path.separator", ":");
            }
            pm.set("user.country", "RU");
            pm.set("user.country.format", "US");
            pm.set("user.language", "ru");
            final String[] bytecodeVersions = { "?", "?", "?", "?", "?", "49.0", "50.0", "51.0", "52.0", "53.0", "54.0", "55.0", "?", "?", "?", "?" };
            pm.set("java.class.version", bytecodeVersions[javaVersion]);
            pm.set("os.arch", "amd64");
            pm.set("os.name", "Windows 10");
            pm.set("os.version", "10.0");
            pm.set("sun.arch.data.model", "64");
            pm.set("sun.cpu.endian", "little");
            pm.set("sun.cpu.isalist", "amd64");
            pm.set("sun.desktop", "windows");
            pm.set("user.dir", "D:\\Company\\Prod\\Service");
            pm.set("user.home", "C:\\Users\\".concat(userName));
            pm.set("user.name", userName);
            pm.set("user.script", "");
            pm.set("user.timezone", "");
            pm.set("user.variant", "");
            pm.set("sun.java.command", "org.example.MainClass");
            pm.set("awt.toolkit", "sun.awt.windows.WToolkit");
            pm.set("java.awt.graphicsenv", "sun.awt.Win32GraphicsEnvironment");
            pm.set("java.awt.printerjob", "sun.awt.windows.WPrinterJob");
            pm.set("sun.java.launcher", "SUN_STANDARD");
            pm.set("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers");
            pm.set("sun.nio.MaxDirectMemorySize", "-1");
            pm.set("sun.os.patch.level", "");
            pm.set("java.vm.compressedOopsMode", "Zero based");
            pm.set("jdk.boot.class.path.append", "");
            pm.set("jdk.debug", "release");
            props = null;
        }
    }

    /**
     * [SUBROUTINE] SystemAutomaton::initPhase1() -> void
     */
    private static void initPhase1() {
        /* body */ {
            _initProperties();
            final InputStream newInput = (SymbolicInputStream) ((Object) new generated.runtime.utils.SymbolicInputStream((Void) null, 
                /* state = */ generated.runtime.utils.SymbolicInputStream.__$lsl_States.Initialized, 
                /* maxSize = */ 1000, 
                /* supportMarks = */ false, 
                /* dataSize = */ -1, 
                /* data = */ null, 
                /* closed = */ false, 
                /* pos = */ 0, 
                /* markPos = */ -1, 
                /* markLimit = */ 0
            ));
            in = newInput;
            out = (stub.java.lang.System_PrintStream) ((Object) new System_PrintStream((Void) null, 
                /* state = */ System_PrintStream.__$lsl_States.Initialized, 
                /* closed = */ false, 
                /* error = */ false
            ));
            err = (stub.java.lang.System_PrintStream) ((Object) new System_PrintStream((Void) null, 
                /* state = */ System_PrintStream.__$lsl_States.Initialized, 
                /* closed = */ false, 
                /* error = */ false
            ));
            VM.initLevel(1);
        }
    }

    /**
     * [SUBROUTINE] SystemAutomaton::initPhase2() -> int
     */
    private static int initPhase2() {
        int result = 0;
        /* body */ {
            VM.initLevel(2);
            result = 0;
        }
        return result;
    }

    /**
     * [SUBROUTINE] SystemAutomaton::initPhase3() -> void
     */
    private static void initPhase3() {
        /* body */ {
            security = null;
            VM.initLevel(3);
            VM.initLevel(4);
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::clearProperty(String) -> String
     */
    public static String clearProperty(String key) {
        String result = null;
        /* body */ {
            if (key == null) {
                throw new NullPointerException("key can't be null");
            }
            if (key.length() == 0) {
                throw new NullPointerException("key can't be empty");
            }
            if (propsMap.hasKey(key)) {
                result = propsMap.get(key);
                propsMap.remove(key);
            }
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::console() -> Console
     */
    public static Console console() {
        Console result = null;
        /* body */ {
            result = console;
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::exit(int) -> void
     */
    public static void exit(int status) {
        /* body */ {
            LibSLRuntime.error("Unexpected shutdown");
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::gc() -> void
     */
    public static void gc() {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::getProperties() -> Properties
     */
    public static Properties getProperties() {
        Properties result = null;
        /* body */ {
            result = props;
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::getProperty(String) -> String
     */
    public static String getProperty(String key) {
        String result = null;
        /* body */ {
            if (key == null) {
                throw new NullPointerException("key can't be null");
            }
            if (key.length() == 0) {
                throw new NullPointerException("key can't be empty");
            }
            if (propsMap.hasKey(key)) {
                result = propsMap.get(key);
            } else {
                result = null;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::getProperty(String, String) -> String
     */
    public static String getProperty(String key, String def) {
        String result = null;
        /* body */ {
            if (key == null) {
                throw new NullPointerException("key can't be null");
            }
            if (key.length() == 0) {
                throw new NullPointerException("key can't be empty");
            }
            if (propsMap.hasKey(key)) {
                result = propsMap.get(key);
            } else {
                result = def;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::getSecurityManager() -> SecurityManager
     */
    public static SecurityManager getSecurityManager() {
        SecurityManager result = null;
        /* body */ {
            result = security;
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::getenv(String) -> String
     */
    public static String getenv(String name) {
        String result = null;
        /* body */ {
            result = Engine.makeSymbolic(String.class);
            Engine.assume(result != null);
            final int len = result.length();
            Engine.assume(len >= 0);
            Engine.assume(len < 250);
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::identityHashCode(Object) -> int
     */
    public static int identityHashCode(Object x) {
        int result = 0;
        /* body */ {
            if (x == null) {
                result = 0;
            } else {
                if (identityHashCodeMap.hasKey(x)) {
                    final Integer value = identityHashCodeMap.get(x);
                    Engine.assume(value != null);
                    result = value.intValue();
                } else {
                    result = identityHashCodeMap.size();
                    final Integer hash = Integer.valueOf(result);
                    identityHashCodeMap.set(x, hash);
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::lineSeparator() -> String
     */
    public static String lineSeparator() {
        String result = null;
        /* body */ {
            result = propsMap.get("line.separator");
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::load(String) -> void
     */
    public static void load(String filename) {
        /* body */ {
            if (filename == null) {
                throw new NullPointerException();
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException("<message>");
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new UnsatisfiedLinkError("<message>");
            }
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::loadLibrary(String) -> void
     */
    public static void loadLibrary(String libname) {
        /* body */ {
            if (libname == null) {
                throw new NullPointerException();
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new SecurityException("<message>");
            }
            if (Engine.makeSymbolicBoolean()) {
                throw new UnsatisfiedLinkError("<message>");
            }
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::mapLibraryName(String) -> String
     */
    public static String mapLibraryName(String libname) {
        String result = null;
        /* body */ {
            if (libname == null) {
                throw new NullPointerException();
            }
            final int len = libname.length();
            if (len > 240) {
                throw new IllegalArgumentException("name too long");
            }
            if (LibSLGlobals.SYSTEM_IS_WINDOWS) {
                result = libname.concat(".dll");
            } else {
                if (LibSLGlobals.SYSTEM_IS_MAC) {
                    result = "lib".concat(libname).concat(".dylib");
                } else {
                    result = "lib".concat(libname).concat(".so");
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::runFinalization() -> void
     */
    public static void runFinalization() {
        /* body */ {
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::setErr(PrintStream) -> void
     */
    public static void setErr(PrintStream stream) {
        /* body */ {
            final SecurityManager sm = security;
            if (sm != null) {
                sm.checkPermission(new RuntimePermission("setIO"));
            }
            err = stream;
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::setIn(InputStream) -> void
     */
    public static void setIn(InputStream stream) {
        /* body */ {
            final SecurityManager sm = security;
            if (sm != null) {
                sm.checkPermission(new RuntimePermission("setIO"));
            }
            in = stream;
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::setOut(PrintStream) -> void
     */
    public static void setOut(PrintStream stream) {
        /* body */ {
            final SecurityManager sm = security;
            if (sm != null) {
                sm.checkPermission(new RuntimePermission("setIO"));
            }
            out = stream;
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::setProperties(Properties) -> void
     */
    public static void setProperties(Properties p) {
        /* body */ {
            props = p;
        }
    }

    /**
     * [FUNCTION] SystemAutomaton::setProperty(String, String) -> String
     */
    public static String setProperty(String key, String value) {
        String result = null;
        /* body */ {
            if (key == null) {
                throw new NullPointerException("key can't be null");
            }
            if (key.length() == 0) {
                throw new NullPointerException("key can't be empty");
            }
            if (propsMap.hasKey(key)) {
                result = propsMap.get(key);
            } else {
                result = null;
            }
            propsMap.set(key, value);
        }
        return result;
    }

    /**
     * [FUNCTION] SystemAutomaton::setSecurityManager(SecurityManager) -> void
     */
    public static void setSecurityManager(SecurityManager s) {
        /* body */ {
            final SecurityManager sm = security;
            if (sm != null) {
                sm.checkPermission(new RuntimePermission("setSecurityManager"));
            }
            security = s;
        }
    }

    public static final class __$lsl_States {
        public static final byte Initialized = (byte) 0;
    }

    @Approximate(System.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
