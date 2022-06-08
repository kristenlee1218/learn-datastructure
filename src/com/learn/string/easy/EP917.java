package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/3
 * @description : 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母
 * 的字符都保留在原地，而所有字母的位置发生反转
 */
public class EP917 {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j = ch.length - 1; i < j; ) {
            while (i < j && !Character.isLetter(ch[i])) {
                i++;
            }
            while (i < j && !Character.isLetter(ch[j])) {
                j--;
            }
            if (i < j) {
                char c = ch[i];
                ch[i++] = ch[j];
                ch[j--] = c;
            }
        }
        return String.valueOf(ch);
    }
}
