package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :
 */
public class EP2108 {
    public String firstPalindrome(String[] words) {
        outer:
        for (String word : words) {
            int len = word.length();
            char[] arr = word.toCharArray();
            for (int i = 0; i < len / 2; i++) {
                if (arr[i] != arr[len - 1 - i]) {
                    continue outer;
                }
            }
            return word;
        }
        return "";
    }
}
