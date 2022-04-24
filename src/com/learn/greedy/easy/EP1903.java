package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description : 给一个字符串 num 表示一个大整数。请在字符串 s 的所有
 * 非空子字符串中找出值最大的奇数，并以字符串形式返回。如果不存在奇数，则
 * 返回一个空字符串 ""
 */
public class EP1903 {
    public String largestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
