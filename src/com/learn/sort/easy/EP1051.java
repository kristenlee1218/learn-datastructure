package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 学校在拍年度纪念照时，一般要求学生按照非递减的高
 * 度顺序排列。请返回能让所有学生以非递减高度排列的最小必要移动人数
 */
public class EP1051 {
    public int heightChecker(int[] heights) {
        int[] result = heights.clone();
        int count = 0;
        Arrays.sort(result);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != result[i]) {
                count++;
            }
        }
        return count;
    }
}
