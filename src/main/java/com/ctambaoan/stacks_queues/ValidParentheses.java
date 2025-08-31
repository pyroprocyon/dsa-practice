package com.ctambaoan.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {
  public static boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> map = Map.of(
        ')', '(',
        '}', '{',
        ']', '[');
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        if (stack.peek() == null || !stack.pop().equals(map.get(c))) return false;
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }
}
