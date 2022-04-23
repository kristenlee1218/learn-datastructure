package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个链表，输出该链表中倒数第 k 个节点。为了符合
 * 大多数人的习惯，本题从 1 开始计数，即链表的尾节点是倒数第 1 个节点
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
