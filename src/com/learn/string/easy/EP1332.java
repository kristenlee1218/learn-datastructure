package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :
 */
public class EP1332 {
    public int removePalindromeSub(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 2;
            }
        }
        return s.length() - 1 == -1 ? 0 : 1;
    }
}
