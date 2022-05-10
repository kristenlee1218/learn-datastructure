package com.learn.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int romanToInt(String s) {
        int sum = 0, i = 1;
        int pre = getVal(s.charAt(0));
        while (i < s.length()) {
            int cur = getVal(s.charAt(i));
            if (cur > pre) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = cur;
            i++;
        }
        sum += pre;
        return sum;
    }

    static int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}