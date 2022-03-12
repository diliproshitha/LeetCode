package utils;

import models.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static ListNode getLinkedListFromArray(int[] array) {
        if (array.length == 0) return null;

        ListNode head = new ListNode(array[0]);
        ListNode listNode = head;

        for (int i = 1; i < array.length; i++) {
            listNode.next = new ListNode(array[i]);
            listNode = listNode.next;
        }

        return head;
    }

    public static List<Integer> getArrayListFromLinkedList(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }

        return list;
    }
}
