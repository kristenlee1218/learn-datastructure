package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个二维整数数组 logs，其中每个 logs[i] = [birthi, deathi]
 * 表示第 i 个人的出生和死亡年份。年份 x 的 人口定义为这一年期间活着的人的数目。
 * 第 i 个人被计入年份 x 的人口需要满足：x 在闭区间 [birthi, deathi - 1] 内。
 * 注意，人不应当计入他们死亡当年的人口中。返回人口最多且最早的年份。
 */
public class EP1854 {
    public int maximumPopulation(int[][] logs) {
        int result = 0;
        int count = 0;
        for (int i = 1950; i <= 2050; i++) {
            int sum = 0;
            for (int[] log : logs) {
                if (i >= log[0] && i < log[1]) {
                    sum++;
                }
            }
            if (sum > count) {
                result = i;
                count = sum;
            }
        }
        return result;
    }
}
