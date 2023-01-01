package trampoline;

public class TrampolineRunner<T> {
    private Trampoline<T> trampoline;

    public TrampolineRunner(Trampoline<T> trampoline) {
        this.trampoline = trampoline;
    }


    public T run() {
        while (trampoline instanceof More<T>) {
            trampoline = ((More<T>) trampoline).apply();
        }
        return ((Done<T>) trampoline).value();
    }
}