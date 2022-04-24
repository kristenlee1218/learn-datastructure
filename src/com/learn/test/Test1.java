package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public String toggleCase(char[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] ^= 32;
        }
        return new String(a);
    }
}