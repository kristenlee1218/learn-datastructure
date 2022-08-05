package com.learn.basic.sort;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 堆排序
 * 堆排序（Heap Sort）是指利用堆这种数据结构所设计的一种排序算法。
 * 堆是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的
 * 键值或索引总是小于（或者大于）它的父节点
 */
public class HeapSort {
    public void heapSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            buildMaxHeap(a, length - 1 - i);
            swap(a, 0, length - 1 - i);
            System.out.println(Arrays.toString(a));
        }
    }

    public void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void buildMaxHeap(int[] data, int lastIndex) {
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            int k = i;
            while (k * 2 + 1 <= lastIndex) {
                int biggerIndex = 2 * k + 1;
                if (biggerIndex < lastIndex) {
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                if (data[k] < data[biggerIndex]) {
                    swap(data, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
}
