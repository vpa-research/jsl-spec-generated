// Generated by the LibSL translator.  DO NOT EDIT!
// source: ?
//
package generated.java.util;

import generated.runtime.LibSLGlobals;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Void;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jacodb.approximation.annotation.Approximate;
import org.usvm.api.Engine;
import runtime.LibSLRuntime;

/**
 * OptionalAutomaton for LSLOptional ~> java.util.Optional
 */
@Approximate(java.util.Optional.class)
public final class Optional implements LibSLRuntime.Automaton {
    static {
        Engine.assume(true);
    }

    private byte __$lsl_state = __$lsl_States.Allocated;

    public Object value;

    @LibSLRuntime.AutomatonConstructor
    public Optional(Void __$lsl_token, final byte p0, final Object p1) {
        this.__$lsl_state = p0;
        this.value = p1;
    }

    @LibSLRuntime.AutomatonConstructor
    public Optional(final Void __$lsl_token) {
        this(__$lsl_token, __$lsl_States.Allocated, null);
    }

    /**
     * [CONSTRUCTOR] OptionalAutomaton::LSLOptional(LSLOptional) -> LSLOptional
     */
    private Optional() {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [CONSTRUCTOR] OptionalAutomaton::LSLOptional(LSLOptional, Object) -> LSLOptional
     */
    private Optional(Object obj) {
        this((Void) null);
        Engine.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    /**
     * [SUBROUTINE] OptionalAutomaton::_makeEmpty() -> LSLOptional
     */
    private static Optional _makeEmpty() {
        Optional result = null;
        /* body */ {
            result = LibSLGlobals.EMPTY_OPTIONAL;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::empty() -> LSLOptional
     */
    public static Optional empty() {
        Optional result = null;
        // WARNING: no state checks in static context
        /* body */ {
            result = _makeEmpty();
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::of(Object) -> LSLOptional
     */
    public static Optional of(Object obj) {
        Optional result = null;
        // WARNING: no state checks in static context
        /* body */ {
            if (obj == null) {
                throw new NullPointerException();
            }
            result = new Optional((Void) null, 
                /* state = */ Optional.__$lsl_States.Initialized, 
                /* value = */ obj
            );
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::ofNullable(Object) -> LSLOptional
     */
    public static Optional ofNullable(Object obj) {
        Optional result = null;
        // WARNING: no state checks in static context
        /* body */ {
            if (obj == null) {
                result = _makeEmpty();
            } else {
                result = new Optional((Void) null, 
                    /* state = */ Optional.__$lsl_States.Initialized, 
                    /* value = */ obj
                );
            }
        }
        // WARNING: no state transitions in static context
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::equals(LSLOptional, Object) -> boolean
     */
    public boolean equals(Object other) {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == this) {
                result = true;
            } else {
                final boolean isSameType = Engine.typeEquals(this, other);
                if (isSameType) {
                    final Object otherValue = ((Optional) other).value;
                    result = LibSLRuntime.equals(this.value, otherValue);
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::filter(LSLOptional, Predicate) -> LSLOptional
     */
    public Optional filter(Predicate predicate) {
        Optional result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (predicate == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                result = this;
            } else {
                final boolean sat = predicate.test(this.value);
                if (sat) {
                    result = this;
                } else {
                    result = _makeEmpty();
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::flatMap(LSLOptional, Function) -> LSLOptional
     */
    public Optional flatMap(Function mapper) {
        Optional result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (mapper == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                result = _makeEmpty();
            } else {
                result = ((Optional) mapper.apply(this.value));
                if (result == null) {
                    throw new NullPointerException();
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::get(LSLOptional) -> Object
     */
    public Object get() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value == null) {
                throw new NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::hashCode(LSLOptional) -> int
     */
    public int hashCode() {
        int result = 0;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = LibSLRuntime.hashCode(this.value);
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::ifPresent(LSLOptional, Consumer) -> void
     */
    public void ifPresent(Consumer consumer) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value != null) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(this.value);
            }
        }
    }

    /**
     * [FUNCTION] OptionalAutomaton::ifPresentOrElse(LSLOptional, Consumer, Runnable) -> void
     */
    public void ifPresentOrElse(Consumer consumer, Runnable emptyAction) {
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value != null) {
                if (consumer == null) {
                    throw new NullPointerException();
                }
                consumer.accept(this.value);
            } else {
                if (emptyAction == null) {
                    throw new NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    /**
     * [FUNCTION] OptionalAutomaton::isEmpty(LSLOptional) -> boolean
     */
    public boolean isEmpty() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value == null;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::isPresent(LSLOptional) -> boolean
     */
    public boolean isPresent() {
        boolean result = false;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.value != null;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::map(LSLOptional, Function) -> LSLOptional
     */
    public Optional map(Function mapper) {
        Optional result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (mapper == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                result = _makeEmpty();
            } else {
                final Object mappedValue = mapper.apply(this.value);
                if (mappedValue == null) {
                    result = _makeEmpty();
                } else {
                    result = new Optional((Void) null, 
                        /* state = */ Optional.__$lsl_States.Initialized, 
                        /* value = */ mappedValue
                    );
                }
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::or(LSLOptional, Supplier) -> LSLOptional
     */
    public Optional or(Supplier supplier) {
        Optional result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                result = ((Optional) supplier.get());
                if (result == null) {
                    throw new NullPointerException();
                }
            } else {
                result = this;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::orElse(LSLOptional, Object) -> Object
     */
    public Object orElse(Object other) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value == null) {
                result = other;
            } else {
                result = this.value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::orElseGet(LSLOptional, Supplier) -> Object
     */
    public Object orElseGet(Supplier supplier) {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                result = supplier.get();
            } else {
                result = this.value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::orElseThrow(LSLOptional) -> Object
     */
    public Object orElseThrow() {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value == null) {
                throw new NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::orElseThrow(LSLOptional, Supplier) -> Object
     */
    public Object orElseThrow(Supplier exceptionSupplier) throws java.lang.Throwable {
        Object result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (exceptionSupplier == null) {
                throw new NullPointerException();
            }
            if (this.value == null) {
                final Object exception = exceptionSupplier.get();
                throw ((Throwable) exception);
            } else {
                result = this.value;
            }
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::stream(LSLOptional) -> Stream
     */
    public Stream stream() {
        Stream result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = Engine.makeSymbolic(Stream.class);
            Engine.assume(result != null);
        }
        return result;
    }

    /**
     * [FUNCTION] OptionalAutomaton::toString(LSLOptional) -> String
     */
    public String toString() {
        String result = null;
        Engine.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.value == null) {
                result = "Optional.empty";
            } else {
                final String valueStr = LibSLRuntime.toString(this.value);
                result = "Optional[".concat(valueStr).concat("]");
            }
        }
        return result;
    }

    public static final class __$lsl_States {
        public static final byte Allocated = (byte) 0;

        public static final byte Initialized = (byte) 1;
    }

    @Approximate(Optional.class)
    public static final class __hook {
        private __hook(Void o1, Void o2) {
            Engine.assume(false);
        }
    }
}
