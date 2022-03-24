package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/3/24
 * @description :一个字符串数组 words 和一个字符串 pref。
 * 返回 words 中以 pref 作为 前缀 的字符串的数目。字符串
 * s 的前缀就是 s 的任一前导连续字符串。
 */
public class EP2185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
