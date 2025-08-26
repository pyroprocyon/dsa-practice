package com.ctambaoan.arrays;

public class ProductExceptSelf {
  public static int[] productExceptSelf(int[] nums) {
    int[] sol = new int[nums.length];
    int left = 1;
    for (int i = 0; i < nums.length; i++) {
      sol[i] = left;
      left *= nums[i];
    }
    int right = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      sol[i] *= right;
      right *= nums[i];
    }
    return sol;
  }
}
