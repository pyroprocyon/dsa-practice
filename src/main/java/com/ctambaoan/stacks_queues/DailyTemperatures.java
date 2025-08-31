package com.ctambaoan.stacks_queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatures {
  public static int[] dailyTemperatures(int[] temps) {
    Deque<Integer> stack = new ArrayDeque<>();
    int[] sol = new int[temps.length];
    Arrays.fill(sol, 0);

    for (int i = 0; i < temps.length; i++) {
      while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
        int index = stack.pop();
        sol[index] = i - index;
      }
      stack.push(i);
    }
    return sol;
  }
}