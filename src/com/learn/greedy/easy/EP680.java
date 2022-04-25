package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串
 */
public class EP680 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            if (ch[left] != ch[right]) {
                return validPalindrome(ch, left + 1, right)
                        || validPalindrome(ch, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(char[] ch, int left, int right) {
        while (left < right) {
            if (ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
