package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 一个链表的头节点 head 和一个整数 val，请删除链
 * 表中所有满足 Node.val == val 的节点，并返回新的头节点
 */
public class EP203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
