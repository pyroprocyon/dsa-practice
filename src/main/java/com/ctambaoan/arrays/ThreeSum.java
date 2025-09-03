package com.ctambaoan.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> sol = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int currentSum = nums[i] + nums[left] + nums[right];
        if (currentSum < 0) {
          left++;
        } else if (currentSum > 0) {
          right--;
        } else {
          sol.add(List.of(nums[i], nums[left], nums[right]));
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          left++;
          right--;
        }
      }
    }
    return sol;
  }
}
