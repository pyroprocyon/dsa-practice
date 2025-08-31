package stacks_queues;

import com.ctambaoan.stacks_queues.MovingAverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovingAverageTest {

  @Test
  void movingAverageShouldUpdateCorrectly() {
    MovingAverage movingAverage = new MovingAverage(3);

    assertEquals(1.0, movingAverage.next(1));     // stream: [1], avg: 1/1 = 1
    assertEquals(5.5, movingAverage.next(10));    // stream: [1, 10], avg: (1+10)/2 = 5.5
    assertEquals(4.666, movingAverage.next(3), 0.001); // stream: [1, 10, 3], avg: (1+10+3)/3 = 4.666...
    assertEquals(6.0, movingAverage.next(5));     // stream: [10, 3, 5], avg: (10+3+5)/3 = 6.0
  }
}