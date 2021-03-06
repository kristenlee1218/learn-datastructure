package com.learn.matrix.easy;

import java.util.TreeMap;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description : 一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别
 * 用 1 和 0 表示。请返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。如果
 * 第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么第 i 行的
 * 战斗力比第 j 行弱。军人总是排在一行中的靠前位置，也就是说 1 总是出现在 0 之前
 */
public class EP1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = i;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                // 增强军人战斗力的影响，防止加上行号导致错误结果
                sum += mat[i][j] * 100;
            }
            map.put(sum, i);
        }
        int[] result = new int[k];
        int index = 0;
        for (Integer key : map.keySet()) {
            if (index == k) {
                break;
            }
            result[index++] = map.get(key);
        }
        return result;
    }
}
