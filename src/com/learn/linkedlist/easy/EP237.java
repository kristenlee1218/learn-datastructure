package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :假定已知链表的某一个中间节点，将该节点从链表中删除
 */
public class EP237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
