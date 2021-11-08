package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/11/8
 * @description :将输入的字符串反转过来。输入字符串以字符数组 s 的形式
 * 给出。不要给另外的数组分配额外的空间，必须原地修改输入数组、使用 O(1)
 * 的额外空间解决这一问题
 */
public class EP344 {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
