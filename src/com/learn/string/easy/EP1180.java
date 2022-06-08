package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个字符串 S，返回只含单一字母的子串个数
 */
public class EP1180 {
    public int countLetters(String s) {
        int result = 0;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += count * (count + 1) / 2;
                count = 1;
            }
        }
        result += count * (count + 1) / 2;
        return result;
    }
}
