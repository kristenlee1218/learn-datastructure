package com.learn.tree.easy;

import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/11
 * @description :树的定义
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        val = val;
    }

    public Node(int val, List<Node> children) {
        val = val;
        children = children;
    }
}