package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 有一个十进制数字，请按照此规则将它变成「十六进制魔术数字」：首先
 * 将它变成字母大写的十六进制字符串，然后将所有的数字 0 变成字母 O，将数字 1 变成字
 * 母 I。如果一个数字在转换后只包含{"A", "B", "C", "D", "E", "F", "I", "O"}，
 * 那么就认为这个转换是有效的。一个字符串 num，它表示一个十进制数 N，如果它的十六进
 * 制魔术数字转换是有效的，请返回转换后的结果，否则返回 "ERROR"
 */
public class EP1271 {
    public String toHexSpeak(String s) {
        double temp = Double.parseDouble(s);
        StringBuilder sb = new StringBuilder();
        while (temp > 0) {
            int c = (int) (temp % 16);
            if (c == 0 || c == 1 || c >= 10) {
                if (c == 0) {
                    sb.append("O");
                }
                if (c == 1) {
                    sb.append("I");
                }
                if (c >= 10) {
                    sb.append((char) ('A' + (c - 10)));
                }
            } else {
                return "ERROR";
            }
            temp = Math.floor(temp / 16);
        }
        return sb.reverse().toString();
    }
}
