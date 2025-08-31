package stacks_queues;

import com.ctambaoan.stacks_queues.DailyTemperatures;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {
  @Test
  void dailyTemperaturesTest1() {
    int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
    assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(temps));
  }

  @Test
  void dailyTemperaturesTest2() {
    int[] temps = {30, 40, 50, 60};
    int[] expected = {1, 1, 1, 0};
    assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(temps));
  }

  @Test
  void dailyTemperaturesTest3() {
    int[] temps = {30, 60, 90};
    int[] expected = {1, 1, 0};
    assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(temps));
  }
}
