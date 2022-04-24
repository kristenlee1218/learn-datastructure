package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :输入两个递增排序的链表，合并这两个链表
 * 并使新链表中的节点仍然是递增排序的
 */
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;

            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}
