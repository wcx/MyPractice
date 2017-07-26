package com.wcx.leetcode;

import java.util.List;

/**
 * Created by wcx on 17-7-21.
 */
public class pro2 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            l1.next = l2;
            ListNode l = l1;
            int sum = 9;
            int a = sum / 10;
            int b = sum % 10;

            System.out.println(String.valueOf(a));
            System.out.println(String.valueOf(b));
//            while (l != null) {
//                System.out.println(l.val);
//                l = l.next;
//            }
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode l = new ListNode(0);
        ListNode r = l;
        while (l1.next != null && l2.next != null) {

            int sum = l.val + l1.val + l2.val;
            if (sum > 9) {
                l.val = sum % 10;
                l.next = new ListNode(1);
            } else {
                l.val = sum;
                l.next = new ListNode(0);
            }
            l = l.next;
            l1 = l1.next;
            l2 = l2.next;
            if (l2 == null) {
                l2 = new ListNode(0);
            }

        }
        return null;
    }
}

