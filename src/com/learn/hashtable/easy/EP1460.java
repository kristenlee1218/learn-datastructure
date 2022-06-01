package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 两个长度相同的整数数组 target 和 arr、每一步中可以选择 arr 的任意
 * 非空子数组并将它翻转。可以执行此过程任意次。如果能让 arr 变得与 target 相同，返回
 * true；否则返回 false
 */
public class EP1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
