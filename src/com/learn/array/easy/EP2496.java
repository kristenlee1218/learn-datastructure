package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2023/4/21
 * @description : 一个由字母和数字组成的字符串的值定义如下：
 * 如果字符串只包含数字，那么值为该字符串在 10 进制下的所表示的数字。否则，值为字符串的长度。
 * 一个字符串数组 str，每个字符串都只由字母和数字组成，请返回 str 中字符串的最大值。
 */
public class EP2496 {
    public int maximumValue(String[] str) {
        int count = 0;
        for (String s : str) {
            boolean isDigit = true;
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    isDigit = false;
                    count = Math.max(count, s.length());
                }
            }
            if (isDigit) {
                count = Math.max(count, Integer.parseInt(s));
            }
        }
        return count;
    }
}
