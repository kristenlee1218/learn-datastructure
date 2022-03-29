package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/29
 * @description :字母的字母值取决于字母在字母表中的位置，从 0 开始计数。即，
 * 'a' -> 0、'b' -> 1、'c' -> 2，以此类推。对某个由小写字母组成的字符串 s
 * 而言，其数值就等于将 s 中每个字母的字母值按顺序连接并转换成对应整数。如果
 * firstWord 和 secondWord 的数值之和等于 targetWord 的数值，返回 true；
 * 否则返回 false
 */
public class EP1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = getNum(firstWord);
        int num2 = getNum(secondWord);
        int target = getNum(targetWord);
        return num1 + num2 == target;
    }

    public int getNum(String s) {
        int result = 0;
        int index = 1;
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += (index * (ch[i] - 'a'));
            index *= 10;
        }
        return result;
    }
}
