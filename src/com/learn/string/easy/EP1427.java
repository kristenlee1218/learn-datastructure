package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给定一个包含小写英文字母的字符串 s 以及一个矩阵 shift，其中
 * shift[i] = [direction, amount]：direction 可以为 0 （表示左移）或 1
 * （表示右移）。amount 表示 s 左右移的位数。左移 1 位表示移除 s 的第一个字符，
 * 并将该字符插入到 s 的结尾。类似地，右移 1 位表示移除 s 的最后一个字符，
 * 并将该字符插入到 s 的开头。对这个字符串进行所有操作后，返回最终结果。
 */
public class EP1427 {
    public String stringShift(String s, int[][] shift) {
        int count = 0;
        for (int[] ints : shift) {
            count = ints[1] % s.length();
            if (ints[0] == 0 && ints[1] > 0) {
                s = s.substring(count) + s.substring(0, count);
            } else {
                s = s.substring(s.length() - count) + s.substring(0, s.length() - count);
            }
        }
        return s;
    }
}
