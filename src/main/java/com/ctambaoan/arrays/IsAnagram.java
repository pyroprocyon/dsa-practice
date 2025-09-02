package com.ctambaoan.arrays;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
  public static boolean isAnagram(String s, String t) {
    s = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
    t = t.toLowerCase().replaceAll("[^a-zA-Z]", "");
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.merge(c, 1, Integer::sum);
    }

    for (char c : t.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) <= 0) {
        return false;
      }
      int count = map.get(c);
      if (count > 0) {
        map.put(c, count - 1);
      }
    }

    return true;
  }
}
