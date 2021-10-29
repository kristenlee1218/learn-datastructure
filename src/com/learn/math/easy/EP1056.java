package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :给定一个数字 N，当它满足以下条件的时候返回 true：
 * 原数字旋转 180° 以后可以得到新的数字。
 * 如 0, 1, 6, 8, 9 旋转 180° 以后，得到了新的数字 0, 1, 9, 8, 6 。
 * 2, 3, 4, 5, 7 旋转 180° 后，得到的不是数字
 */
public class EP1056 {
    public boolean confusingNumber(int n) {
        String x = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            if (c == '2' || c == '3' || c == '4' || c == '5' || c == '7') {
                return false;
            }
            if (c == '6') {
                c = '9';
            } else if (c == '9') {
                c = '6';
            }
            sb.append(c);
        }
        return !sb.toString().equals(x);
    }
}
