package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description : 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * 这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内
 */
public class EP13 {
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
