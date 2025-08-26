package com.ctambaoan.arrays;

public class MaxArea {
  public static int maxArea(int[] height) {
    int maxSoFar = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int currentArea = Math.min(height[left], height[right]) * (right - left);
      maxSoFar = Math.max(maxSoFar, currentArea);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxSoFar;
  }
}
