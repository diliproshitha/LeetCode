package medium;

import models.ListNode;
import utils.Utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        int[] array = {1};
        ListNode listNode = Utils.getLinkedListFromArray(array);
        ListNode removedList = removeNthFromEnd(listNode, 1);
        List<Integer> arrayListFromLinkedList = Utils.getArrayListFromLinkedList(removedList);
        System.out.println(arrayListFromLinkedList);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode slow = tempHead, fast = tempHead;

        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return tempHead.next;
    }
}
