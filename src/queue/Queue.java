package queue;

public interface Queue<E> {

    boolean offer(E value);

    E pool();

    E peek();

    boolean isEmpty();

    boolean isFull();



}
