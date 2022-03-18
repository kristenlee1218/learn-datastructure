package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :在一个 XY 坐标系中有一些点，用数组 coordinates 来分别记录
 * 它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点、
 * 判断这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false
 */
public class EP1232 {
    public boolean checkStraightLine(int[][] nums) {
        int x1 = nums[1][0] - nums[0][0];
        int y1 = nums[1][1] - nums[0][1];
        for (int i = 2; i < nums.length; i++) {
            int x2 = nums[i][0] - nums[0][0];
            int y2 = nums[i][1] - nums[0][1];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }
}
