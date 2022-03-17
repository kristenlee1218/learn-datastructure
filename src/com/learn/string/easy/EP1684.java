package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :一个由不同字符组成的字符串 allowed 和一个字符串数组 words。
 * 如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是一致字符串、请返
 * 回 words 数组中一致字符串的数目
 */
public class EP1684 {
    public int countConsistentStrings(String str, String[] words) {
        int result = 0;
        for (String s1 : words) {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                String s2 = String.valueOf(s1.charAt(i));
                if (str.contains(s2)) {
                    count++;
                }
            }
            if (count == s1.length()) {
                result++;
            }
        }
        return result;
    }
}
