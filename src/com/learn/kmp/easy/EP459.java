package com.learn.kmp.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :给定一个非空的字符串，判断它是否可以由它的一个子串重复多次
 * 构成。给定的字符串只含有小写英文字母，并且长度不超过 10000
 */
public class EP459 {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
