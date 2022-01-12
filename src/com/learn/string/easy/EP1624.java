package com.learn.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/1/12
 * @description :一个字符串 s，请返回两个相同字符之间的最长子字符串
 * 的长度，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1、
 * 子字符串是字符串中的一个连续字符序列
 */
public class EP1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                max = Math.max(max, i - map.get(s.charAt(i)) - 1);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return max;
    }
}
