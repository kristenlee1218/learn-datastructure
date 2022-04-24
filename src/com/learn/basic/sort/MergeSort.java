package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 归并排序
 * 归并排序（Merge Sort）是利用归并的思想实现的排序方法，该算法采用经典的分治
 * （divide-and-conquer）策略
 *
 * 分治法将问题分（divide）成一些小的问题后递归求解，而治（conquer）的阶段则
 * 将分的阶段得到的各答案修补在一起，然即分而治之
 */
public class MergeSort {
    public void mergeSort(int[] numbers, int left, int right) {
        int t = 1;
        int size = right - left + 1;
        while (t < size) {
            int s = t;
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                merge(numbers, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right) {
                merge(numbers, i, i + (s - 1), right);
            }
        }
    }

    private void merge(int[] data, int p, int q, int r) {
        int[] B = new int[data.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (data[s] <= data[t]) {
                B[k] = data[s];
                s++;
            } else {
                B[k] = data[t];
                t++;
            }
            k++;
        }
        if (s == q + 1) {
            B[k++] = data[t++];
        } else {
            B[k++] = data[s++];
        }
        for (int i = p; i <= r; i++) {
            data[i] = B[i];
        }
    }
}
