package com.learn.interview.easy;

/**
 * @author : Kristen
 * @date : 2022/2/1
 * @description :字符串轮转。给定两个字符串 s1 和 s2，请编写
 * 代码检查 s2 是否为 s1 旋转而成（比如，waterbottle 是
 * erbottlewat 旋转后的字符串）
 */
public class EP0109 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = s2 + s2;
        return s.contains(s1);
    }
}
