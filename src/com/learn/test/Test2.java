package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public String largestOddNumber(String s) {
        for (int i = s.length(); i > 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}

