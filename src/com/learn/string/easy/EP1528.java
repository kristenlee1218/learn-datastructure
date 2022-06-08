package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个字符串 s 和一个长度相同的整数数组 indices。请重新
 * 排列字符串 s，其中第 i 个字符需要移动到 indices[i] 指示的位置。返回重新
 * 排列后的字符串
 */
public class EP1528 {
    public String restoreString(String s, int[] index) {
        char[] ch = new char[index.length];
        for (int i = index.length - 1; i > -1; i--) {
            ch[index[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
}
