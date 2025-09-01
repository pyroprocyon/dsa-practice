package linkedlists;

import com.ctambaoan.linkedlists.ListNode;
import com.ctambaoan.linkedlists.MergeTwoLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoListsTest {

  @Test
  void standardMergeCase() {
    // list1: 1 -> 2 -> 4
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    // list2: 1 -> 3 -> 4
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    // Expected: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    ListNode result = MergeTwoLists.mergeTwoLists(l1, l2);
    assertEquals(1, result.val);
    assertEquals(1, result.next.val);
    // ... and so on
  }

  @Test
  void oneListEmpty() {
    ListNode l1 = new ListNode(1);
    ListNode result = MergeTwoLists.mergeTwoLists(l1, null);
    assertEquals(1, result.val);
  }
}