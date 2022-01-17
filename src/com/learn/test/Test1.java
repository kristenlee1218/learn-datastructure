package com.learn.test;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public String generateTheString(int n) {
        char[] c = new char[n];
        Arrays.fill(c, 'a');
        if (n % 2 == 0) {
            c[n - 1] = 'n';
        }
        return new String(c);
    }
}