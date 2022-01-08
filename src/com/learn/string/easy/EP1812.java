package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个坐标 coordinates，它是一个字符串，表示国际象棋棋盘
 * 中一个格子的坐标。如果所给格子的颜色是白色，请返回 true，如果是黑色，请返
 * 回 false。给定坐标一定代表国际象棋棋盘上一个存在的格子。坐标第一个字符是
 * 字母，第二个字符是数字
 */
public class EP1812 {
    public boolean squareIsWhite(String s) {
        return (s.charAt(0) - 'a') % 2
                != (s.charAt(1) - '1') % 2;
    }
}
