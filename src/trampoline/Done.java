package trampoline;

public record Done<T>(T value) implements Trampoline<T> {

}