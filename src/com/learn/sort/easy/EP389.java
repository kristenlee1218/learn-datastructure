package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给定两个字符串 s 和 t，它们只包含小写字母。字符串 t 由字
 * 符串 s 随机重排，然后在随机位置添加一个字母。请找出在 t 中被添加的字母
 */
public class EP389 {
    public char findTheDifference(String s, String t) {
        return (char) (t.chars().sum() - s.chars().sum());
    }
}
