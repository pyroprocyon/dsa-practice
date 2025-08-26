package com.ctambaoan.arrays;

public class RotateImage {
  public static void rotate(int[][] matrix) {
    int length = matrix.length;
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      int start = 0;
      int end = matrix.length - 1;
      while (start < end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
        start++;
        end--;
      }
    }
  }
}
