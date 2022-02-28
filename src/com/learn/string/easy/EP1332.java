package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个字符串 s，它仅由字母 'a' 和 'b' 组成。每一次删除
 * 操作都可以从 s 中删除一个回文子序列。返回删除给定字符串中所有字符
 * （字符串为空）的最小删除次数
 *
 * 「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改
 * 变原字符顺序得到，那么这个字符串就是原字符串的一个子序列
 *
 * 「回文」定义：如果一个字符串向后和向前读是一致的，
 * 那么这个字符串就是一个回文
 */
public class EP1332 {
    public int removePalindromeSub(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 2;
            }
        }
        return s.length() - 1 == -1 ? 0 : 1;
    }
}
