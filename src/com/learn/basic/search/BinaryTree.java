package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 斐波那契查找
 * 斐波那契查找（Fib Search）与折半查找很相似，是根据斐波那契序列的特点对有序表
 * 进行分割的。要求开始表中记录的个数为某个斐波那契数小 1，及 n=F(k)-1；开始将
 * k 值与第 F(k-1) 位置的记录进行比较及 mid = low + F(k-1)-1
 */
public class BinaryTree<Key extends Comparable<Key>, Value> {
    // 记录根结点
    private Node root;
    // 记录树中元素的个数
    private int count;

    // 获取树中元素的个数
    public int size() {
        return count;
    }

    // 向树中添加元素 key-value
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    // 向指定的树 x 中添加 key-value,并返回添加元素后新的树
    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            // 个数 +1
            count++;
            return new Node(key, value, null, null);
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            // 新结点的 key 大于当前结点的 key，继续找当前结点的右子结点
            x.right = put(x.right, key, value);
        } else if (cmp < 0) {
            // 新结点的 key 小于当前结点的 key，继续找当前结点的左子结点
            x.left = put(x.left, key, value);
        } else {
            // 新结点的 key 等于当前结点的 key，把当前结点的 value 进行替换
            x.value = value;
        }
        return x;
    }

    // 查询树中指定 key 对应的 value
    public Value get(Key key) {
        return get(root, key);
    }

    // 从指定的树 x 中，查找 key 对应的值
    public Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            // 如果要查询的 key 大于当前结点的 key，则继续找当前结点的右子结点
            return get(x.right, key);
        } else if (cmp < 0) {
            // 如果要查询的 key 小于当前结点的 key，则继续找当前结点的左子结点
            return get(x.left, key);
        } else {
            // 如果要查询的 key 等于当前结点的 key，则树中返回当前结点的 value
            return x.value;
        }
    }

    // 删除树中 key 对应的 value
    public void delete(Key key) {
        root = delete(root, key);
    }

    // 删除指定树 x 中的 key 对应的 value，并返回删除后的新树
    public Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            // 新结点的 key 大于当前结点的 key，继续找当前结点的右子结点
            x.right = delete(x.right, key);
        } else if (cmp < 0) {
            // 新结点的 key 小于当前结点的 key，继续找当前结点的左子结点
            x.left = delete(x.left, key);
        } else {
            // 新结点的 key 等于当前结点的 key,当前x就是要删除的结点
            // 1. 如果当前结点的右子树不存在，则直接返回当前结点的左子结点
            if (x.right == null) {
                return x.left;
            }
            // 2. 如果当前结点的左子树不存在，则直接返回当前结点的右子结点
            if (x.left == null) {
                return x.right;
            }
            // 3. 当前结点的左右子树都存在
            // 3.1 找到右子树中最小的结点
            Node minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            // 3.2 删除右子树中最小的结点
            Node n = x.right;
            while (n.left != null) {
                if (n.left.left == null) {
                    n.left = null;
                } else {
                    n = n.left;
                }
            }
            // 3.3 让被删除结点的左子树称为最小结点 minNode 的左子树，
            // 让被删除结点的右子树称为最小结点 minNode 的右子树
            minNode.left = x.left;
            minNode.right = x.right;
            // 3.4 让被删除结点的父节点指向最小结点 minNode
            x = minNode;
            // 个数-1
            count--;
        }
        return x;
    }

    public class Node {
        // 存储键
        public Key key;
        // 存储值
        private Value value;
        // 记录左子结点
        public Node left;
        // 记录右子结点
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
