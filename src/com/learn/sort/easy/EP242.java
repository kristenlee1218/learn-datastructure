package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给定两个字符串 s 和 t，判断 t 是否是 s 的字母异位词
 */
public class EP242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.parallelSort(char1);
        Arrays.parallelSort(char2);
        for (int i = 0; i < s.length(); i++) {
            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }
}
