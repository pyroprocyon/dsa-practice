package arrays;

import com.ctambaoan.arrays.IsPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeTest {

  @Test
  void standardPalindrome() {
    assertTrue(IsPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
  }

  @Test
  void nonPalindrome() {
    assertFalse(IsPalindrome.isPalindrome("race a car"));
  }

  @Test
  void emptyStringIsPalindrome() {
    assertTrue(IsPalindrome.isPalindrome(" "));
  }
}
