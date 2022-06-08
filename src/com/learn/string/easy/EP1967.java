package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/28
 * @description : 一个字符串数组 patterns 和一个字符串 word，统计 patterns
 * 中有多少个字符串是 word 的子字符串。返回字符串数目。子字符串是字符串中的一个
 * 连续字符序列
 */
public class EP1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
