package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定两个由小写字母构成的字符串 A 和 B，只要可以通过
 * 交换 A 中的两个字母得到与 B 相等的结果，就返回 true；否则返回 false、
 * 交换字母的定义是取两个下标 i 和 j（下标从 0 开始），只要 i!=j 就交
 * 换 A[i] 和 A[j] 处的字符
 */
public class EP859 {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] nums1 = new int[26];
        int[] nums2 = new int[26];
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            nums1[a.charAt(i) - 'a']++;
            nums2[b.charAt(i) - 'a']++;
            if (a.charAt(i) != b.charAt(i)) {
                sum++;
            }
        }
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (nums1[i] != nums2[i]) {
                return false;
            }
            if (nums1[i] > 1) {
                flag = true;
            }
        }
        return sum == 2 || (sum == 0 && flag);
    }
}
