package com.ctambaoan.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    if (nums == null || nums.length == 0) return false;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (!set.add(num)) return true;
    }
    return false;
  }
}
