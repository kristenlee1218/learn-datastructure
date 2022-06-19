package com.learn.linkedlist.easy;

import java.util.Objects;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : ListNode 的节点定义
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val && next.equals(listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }


}