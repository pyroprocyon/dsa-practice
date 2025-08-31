package stacks_queues;

import com.ctambaoan.stacks_queues.TopKFrequent;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentTest {
  @Test
  void standardCase() {
    int[] nums = {1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] expected = {1, 2};
    int[] result = TopKFrequent.topKFrequent(nums, k);
    Arrays.sort(result); // Sort for consistent comparison
    assertArrayEquals(expected, result);
  }

  @Test
  void singleElementCase() {
    int[] nums = {1};
    int k = 1;
    int[] expected = {1};
    assertArrayEquals(expected, TopKFrequent.topKFrequent(nums, k));
  }
}
