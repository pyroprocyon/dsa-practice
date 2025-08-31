package com.ctambaoan.stacks_queues;

import java.util.*;

public class TopKFrequent {
  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }
    queue.addAll(map.keySet());
    while (queue.size() > k) {
      queue.poll();
    }
    return queue.stream().mapToInt(a -> a).toArray();
  }
}
