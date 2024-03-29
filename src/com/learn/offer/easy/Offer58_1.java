package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个英文句子，翻转句子中单词的顺序，但单词内
 * 字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字
 * 符串"I am a student. "，则输出"student. a am I"
 */
public class Offer58_1 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder(str.length);
        for (int i = str.length - 1; i >= 0; i--) {
            if (!"".equals(str[i])) {
                sb.append(str[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
