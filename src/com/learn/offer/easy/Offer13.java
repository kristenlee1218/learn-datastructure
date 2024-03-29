package com.learn.offer.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 地上有一个m行n列的方格，从坐标 [0, 0] 到坐标 [m-1, n-1]。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格
 * （不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于 k 的格子。例如，
 * 当 k 为 18 时，机器人能够进入方格 [35, 37]，因为 3+5+3+7=18。但它不能
 * 进入方格 [35, 38]，因为 3+5+3+8=19。请问该机器人能够到达多少个格子
 */
public class Offer13 {
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        // 向右和向下的方向数组
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] vis = new boolean[m][n];
        queue.offer(new int[]{0, 0});
        vis[0][0] = true;
        int count = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 2; ++i) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k) {
                    continue;
                }
                queue.offer(new int[]{tx, ty});
                vis[tx][ty] = true;
                count++;
            }
        }
        return count;
    }

    private int get(int x) {
        int result = 0;
        while (x != 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}
