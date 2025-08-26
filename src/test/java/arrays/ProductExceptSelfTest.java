package arrays;

import com.ctambaoan.arrays.ProductExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductExceptSelfTest {

  @Test
  void standardCase() {
    int[] nums = {1, 2, 3, 4};
    int[] expected = {24, 12, 8, 6};
    assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
  }

  @Test
  void withZero() {
    int[] nums = {1, 2, 0, 4};
    int[] expected = {0, 0, 8, 0};
    assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
  }

  @Test
  void withNegativeNumbers() {
    int[] nums = {-1, 1, 2, -2};
    int[] expected = {-4, 4, 2, -2};
    assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
  }

  @Test
  void withTwoZeroes() {
    int[] nums = {0, 0, 1, 2};
    int[] expected = {0, 0, 0, 0};
    assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
  }
}
