package stack;

public interface Stack<E> {

    boolean push(E e);
    E pop();
    E peek();
    boolean isEmpty();
    boolean isFull();
}
