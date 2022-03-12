package medium;

import models.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class TwoSum {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode currentListNode = dummyHead;
        ListNode pointer1 = l1, pointer2 = l2;

        int carry = 0;

        while (pointer1 != null || pointer2 != null) {

            int x = pointer1 != null ? pointer1.val : 0;
            int y = pointer2 != null ? pointer2.val : 0;

            int sum = carry + x + y;

            currentListNode.next = new ListNode(sum % 10);
            carry = sum / 10;

            if (pointer1 != null) pointer1 = pointer1.next;
            if (pointer2 != null) pointer2 = pointer2.next;
            currentListNode = currentListNode.next;

        }

        if (carry > 0) {
            currentListNode.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
