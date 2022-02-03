package com.learn.interview.easy;

import java.util.HashSet;

/**
 * @author : Kristen
 * @date : 2022/1/31
 * @description : 实现一个算法，确定一个字符串 s 的所有字符是否全都不同
 */
public class EP0101 {
    public boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size() == str.length();
    }
}
