package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 希尔排序
 * 希尔排序（Shell Sort），是计算机科学与技术领域中较为简单的一种排序算法
 * <p>
 * 希尔排序是插入排序的一种，有时候也被称为 “缩小增量排序”。它是插入排序的改
 * 进版，与插入排序的不同之处在于，希尔排序会优先比较距离较远的元素。希尔排序
 * 是按照其设计者希尔（Donald Shell）的名字命名而来，并于 1959 年公布出来
 */
public class SheelSort {
    public void sheelSort(int[] arr) {
        int d = arr.length;
        while (d != 0) {
            d /= 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < arr.length; i += d) {
                    int j = i - d;
                    int temp = arr[i];
                    for (; j >= 0 && temp < arr[j]; j -= d) {
                        arr[j + d] = arr[j];
                    }
                    arr[j + d] = temp;
                }
            }
        }
    }
}
