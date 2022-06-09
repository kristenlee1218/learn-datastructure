package com.learn.linkedlist.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description : 给定一个已排序的链表的头 head，删除所有重复的元素，
 * 使每个元素只出现一次。返回已排序的链表
 */
public class EP83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
