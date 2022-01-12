package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :给定两个字符串 s 和 t，判断 t 是否是 s 的字母异位词
 */
public class EP242_1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
            result[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (result[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
