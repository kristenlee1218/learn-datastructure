package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/20
 * @description :
 */
public class EP482 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                count++;
                sb.append(Character.toUpperCase(s.charAt(i)));
                if (count % k == 0) {
                    sb.append("-");
                }
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }
}
