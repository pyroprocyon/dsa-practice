package com.ctambaoan.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Objects;

public class MinStack {
  private final Deque<Integer> mainStack = new ArrayDeque<>();
  private final Deque<Integer> minStack = new ArrayDeque<>();

  public void push(int val) {
    mainStack.push(val);
    if (minStack.isEmpty() || minStack.peek() >= val) {
      minStack.push(val);
    }
  }

  public void pop() {
    int num = mainStack.pop();
    if (Objects.equals(minStack.peek(), num)) {
      minStack.pop();
    }
  }

  public int top() {
    if (mainStack.isEmpty()) throw new EmptyStackException();
    return mainStack.peek();
  }

  public int getMin() {
    if (minStack.isEmpty()) throw new EmptyStackException();
    return minStack.peek();
  }
}
