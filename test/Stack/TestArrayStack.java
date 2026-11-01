package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stack.ArrayStack;

import java.util.List;

public class TestArrayStack {

    @Test
    public void push() {
        ArrayStack<Object> stack = new ArrayStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertFalse(stack.push(4));
        Assertions.assertIterableEquals(List.of(3,2,1),stack);
    }

    @Test
    public void pop() {
        ArrayStack<Object> stack = new ArrayStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertNull(stack.pop());
    }
}
