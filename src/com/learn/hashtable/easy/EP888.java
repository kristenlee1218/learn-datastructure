package com.learn.hashtable.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description : 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i
 * 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。因为他们是朋友，所以
 * 他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。一个人拥有的糖果总
 * 量是他们拥有的糖果棒大小的总和）返回一个整数数组 ans，其中 ans[0] 是爱丽
 * 丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小
 */
public class EP888 {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int a = Arrays.stream(alice).sum();
        int b = Arrays.stream(bob).sum();
        int middle = (a - b) / 2;
        Set<Integer> set = new HashSet<>();
        for (int x : alice) {
            set.add(x);
        }
        int[] result = new int[2];
        for (int y : bob) {
            int x = y + middle;
            if (set.contains(x)) {
                result[0] = x;
                result[1] = y;
                break;
            }
        }
        return result;
    }
}
