package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 快速排序
 * 快速排序（Quick Sort），是计算机科学与技术领域中非常经典的一种
 * 排序算法，应用分治思想进行排序。
 *
 * 快速排序由于其时间复杂度优于大部分的排序算法，因而命名为快速排序。
 * 快速排序实现的核心思想就是在待排序序列中选择一个基准值，然后将小于
 * 基准值的数字放在基准值左边，大于基准值的数字放在基准值右边，然后左
 * 右两边递归排序，整个排序过程中最关键部分就是寻找基准值在待排序序列
 * 中的索引位置。
 */
public class QuickSort {
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int base = numbers[start];
            int temp;
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            }
            while (i <= j);
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
    }
}
