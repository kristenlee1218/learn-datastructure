package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
