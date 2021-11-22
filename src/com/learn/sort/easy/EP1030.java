package com.learn.sort.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，
 * 满足 0 <= r < R 且 0 <= c < C。另外，我们在该矩阵中给出了一个坐标为
 * (r0, c0) 的单元格。返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距
 * 离从最小到最大的顺序排，其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离
 * 是曼哈顿距离，|r1 - r2| + |c1 - c2|
 */

public class EP1030 {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ret = new int[rows * cols][];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ret[i * cols + j] = new int[]{i, j};
            }
        }
        Arrays.sort(ret, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) - (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter));
            }
        });
        return ret;
    }
}
