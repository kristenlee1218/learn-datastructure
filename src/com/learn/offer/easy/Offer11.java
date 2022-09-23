package com.learn.offer.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 把一个数组最开始的若干个元素搬到数组的末尾，称之为
 * 数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素
 */
public class Offer11 {
    public int minArray(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
