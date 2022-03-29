package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/29
 * @description :如果一个字符串不含有任何重复字符，称这个字符串为好字符串。一
 * 个字符串 s，请返回 s 中长度为 3 的好子字符串的数量。注意，如果相同的好子字符
 * 串出现多次，每一次都应该被记入答案之中。子字符串是一个字符串中连续的字符序列
 */
public class EP1876 {
    public int countGoodSubstrings(String s) {
        int result = 0;
        char[] ch = s.toCharArray();
        for (int i = 2; i < ch.length; i++) {
            if (ch[i] != ch[i - 1] && ch[i] != ch[i - 2] && ch[i - 1] != ch[i - 2]) {
                result++;
            }
        }
        return result;
    }
}
