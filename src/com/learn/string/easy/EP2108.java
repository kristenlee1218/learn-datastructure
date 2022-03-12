package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :
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
