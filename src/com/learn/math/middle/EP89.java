package com.learn.math.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/6/10
 * @description : n 位格雷码序列 是一个由 2n 个整数组成的序列，其中每个整数
 * 都在范围 [0, 2n - 1] 内（含 0 和 2n - 1）、第一个整数是 0、一个整数在序
 * 列中出现不超过一次、每对相邻整数的二进制表示恰好一位不同，且第一个和最后一个
 * 整数的二进制表示恰好一位不同、一个整数 n，返回任一有效的 n 位格雷码序列
 */
public class EP89 {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            list.add(i ^ i >> 1);
        }
        return list;
    }
}
