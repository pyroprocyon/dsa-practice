package arrays;

import com.ctambaoan.arrays.RotateImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateImageTest {
  @Test
  void standard3x3Case() {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int[][] expected = {
        {7, 4, 1},
        {8, 5, 2},
        {9, 6, 3}
    };
    RotateImage.rotate(matrix);
    assertArrayEquals(expected, matrix);
  }

  @Test
  void edgeCase2x2() {
    int[][] matrix = {
        {1, 2},
        {3, 4}
    };
    int[][] expected = {
        {3, 1},
        {4, 2}
    };
    RotateImage.rotate(matrix);
    assertArrayEquals(expected, matrix);
  }

  @Test
  void edgeCase1x1() {
    int[][] matrix = {{1}};
    int[][] expected = {{1}};
    RotateImage.rotate(matrix);
    assertArrayEquals(expected, matrix);
  }
}
