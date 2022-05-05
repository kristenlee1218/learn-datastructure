package com.learn.greedy.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/12/5
 * @description : 给定一个包含大写字母和小写字母的字符串，找到通
 * 过这些字母构造成的最长的回文串。在构造过程中，请注意区分大小写。
 * 注意：假设字符串的长度不会超过 1010
 */
public class EP409 {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.remove(c)) {
                set.add(c);
            }
        }
        return set.size() == 0 ? s.length() : s.length() - set.size() + 1;
    }
}
