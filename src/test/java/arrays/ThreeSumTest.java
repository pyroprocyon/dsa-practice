package arrays;

import com.ctambaoan.arrays.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSumTest {

  @Test
  void standardCase() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertEquals(2, result.size());
    // A more robust test would check the contents regardless of order
  }

  @Test
  void noSolutionCase() {
    int[] nums = {1, 2, -4, -5};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertTrue(result.isEmpty());
  }

  @Test
  void arrayWithDuplicates() {
    int[] nums = {-2, 0, 0, 2, 2};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertEquals(1, result.size());
    assertEquals(Arrays.asList(-2, 0, 2), result.get(0));
  }

  @Test
  void allZeros() {
    int[] nums = {0, 0, 0, 0};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertEquals(1, result.size());
    assertEquals(Arrays.asList(0, 0, 0), result.get(0));
  }

  @Test
  void emptyArray() {
    int[] nums = {};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertTrue(result.isEmpty());
  }

  @Test
  void arrayTooSmall() {
    int[] nums = {1, -1};
    List<List<Integer>> result = ThreeSum.threeSum(nums);
    assertTrue(result.isEmpty());
  }
}
