package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/21
 * @description :给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个
 * 字符，就反转这 2k 字符中的前 k 个字符。如果剩余字符少于 k 个，则将剩余字符全部反
 * 转。如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样
 */
public class EP541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            reverse(arr, i, Math.min(i + k, s.length()) - 1);
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
