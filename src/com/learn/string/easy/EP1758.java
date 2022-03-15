package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :一个仅由字符 '0' 和 '1' 组成的字符串 s。一步操作中，可以将
 * 任一 '0' 变成 '1'，或者将 '1' 变成 '0'、交替字符串定义为：如果字符串中不存
 * 在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是
 * 交替字符串，而字符串 "0100" 不是、返回使 s 变成交替字符串所需的最少操作数
 */
public class EP1758 {
    public int minOperations(String s) {
        int zero = 0, one = 0;
        char flag = '1';
        for (char c : s.toCharArray()) {
            if (c == flag) {
                zero++;
            } else {
                one++;
            }
            flag = flag == '0' ? '1' : '0';
        }
        return Math.min(zero, one);
    }
}
