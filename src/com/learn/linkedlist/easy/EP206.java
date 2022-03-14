package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :单链表的头节点 head ，请反转链表并返回反转后的链表
 */
public class EP206 {
    public ListNode reverse(ListNode list) {
        ListNode cur = list;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
