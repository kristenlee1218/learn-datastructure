package com.learn.math.easy;

import java.util.HashSet;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 一个三位数整数 n。如果经过以下修改得到的数字恰好包含数字 1 到 9 各一次且不包含任何 0，
 * 那么称数字 n 是 迷人的：将 n 与数字 2 * n 和 3 * n 连接。如果 n 是迷人的，返回 true，否则返回 false
 */
public class EP2729 {
    public boolean isFascinating(int n) {
        String s = "" + n + 2 * n + 3 * n;
        if (s.length() != 9) {
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                return false;
            }
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
