package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :给定两个字符串形式的非负整数 num1 和 num2，计算它们的和
 * <p>
 * 提示：
 * num1 和 num2 的长度都小于 5100
 * num1 和 num2 都只包含数字 0-9
 * num1 和 num2 都不包含任何前导零
 * 不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
 */
public class EP415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int count = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || count != 0) {
            if (i >= 0) {
                count += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                count += num2.charAt(j--) - '0';
            }
            sb.append(count % 10);
            count /= 10;
        }
        return sb.reverse().toString();
    }
}
