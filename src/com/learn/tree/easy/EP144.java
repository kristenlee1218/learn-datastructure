package com.learn.tree.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/11
 * @description : 一棵二叉树的根节点 root，返回其节点值的先序遍历
 */
public class EP144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
