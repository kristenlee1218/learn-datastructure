package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 基数排序
 * 基数排序（radix sort）属于“分配式排序”（distribution sort）
 *
 * 又称 “桶子法”（bucket sort）或 bin sort，顾名思义，它是透过键值的部份资
 * 讯，将要排序的元素分配至某些 “桶” 中，藉以达到排序的作用，基数排序法是属于
 * 稳定性的排序，其时间复杂度为 O(nlog(r)m)，其中 r 为所采取的基数，而 m
 * 为堆数，在某些时候，基数排序法的效率高于其它的稳定性排序法
 */
public class RadixSort {
    public void radixSort(int[] array, int d) {
        int n = 1;
        int k = 0;
        int length = array.length;
        int[][] bucket = new int[10][length];
        int[] order = new int[length];
        while (n < d) {
            for (int num : array) {
                int digit = (num / n) % 10;
                bucket[digit][order[digit]] = num;
                order[digit]++;
            }
            for (int i = 0; i < length; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        array[k] = bucket[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
        }
    }
}
