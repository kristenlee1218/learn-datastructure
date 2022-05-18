package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public static void main(String[] args) {
        String a = new String("abc").intern();
        String b = new String("abc").intern();
        if (a == b) {
            System.out.print("a==b");
        }
    }
}

