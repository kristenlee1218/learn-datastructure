package com.learn.tree.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/21
 * @description : 给定一个 n 叉树的根节点 root，返回其节点值的后序遍历。
 * n 叉树在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔
 */
public class EP590 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        for (Node ch : root.children) {
            helper(ch, list);
        }
        list.add(root.val);
    }
}
