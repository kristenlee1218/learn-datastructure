package com.learn.doublePointers.easy;

/**
 * @author : Kristen
 * @date : 2021/7/15
 * @description : 一个数组 nums 和一个值 val，需要原地移除所有
 * 数值等于 val 的元素，并返回移除后数组的新长度、不要使用额外的数
 * 组空间，必须仅使用 O(1) 额外空间并原地修改输入数组、元素的顺序
 * 可以改变。不需要考虑数组中超出新长度后面的元素移除某值的元素，可
 * 能会有多个，如何解决多个是本题的关键
 */
public class EP27 {
    public int removeElement(int[] nums, int value) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
