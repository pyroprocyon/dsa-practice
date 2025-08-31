package stacks_queues;

import com.ctambaoan.stacks_queues.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

  @Test
  void simpleValidCase() {
    assertTrue(ValidParentheses.isValid("()"));
  }

  @Test
  void complexValidCase() {
    assertTrue(ValidParentheses.isValid("()[]{}"));
  }

  @Test
  void nestedValidCase() {
    assertTrue(ValidParentheses.isValid("{[]}"));
  }

  @Test
  void simpleInvalidCase() {
    assertFalse(ValidParentheses.isValid("(]"));
  }

  @Test
  void unclosedBracketsInvalid() {
    assertFalse(ValidParentheses.isValid("([)"));
  }

  @Test
  void startingWithClosingBracketInvalid() {
    assertFalse(ValidParentheses.isValid("]"));
  }

  @Test
  void oddNumberOfBracketsInvalid() {
    assertFalse(ValidParentheses.isValid("([)"));
  }

  @Test
  void case6() {
    assertFalse(ValidParentheses.isValid("([}}])"));
  }
}
