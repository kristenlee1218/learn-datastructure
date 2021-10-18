package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
    public String toHex(int n) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        while (n != 0) {
            int i = n & 15;
            sb.insert(0, ch[i]);
            n >>>= 4;
        }
        return sb.toString();
    }
}
