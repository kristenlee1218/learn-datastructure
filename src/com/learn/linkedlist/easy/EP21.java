package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :将两个升序链表合并为一个新的升序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class EP21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = l1.val < l2.val ? l1 : l2;
        result.next = mergeTwoLists(result.next, l1.val < l2.val ? l2 : l1);
        return result;
    }
}
