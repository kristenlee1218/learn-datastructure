package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/7
 * @description : 独一无二的字符串指的是在一个数组中只出现过一次的字符串。一个字符串数
 * 组 arr 和一个整数 k，请返回 arr 中第 k 个独一无二的字符串。如果少于 k 个独一无二的
 * 字符串，那么返回空字符串 ""、按照字符串在原数组中的顺序找到第 k 个独一无二字符串
 */
public class EP2053 {
    public String kthDistinct(String[] str, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : str) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
}
