package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点
 */
public class EP876 {
    public ListNode middleNode(ListNode head) {
        ListNode[] list = new ListNode[100];
        int i = 0;
        while (head != null) {
            list[i++] = head;
            head = head.next;
        }
        return list[i / 2];
    }
}
