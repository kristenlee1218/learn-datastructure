package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :一个下标从 0 开始的字符串 s，它的偶数下标处为小写英文字母，奇
 * 数下标处为数字。定义一个函数 shift(c, x)，其中 c 是一个字符且 x 是一个数字，
 * 函数返回字母表中 c 后面第 x 个字符。比方说，shift('a', 5) = 'f' 和 shift
 * ('x', 0) = 'x'。对于每个奇数下标 i，需要将数字 s[i]用 shift(s[i-1], s[i])
 * 替换。请替换所有数字以后，将字符 串 s 返回。题目保证 shift(s[i-1], s[i])
 * 不会超过 'z'
 */
public class EP1844 {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();
        for (int i = 1; i < ch.length; i += 2) {
            ch[i] = (char) (ch[i] - '0' + ch[i - 1]);
        }
        return new String(ch);
    }
}
