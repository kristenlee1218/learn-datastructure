package com.learn.interview.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/31
 * @description : 给定两个字符串 s1 和 s2，请编写一个程序，确定其
 * 中一个字符串的字符重新排列后，能否变成另一个字符串
 */
public class EP0102 {
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a'] += 1;
            count2[s2.charAt(i) - 'a'] += 1;
        }
        return Arrays.toString(count1).equals(Arrays.toString(count2));
    }
}
