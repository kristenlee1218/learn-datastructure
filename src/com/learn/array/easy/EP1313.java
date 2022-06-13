package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个以行程长度编码压缩的整数列表 nums、考虑每对相邻的
 * 两个元素 [freq, val] = [nums[2*i], nums[2*i+1]]（其中i >= 0），
 * 每一对都表示解压后子列表中有 freq 个值为 val 的元素，需要从左到右连接
 * 所有子列表以生成解压后的列表、请返回解压后的列表
 */
public class EP1313 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] result = new int[len];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            while (nums[i] > 0) {
                result[index] = nums[i + 1];
                nums[i]--;
                index++;
            }
        }
        return result;
    }
}
