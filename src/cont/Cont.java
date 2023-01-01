package cont;

@FunctionalInterface
public interface Cont<T1, T2> {
    T1 apply(T2 value);
}

