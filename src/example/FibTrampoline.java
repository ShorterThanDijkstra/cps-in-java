package example;

import cont.Cont;
import trampoline.Done;
import trampoline.More;
import trampoline.Trampoline;
import trampoline.TrampolineRunner;

public class FibTrampoline {
    public static Trampoline<Integer> fibTrampoline(int n, Cont<Trampoline<Integer>, Integer> cont) {
        if (n < 2) {
            return cont.apply(n);
        } else {
            return new More<>(() -> fibTrampoline(n - 1,
                    value0 -> fibTrampoline(n - 2,
                            value1 -> cont.apply(value0 + value1))));
        }
    }

    public static void main(String[] args) {
        TrampolineRunner<Integer> runner = new TrampolineRunner<>(fibTrampoline(30, Done::new));
        System.out.println(runner.run());
    }
}
