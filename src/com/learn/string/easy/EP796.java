package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description : 给定两个字符串, A 和 B。A 的旋转操作就是将 A 最左边的
 * 字符移动到最右边。如果在若干次旋转操作之后，A 能变成 B，那么返回 True
 */
public class EP796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s + s;
        return str.contains(goal);
    }
}
