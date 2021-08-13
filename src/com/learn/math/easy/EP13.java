package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :罗马数字包含以下七种字符: I， V， X， L，C，D 和 M
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class EP13 {
    public int romanToInt(String s) {
        int sum = 0;
        int pre = getVal(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int cur = getVal(s.charAt(i));
            if (cur > pre) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = cur;
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
