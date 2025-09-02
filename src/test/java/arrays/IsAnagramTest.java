package arrays;

import com.ctambaoan.arrays.IsAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsAnagramTest {

  @Test
  void shouldReturnTrueForValidAnagrams() {
    assertTrue(IsAnagram.isAnagram("anagram", "nagaram"));
  }

  @Test
  void shouldReturnFalseForInvalidAnagrams() {
    assertFalse(IsAnagram.isAnagram("rat", "car"));
  }

  @Test
  void shouldReturnFalseForDifferentLengths() {
    assertFalse(IsAnagram.isAnagram("a", "ab"));
  }

  @Test
  void shouldHandleUnicodeCharacters() {
    assertTrue(IsAnagram.isAnagram(" M  o o n     S t a r e r ", "Astronomer"));
  }
}
