package easy;

import models.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode[] listNodes = new ListNode[100];
        int counter = 0;
        ListNode currentNode = head;

        while(currentNode != null) {
            listNodes[counter++] = currentNode;
            currentNode = currentNode.next;
        }

        return listNodes[counter / 2];
    }
}
