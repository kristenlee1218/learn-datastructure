package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description : 集合 s 包含从 1 到 n 的整数。因为数据错误，导致集合
 * 里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合丢失了一个
 * 数字并且有一个数字重复。给定一个数组 nums 代表了集合 S 发生错误后的
 * 结果。请找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回
 */

public class EP645 {
    public int[] findErrorNums(int[] nums) {
        boolean[] boo = new boolean[nums.length + 1];
        int duplicate = 0, absent = 0;
        for (int i : nums) {
            if (boo[i]) {
                duplicate = i;
            } else {
                boo[i] = true;
            }
        }
        for (int k = 1; k <= nums.length; k++) {
            if (!boo[k]) {
                absent = k;
                break;
            }
        }
        return new int[]{duplicate, absent};
    }
}
