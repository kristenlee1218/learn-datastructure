package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description : 一个字符串 s 和一个字符 letter，返回在 s 中等于
 * letter 字符所占的百分比，向下取整到最接近的百分比
 */
public class EP2278 {
    public int percentageLetter(String s, char letter) {
        char[] ch = s.toCharArray();
        int count = 0;
        for (char c : ch) {
            if (c == letter) {
                count++;
            }
        }
        return 100 * count / s.length();
    }
}
