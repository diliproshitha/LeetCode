package easy;

import models.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;

        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                currentNode.next = new ListNode(p1.val);
                p1 = p1.next;
            }
            else {
                currentNode.next = new ListNode(p2.val);
                p2 = p2.next;
            }

            currentNode = currentNode.next;
        }

        while (p1 != null) {
            currentNode.next = new ListNode(p1.val);
            currentNode = currentNode.next;
            p1 = p1.next;
        }

        while (p2 != null) {
            currentNode.next = new ListNode(p2.val);
            currentNode = currentNode.next;
            p2 = p2.next;
        }

        return dummyHead.next;
    }
}
