package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description : 一个字符串 s，如果 s 是一个好字符串，请返回 true，否则请返
 * 回 false。如果 s 中出现过的所有字符的出现次数相同，那么称字符串 s 是好字符串
 */
public class EP1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] result = new int[26];
        for (char ch : s.toCharArray()) {
            result[ch - 'a']++;
        }
        int j = result[s.charAt(0) - 'a'];
        for (int i : result) {
            if (i != 0 && i != j) {
                return false;
            }
        }
        return true;
    }
}
