package com.ctambaoan.arrays;

import java.util.*;

public class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] key = str.toCharArray();
      Arrays.sort(key);
      map.computeIfAbsent(new String(key), k -> new ArrayList<>()).add(str);
    }
    return map.values().stream().toList();
  }
}
