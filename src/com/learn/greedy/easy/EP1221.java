package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 在一个平衡字符串中，'L' 和 'R' 字符的数量是相同的。一个平衡
 * 字符串 s，请将它分割成尽可能多的平衡字符串。注意：分割得到的每个字符串都必须是
 * 平衡字符串，且分割得到的平衡字符串是原平衡字符串的连续子串。返回可以通过分割得
 * 到的平衡字符串的最大数量
 */
public class EP1221 {
    public int balancedStringSplit(String s) {
        int result = 0, length = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                length++;
            } else {
                length--;
            }
            if (length == 0) {
                result++;
            }
        }
        return result;
    }
}
