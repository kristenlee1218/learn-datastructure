package com.learn.doublePointers.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/5/13
 * @description : 一个字符串 s 和一个字符 c，且 c 是 s 中出现过的
 * 字符。返回一个整数数组 answer，其中 answer.length == s.length
 * 且 answer[i] 是 s 中从下标 i 到离它最近的字符 c 的距离
 */
public class EP821 {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        Arrays.fill(result, s.length());
        int last = -s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                for (int j = i; j >= Math.max(0, (i + last - 1) / 2); j--) {
                    result[j] = Math.min(result[j], i - j);
                }
                last = i;
            } else {
                result[i] = Math.min(result[i], i - last);
            }
        }
        return result;
    }
}
