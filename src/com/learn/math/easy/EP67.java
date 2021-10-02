package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0
 */
public class EP67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = count;
            sum += (i >= 0) ? (a.charAt(i) - '0') : 0;
            sum += (j >= 0) ? (b.charAt(j) - '0') : 0;
            sb.append(sum % 2);
            count = sum / 2;
        }
        sb.append(count == 1 ? count : "");
        return sb.reverse().toString();
    }
}
