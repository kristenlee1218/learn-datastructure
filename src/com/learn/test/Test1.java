package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public int removePalindromeSub(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return 2;
            }
        }
        return s.length() - 1 == -1 ? 0 : 1;
    }
}