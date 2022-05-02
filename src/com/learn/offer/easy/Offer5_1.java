package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/5/2
 * @description : 请实现一个函数，把字符串 s 中的每个空格替换成 "%20"
 */
public class Offer5_1 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
