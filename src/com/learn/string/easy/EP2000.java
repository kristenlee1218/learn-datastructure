package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/28
 * @description : 一个下标从 0 开始的字符串 word 和一个字符 ch。找出 ch 第一
 * 次出现的下标 i，反转 word 中从下标 0 开始、直到下标 i 结束（含下标 i）的那段
 * 字符。如果 word 中不存在字符 ch，则无需进行任何操作
 */
public class EP2000 {
    public String reversePrefix(String word, char c) {
        int index = word.indexOf(c);
        if (index >= 0) {
            char[] ch = word.toCharArray();
            int left = 0, right = index;
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            word = new String(ch);
        }
        return word;
    }
}
