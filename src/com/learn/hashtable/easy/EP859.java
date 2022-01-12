package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给定两个由小写字母构成的字符串 A 和 B，只要可以通过
 * 交换 A 中的两个字母得到与 B 相等的结果，就返回 true；否则返回 false、
 * 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交
 * 换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的
 * 元素可以生成 "cbad"
 */
public class EP859 {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            int[] count = new int[26];
            for (int i = 0; i < a.length(); ++i) {
                count[a.charAt(i) - 'a']++;
            }
            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < a.length(); ++i) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return (second != -1 && a.charAt(first) == b.charAt(second) && a.charAt(second) == b.charAt(first));
        }
    }
}
