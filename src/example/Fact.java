package example;

import cont.Cont;
import cont.IdCont;

public class Fact {
    public static int fact(int n, Cont<Integer, Integer> cont) {
        if (n == 0) {
            return cont.apply(1);
        } else {
            return fact(n - 1, value -> cont.apply(n * value));
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(10, new IdCont<>()));
    }
}
