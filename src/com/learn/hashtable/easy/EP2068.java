package com.learn.hashtable.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/25
 * @description :如果两个字符串 word1 和 word2 中从 'a' 到 'z' 每一
 * 个字母出现频率之差都不超过 3，那么称这两个字符串 word1 和 word2 几乎
 * 相等。两个长度都为 n 的字符串 word1 和 word2，如果 word1 和 word2
 * 几乎相等，请返回 true，否则返回 false。一个字母 x 的出现频率指的是它
 * 在字符串中出现的次数
 */
public class EP2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] result = new int[26];
        for (char c : word1.toCharArray()) {
            result[c - 'a']++;
        }
        for (char s : word2.toCharArray()) {
            result[s - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(result[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
