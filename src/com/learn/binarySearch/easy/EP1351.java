package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，
 * 都以非递增顺序排列、请统计并返回 grid 中负数的数目
 */
public class EP1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        // 按行来遍历
        for (int[] ints : grid) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = right - (right - left) / 2;
                if (ints[mid] < 0) {
                    if (mid == 0) {
                        count += n;
                        break;
                    }
                    if (ints[mid - 1] >= 0) {
                        count += n - mid;
                        break;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }
}
