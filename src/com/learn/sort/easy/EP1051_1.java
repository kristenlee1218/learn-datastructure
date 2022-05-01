package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 学校在拍年度纪念照时，一般要求学生按照非递减的高
 * 度顺序排列。请返回能让所有学生以非递减高度排列的最小必要移动人数
 */
public class EP1051_1 {
    public int heightChecker(int[] heights) {
        int[] result = new int[101];
        for (int height : heights) {
            result[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < result.length; i++) {
            while (result[i]-- > 0) {
                if (heights[j++] != i) {
                    count++;
                }
            }
        }
        return count;
    }
}
