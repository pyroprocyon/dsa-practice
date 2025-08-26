package arrays;

import com.ctambaoan.arrays.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

  @Test
  void standardTrueCase() {
    assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
  }

  @Test
  void standardFalseCase() {
    assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
  }

  @Test
  void edgeCaseEmptyArray() {
    assertFalse(ContainsDuplicate.containsDuplicate(new int[0]));
  }

  @Test
  void edgeCaseSingleElement() {
    assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1}));
  }

  @Test
  void edgeCaseNullInput() {
    assertFalse(ContainsDuplicate.containsDuplicate(null));
  }
}
