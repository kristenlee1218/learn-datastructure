package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。
 * 已知此链表是一个整数数字的二进制表示形式。请返回该链表所表示数字的十进制值
 */
public class EP1290 {
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        while (head != null) {
            str.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(str.toString(), 2);
    }
}
