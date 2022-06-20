package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description :
 */
public class EP1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode pre = head;
        ListNode last = head;

        while (pre != null) {
            for (int i = 0; i < m - 1; i++) {
                if (pre == null) {
                    break;
                }
                pre = pre.next;
            }
            for (int i = 0; i < m + n; i++) {
                if (last == null) {
                    break;
                }
                last = last.next;
            }
            if (pre != null) {
                pre.next = last;
                pre = last;
            }
        }
        return head;
    }
}
