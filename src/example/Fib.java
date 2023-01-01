package example;

import cont.Cont;
import cont.IdCont;

public class Fib {
    public static int fib(int n, Cont<Integer, Integer> cont) {
        if (n < 2) {
            return cont.apply(n);
        } else {
            return fib(n - 1, value0 -> fib(n - 2, value1 -> cont.apply(value0 + value1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(15, new IdCont<>()));

//        System.out.println(fib(16, new IdCont<>()));
    }
}
