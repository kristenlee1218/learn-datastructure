package com.learn.linkedlist.easy;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 给定链表 head 和两个整数 m 和 n、
 * 遍历该链表并按照如下方式删除节点:
 * 开始时以头节点作为当前节点
 * 保留以当前节点开始的前 m 个节点
 * 删除接下来的 n 个节点
 * 重复步骤 2 和 3, 直到到达链表结尾
 * 在删除了指定结点之后, 返回修改过后的链表的头节点
 */
public class EP1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode pre = head;
        ListNode last = head;

        while (pre != null) {
            for (int i = 0; i < m - 1; i++) {
                if (pre == null) {
                    break;
                }
                pre = pre.next;
            }
            for (int i = 0; i < m + n; i++) {
                if (last == null) {
                    break;
                }
                last = last.next;
            }
            if (pre != null) {
                pre.next = last;
                pre = last;
            }
        }
        return head;
    }
}
