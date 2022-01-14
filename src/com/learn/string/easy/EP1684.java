package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :一个由不同字符组成的字符串 allowed 和一个字符串
 * 数组 words。如果一个字符串的每一个字符都在 allowed 中，就称这个
 * 字符串是一致字符串、请返回 words 数组中一致字符串的数目
 */
public class EP1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String str : words) {
            int bingo = 0;
            for (int i = 0; i < str.length(); i++) {
                String str2 = str.charAt(i) + "";
                if (allowed.contains(str2)) {
                    bingo++;
                }
            }
            if (bingo == str.length()) {
                count++;
            }
        }
        return count;
    }
}
