package com.ctambaoan.arrays;

public class IsPalindrome {
  public static boolean isPalindrome(String str) {
    char[] chars = str.toLowerCase().toCharArray();
    int start = 0;
    int end = chars.length - 1;
    while (start < end) {
      while (!Character.isLetterOrDigit(chars[start]) && start < end) {
        start++;
      }
      while (!Character.isLetterOrDigit(chars[end]) && start < end) {
        end--;
      }
      if (chars[start] != chars[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
