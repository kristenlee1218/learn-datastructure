package com.learn.string.easy;

import java.util.Stack;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description :给定一个字符串 S，返回 “反转后的” 字符串，其中不是字
 * 母的字符都保留在原地，而所有字母的位置发生反转
 */
public class EP917 {
    public String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(letters.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
