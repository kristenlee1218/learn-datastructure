package com.learn.bit.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description :每个非负整数 N 都有其二进制表示。例如，5 可以被表示为
 * 二进制 "101"，11 可以用二进制 "1011" 表示，依此类推。注意，除 N = 0
 * 外，任何二进制表示中都不含前导零。二进制的反码表示是将每个 1 改为 0 且
 * 每个 0 变为 1。例如，二进制数 "101" 的二进制反码为 "010"。一个十进制
 * 数 N，请返回其二进制表示的反码所对应的十进制整数
 */
public class EP1009 {
    public int bitwiseComplement(int n) {
        int num = 1;
        while (num < n) {
            num = (num << 1) + 1;
        }
        return n ^ num;
    }
}
