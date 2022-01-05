package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个坐标 coordinates，它是一个字符串，表示国际象棋棋盘
 * 中一个格子的坐标。下图是国际象棋棋盘示意图。如果所给格子的颜色是白色，
 * 请返回 true，如果是黑色，请返回 false。给定坐标一定代表国际象棋棋盘上
 * 一个存在的格子。坐标第一个字符是字母，第二个字符是数字
 */
public class EP1812 {
    public boolean squareIsWhite(String coordinates) {
        if ((coordinates.charAt(0) & 1) == 0 && (coordinates.charAt(1) & 1) == 1) {
            return true;
        }
        return (coordinates.charAt(0) & 1) == 1 && (coordinates.charAt(1) & 1) == 0;
    }
}
