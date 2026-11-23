package deque;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDeque {

    @Test
    public void offer(){
        LinkedListDeque<Integer> deque = new LinkedListDeque<>(5);
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        assertFalse(deque.offerLast(6));
        assertIterableEquals(List.of(3,2,1,4,5), deque);
    }
}
