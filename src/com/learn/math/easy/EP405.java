package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description : 给定一个整数，编写一个算法将这个数转换为十六进制数。
 * 对于负整数，通常使用补码运算方法
 * 注意:
 * 十六进制中所有字母 (a-f) 都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，
 * 那么以单个字符 '0' 来表示；对于其他情况，
 * 十六进制字符串中的第一个字符将不会是 0 字符
 * 给定的数确保在 32 位有符号整数范围内
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法
 */
public class EP405 {
    public String toHex(int n) {
        return Integer.toHexString(n);
    }
}
