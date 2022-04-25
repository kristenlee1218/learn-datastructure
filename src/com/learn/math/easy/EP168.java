package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数，返回它在 Excel 表中相对应的列名称
 */
public class EP168 {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
