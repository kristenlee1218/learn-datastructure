package com.learn.hashtable.easy;

/**
 * @author ：Kristen
 * @date ：2022/8/19
 * @description : 一个下标从 0 开始长度为 n 的字符串 s，它只包含数字。如果对于每
 * 个 0 <= i < n 的下标，都满足数位 i 在 s 中出现了 num[i] 次，那么请返回 true，
 * 否则返回 false
 */
public class EP2283 {
    public boolean digitCount(String s) {
        int[] nums = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            nums[ch - '0']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (nums[i] != (ch - '0')) {
                return false;
            }
        }
        return true;
    }
}
