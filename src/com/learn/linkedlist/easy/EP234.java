package com.learn.linkedlist.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 一个单链表的头节点 head，请判断该链表是否为回文链表。
 * 如果是，返回 true；否则，返回 false
 */
public class EP234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int front = 0;
        int back = list.size() - 1;
        while (front < back) {
            if (!list.get(front).equals(list.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
