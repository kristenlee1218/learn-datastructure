package com.learn.doublePointers.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description :给定字符串 s 和 t，判断 s 是否为 t 的子序列
 */
public class EP392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
