package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/15
 * @description :给定一个排序数组，需要在原地删除重复出现的元素，使得每个元素只
 * 出现一次，返回移除后数组的新长度、不要使用额外的数组空间，必须在原地修改输入
 * 数组并在使用 O(1)额外空间的条件下完成移除所有重复的元素、使用双指针的方式
 */
public class EP26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}