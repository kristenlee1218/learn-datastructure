package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/20
 * @description : 给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串
 * 由 n 个破折号分成 n + 1 组、也会得到一个整数 k。想要重新格式化字符串 s，使每一组
 * 包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外两组之间
 * 必须插入破折号，并且应该将所有小写字母转换为大写字母。返回重新格式化的许可密钥
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
