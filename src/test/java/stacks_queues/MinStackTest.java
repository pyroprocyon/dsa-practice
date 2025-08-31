package stacks_queues;

import com.ctambaoan.stacks_queues.MinStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {
  @Test
  void minStackOperations() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);

    assertEquals(-3, minStack.getMin(), "After pushing -3, min should be -3");

    minStack.pop(); // Removes -3

    assertEquals(0, minStack.top(), "After popping, top should be 0");
    assertEquals(-2, minStack.getMin(), "After popping, min should be -2");
  }
}
