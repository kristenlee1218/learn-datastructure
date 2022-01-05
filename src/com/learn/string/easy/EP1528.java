package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个字符串 s 和一个长度相同的整数数组 indices。请重新
 * 排列字符串 s，其中第 i 个字符需要移动到 indices[i] 指示的位置。返回重新
 * 排列后的字符串
 */
public class EP1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int index = indices.length - 1; index > -1; index--) {
            result[indices[index]] = s.charAt(index);
        }
        return String.valueOf(result);
    }
}
