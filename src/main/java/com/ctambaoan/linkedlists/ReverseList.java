package com.ctambaoan.linkedlists;

public class ReverseList {
  public static ListNode reverseList(ListNode head) {
    ListNode previous = null;
    ListNode current = head;
    while (current != null) {
      ListNode temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }
}
