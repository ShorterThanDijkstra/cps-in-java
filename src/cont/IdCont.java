package cont;

public class IdCont<T> implements Cont<T, T> {
    @Override
    public T apply(T value) {
        return value;
    }
}
