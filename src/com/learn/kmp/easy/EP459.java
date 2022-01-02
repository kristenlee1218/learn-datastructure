package com.learn.kmp.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :
 */
public class EP459 {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
