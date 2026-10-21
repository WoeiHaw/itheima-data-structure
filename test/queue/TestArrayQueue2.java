package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestArrayQueue2 {

    @Test
    public void offerLimit(){
        ArrayQueue2<Integer> queue = new ArrayQueue2<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        Assertions.assertFalse(queue.offer(4));
        Assertions.assertFalse(queue.offer(5));

        Assertions.assertIterableEquals(List.of(1,2,3),queue);
    }

    @Test
    public void peek() {
        ArrayQueue2<Integer> queue =  new ArrayQueue2<>(5);
        Assertions.assertNull(queue.peek());
        queue.offer(1);
        Assertions.assertEquals(1, queue.peek());
        queue.offer(2);
        Assertions.assertEquals(1, queue.peek());
    }



    @Test
    public void offer(){
        ArrayQueue2<Integer> queue = new ArrayQueue2<Integer>(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        Assertions.assertIterableEquals(List.of(1,2,3,4,5),queue);

    }

    @Test
    public void poll(){
        ArrayQueue2<Integer> queue = new ArrayQueue2<Integer>(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        Assertions.assertEquals(1,queue.pool());
        Assertions.assertEquals(2,queue.pool());
        Assertions.assertEquals(3,queue.pool());
        Assertions.assertEquals(4,queue.pool());
        Assertions.assertEquals(5,queue.pool());
        Assertions.assertNull(queue.pool());
    }
}
