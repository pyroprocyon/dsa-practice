package arrays;

import com.ctambaoan.arrays.MoveZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
  @Test
  void standardCase() {
    int[] nums = {0, 1, 0, 3, 12};
    int[] expected = {1, 3, 12, 0, 0};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  void noZeroes() {
    int[] nums = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  void allZeroes() {
    int[] nums = {0, 0, 0, 0};
    int[] expected = {0, 0, 0, 0};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  void zeroesAlreadyAtEnd() {
    int[] nums = {1, 3, 12, 0, 0};
    int[] expected = {1, 3, 12, 0, 0};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  void emptyArray() {
    int[] nums = {};
    int[] expected = {};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  void singleElement() {
    int[] nums = {0};
    int[] expected = {0};
    MoveZeroes.moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }
}
