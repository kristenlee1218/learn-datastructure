package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            if (ch[left] != ch[right]) {
                return validPalindrome(ch, left + 1, right) || validPalindrome(ch, left, right - 1);
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