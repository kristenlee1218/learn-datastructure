package com.learn.greedy.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 楼下水果店正在促销，打算买些苹果，arr[i] 表示第 i 个苹果的单位重
 * 量。有一个购物袋，最多可以装 5000 单位重量的东西，最多可以往购物袋里装入多少苹果
 */
public class EP1196 {
    public int maxNumberOfApples(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (sum > 5000) {
                break;
            }
            count++;
        }
        return count;
    }
}
