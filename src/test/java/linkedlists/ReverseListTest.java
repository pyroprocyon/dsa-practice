package linkedlists;

import com.ctambaoan.linkedlists.ListNode;
import com.ctambaoan.linkedlists.ReverseList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseListTest {
  @Test
  void reverseStandardList() {
    // Create list 1 -> 2 -> 3
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    // Reverse it
    ListNode newHead = ReverseList.reverseList(head);

    // Check the new order 3 -> 2 -> 1
    assertEquals(3, newHead.val);
    assertEquals(2, newHead.next.val);
    assertEquals(1, newHead.next.next.val);
    assertNull(newHead.next.next.next, "The new tail should point to null");
  }
}
