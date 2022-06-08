package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description : 一个字符串数组 words，找出并返回数组中的第一个回文字符串。
 * 如果不存在满足要求的字符串，返回一个空字符串 ""
 */
public class EP2108 {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (new StringBuilder(s).reverse().toString().equals(s)) {
                return s;
            }
        }
        return "";
    }
}
