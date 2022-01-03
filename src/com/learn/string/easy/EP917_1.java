package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/3
 * @description :给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母
 * 的字符都保留在原地，而所有字母的位置发生反转
 */
public class EP917_1 {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j))) {
                    j--;
                }
                sb.append(s.charAt(j--));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
