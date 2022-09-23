package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 字符串的左旋转操作是把字符串前面的若干个
 * 字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作
 * 的功能。比如，输入字符串 “abcdefg" 和数字 2，该函数将返
 * 回左旋转两位得到的结果 "cdefgab"
 */
public class Offer58_2 {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0, n);
        String s2 = s.substring(n);
        return s2 + s1;
    }
}
