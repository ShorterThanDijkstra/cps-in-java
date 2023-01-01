package trampoline;

import java.util.function.Supplier;

public record More<T>(Supplier<Trampoline<T>> run) implements Trampoline<T> {
    Trampoline<T> apply() {
        return run.get();
    }
}