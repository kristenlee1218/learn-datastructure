package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :单链表的头节点 head ，请反转链表并返回反转后的链表
 */
public class EP206 {
    public ListNode reverse(ListNode list) {
        ListNode curr = list;
        ListNode pre = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
