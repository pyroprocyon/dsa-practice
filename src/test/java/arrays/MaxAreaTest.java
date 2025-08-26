package arrays;

import com.ctambaoan.arrays.MaxArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaTest {

  @Test
  void standardCase() {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    assertEquals(49, MaxArea.maxArea(height));
  }

  @Test
  void simpleCase() {
    int[] height = {1, 1};
    assertEquals(1, MaxArea.maxArea(height));
  }

  @Test
  void descendingHeights() {
    int[] height = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    assertEquals(20, MaxArea.maxArea(height));
  }

  @Test
  void ascendingHeights() {
    int[] height = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertEquals(20, MaxArea.maxArea(height));
  }
}
