package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description :
 */
public class EP2278 {
    public int percentageLetter(String s, char letter) {
        char[] ch = s.toCharArray();
        int count = 0;
        for (char c : ch) {
            if (c == letter) {
                count++;
            }
        }
        return 100 * count / s.length();
    }
}
