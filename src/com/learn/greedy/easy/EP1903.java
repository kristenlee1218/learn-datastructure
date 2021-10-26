package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description :给一个字符串 num 表示一个大整数。
 * 请在字符串 num 的所有非空子字符串中找出值最大的奇数，并以字符串形式返回。
 * 如果不存在奇数，则返回一个空字符串 ""
 */
public class EP1903 {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
