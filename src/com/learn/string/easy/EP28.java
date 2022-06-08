package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/11/10
 * @description : 实现 strStr()、给定一个 haystack 字符串和一个
 * needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第
 * 一个位置（从 0 开始）。如果不存在，则返回 -1
 */
public class EP28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
