package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 两个字符串，请从这两个字符串中找出最长的特殊序列。「最长
 * 特殊序列」定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的
 * 子序列）。子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相
 * 对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。输入为两个
 * 字符串，输出最长特殊序列的长度。如果不存在，则返回 -1
 */
public class EP521 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
