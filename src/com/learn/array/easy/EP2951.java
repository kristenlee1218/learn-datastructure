package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/12/18
 * @description : 一个下标从 0 开始的数组 mountain。找出数组 mountain 中的所有峰值。
 * 以数组形式返回给定数组中峰值的下标，顺序不限
 */
public class EP2951 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                list.add(i);
            }
        }
        return list;
    }
}
