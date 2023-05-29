// Generated by the LibSL translator.  DO NOT EDIT!
// source: java\util\OptionalInt.lsl
//
package actual.java.util;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import ru.spbpu.usvm.api.EngineInterfacing;
import ru.spbpu.usvm.api.LibSLRuntime;

public final class OptionalIntAutomaton implements LibSLRuntime.Automaton {
    public __$lsl_States __$lsl_state = __$lsl_States.Allocated;

    private int value = 0;

    private boolean present = false;

    @LibSLRuntime.AutomatonConstructor
    public OptionalIntAutomaton(__$lsl_States __$lsl_state, int value, boolean present) {
        this.__$lsl_state = __$lsl_state;
        this.value = value;
        this.present = present;
    }

    @LibSLRuntime.AutomatonConstructor
    public OptionalIntAutomaton() {
        this(__$lsl_States.Allocated, 0, false);
    }

    public void OptionalInt(OptionalInt self) {
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public void OptionalInt(OptionalInt self, int x) {
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Allocated);
        /* body */ {
            LibSLRuntime.error("Private constructor call");
        }
        this.__$lsl_state = __$lsl_States.Initialized;
    }

    public static OptionalInt _makeEmpty() {
        OptionalInt result;
        /* body */ {
            result = new OptionalInt(new OptionalIntAutomaton(OptionalIntAutomaton.__$lsl_States.Initialized, 0, false));
        }
        return result;
    }

    public static void _throwNPE() {
        /* body */ {
            throw new java.lang.NullPointerException();
        }
    }

    public static OptionalInt empty() {
        OptionalInt result;
        // WARNING: no state checks in static context
        /* body */ {
            result = _makeEmpty();
        }
        // WARNING: no state transitions in static context
        return result;
    }

    public static OptionalInt of(int x) {
        OptionalInt result;
        // WARNING: no state checks in static context
        /* body */ {
            result = new OptionalInt(new OptionalIntAutomaton(OptionalIntAutomaton.__$lsl_States.Initialized, x, true));
        }
        // WARNING: no state transitions in static context
        return result;
    }

    public boolean equals(OptionalInt self, Object other) {
        boolean result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (other == self) {
                result = true;
            } else {
                final boolean isSameType = EngineInterfacing.isSameType(self, other);
                if (isSameType) {
                    final int otherValue = ((OptionalIntAutomaton) ((LibSLRuntime.HasAutomaton) other).__$lsl_getAutomaton()).value;
                    final boolean otherPresent = ((OptionalIntAutomaton) ((LibSLRuntime.HasAutomaton) other).__$lsl_getAutomaton()).present;
                    if (this.present && otherPresent) {
                        result = this.value == otherValue;
                    } else {
                        result = this.present == otherPresent;
                    }
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public int getAsInt(OptionalInt self) {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    public int hashCode(OptionalInt self) {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                result = EngineInterfacing.hashCode(this.value);
            } else {
                result = 0;
            }
        }
        return result;
    }

    public void ifPresent(OptionalInt self, IntConsumer consumer) {
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            }
        }
    }

    public void ifPresentOrElse(OptionalInt self, IntConsumer consumer, Runnable emptyAction) {
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                if (consumer == null) {
                    throw new java.lang.NullPointerException();
                }
                consumer.accept(this.value);
            } else {
                if (emptyAction == null) {
                    throw new java.lang.NullPointerException();
                }
                emptyAction.run();
            }
        }
    }

    public boolean isEmpty(OptionalInt self) {
        boolean result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = !this.present;
        }
        return result;
    }

    public boolean isPresent(OptionalInt self) {
        boolean result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            result = this.present;
        }
        return result;
    }

    public int orElse(OptionalInt self, int other) {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                result = this.value;
            } else {
                result = other;
            }
        }
        return result;
    }

    public int orElseGet(OptionalInt self, IntSupplier supplier) {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (supplier == null) {
                throw new java.lang.NullPointerException();
            }
            if (this.present) {
                result = this.value;
            } else {
                result = supplier.get();
            }
        }
        return result;
    }

    public int orElseThrow(OptionalInt self) {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (!this.present) {
                throw new java.util.NoSuchElementException("No value present");
            }
            result = this.value;
        }
        return result;
    }

    public <X extends java.lang.Throwable> int orElseThrow(OptionalInt self,
            Supplier<T> exceptionSupplier) throws X {
        int result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (exceptionSupplier == null) {
                throw new java.lang.NullPointerException();
            }
            if (!this.present) {
                final Object exception = exceptionSupplier.get();
                throw ((Throwable) exception);
            } else {
                result = this.value;
            }
        }
        return result;
    }

    public IntStream stream(OptionalInt self) {
        IntStream result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            LibSLRuntime.not_implemented();
        }
        return result;
    }

    public String toString(OptionalInt self) {
        String result;
        EngineInterfacing.assume(this.__$lsl_state == __$lsl_States.Initialized);
        /* body */ {
            if (this.present) {
                final String valueStr = EngineInterfacing.toString(this.value);
                result = "OptionalInt[" + valueStr + "]";
            } else {
                result = "OptionalInt.empty";
            }
        }
        return result;
    }

    public enum __$lsl_States {
        Allocated,

        Initialized
    }
}
