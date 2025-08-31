package com.ctambaoan.stacks_queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {
  private final Queue<Integer> queue;
  private final int window;
  private int sum;

  public MovingAverage(int window) {
    this.queue = new ArrayDeque<>();
    this.window = window;
  }

  public double next(int val) {
    queue.add(val);
    sum += val;
    if (queue.size() > window) {
      sum -= queue.poll();
    }
    return (double) sum / queue.size();
  }
}
