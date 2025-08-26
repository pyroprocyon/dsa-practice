package com.ctambaoan.arrays;

import java.util.Arrays;

public class MoveZeroes {
  public static int[] moveZeroes(int[] nums) {
    int insertPos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[insertPos] = nums[i];
        insertPos++;
      }
    }
    Arrays.fill(nums, insertPos, nums.length, 0);
    return nums;
  }
}
