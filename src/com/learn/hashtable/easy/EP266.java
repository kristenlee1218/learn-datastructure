package com.learn.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 给定一个字符串，判断该字符串中是否可以
 * 通过重新排列组合，形成一个回文字符串
 */
public class EP266 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return set.size() <= 1;
    }
}
