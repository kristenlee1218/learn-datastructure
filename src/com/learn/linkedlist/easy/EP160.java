package com.learn.linkedlist.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 两个单链表的头节点 headA 和 headB，请找出并返回
 * 两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null
 */
public class EP160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
