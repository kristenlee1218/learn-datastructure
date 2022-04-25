package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/12/5
 * @description : 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的
 * 最长的回文串。在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串
 * 注意：假设字符串的长度不会超过 1010
 */
public class EP409 {
    public int longestPalindrome(String s) {
        int[] nums = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            nums[c]++;
        }

        int result = 0;
        for (int num : nums) {
            result += num / 2 * 2;
            if (num % 2 == 1 && result % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
