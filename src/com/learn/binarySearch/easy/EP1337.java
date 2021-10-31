package com.learn.binarySearch.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，
 * 分别用 1 和 0 表示。请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，
 * 那么我们认为第 i 行的战斗力比第 j 行弱。军人总是排在一行中的靠前位置，
 * 也就是说 1 总是出现在 0 之前
 */
public class EP1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> integerIntegerMap =
                new HashMap<>(mat.length / 3 * 4 + 1);
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            integerIntegerMap.put(i, sum);
        }
        return integerIntegerMap.entrySet().stream().
                sorted(Comparator.<Map.Entry<Integer, Integer>>comparingInt(Map.Entry::getValue)
                        .thenComparing(Map.Entry::getKey)).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
