package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个 Excel 表格中的列名称，返回其相应的列序号
 */
public class EP171 {
    public int titleToNumber(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            int num = s.charAt(i) - 'A' + 1;
            result = result * 26 + num;
            i++;
        }
        return result;
    }
}
