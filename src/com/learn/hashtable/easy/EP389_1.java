package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description : 给定两个字符串 s 和 t，它们只包含小写字母。字符串 t 由字
 * 符串 s 随机重排，然后在随机位置添加一个字母。请找出在 t 中被添加的字母
 */
public class EP389_1 {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            result ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            result ^= t.charAt(i);
        }
        return (char) result;
    }
}
