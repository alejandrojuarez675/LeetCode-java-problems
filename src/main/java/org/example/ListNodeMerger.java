package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNodeMerger {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> resultList = new ArrayList<>();

        ListNode node1 = list1;
        ListNode node2 = list2;
        while (node1 != null || node2 != null) {
            if (node1 == null || (node2 != null && node2.val < node1.val)) {
                resultList.add(node2.val);
                node2 = node2.next;
            } else {
                resultList.add(node1.val);
                node1 = node1.next;
            }
        }

        ListNode lastValue = null;
        for (int i = resultList.size() - 1; i >= 0; i--) {
            lastValue = new ListNode(resultList.get(i), lastValue);
        }
        return lastValue;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}