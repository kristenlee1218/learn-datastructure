package com.learn.basic.sort;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 冒泡排序
 * 冒泡排序（Bubble Sort），是计算机科学与技术领域中较为简单的一种排序算法。
 *
 * 它重复地遍历要排序的序列，会依次比较两个相邻的元素，如果发现两个相邻的元素
 * 顺序错误就把它们交换过来。遍历序列的工作会重复地进行直到没有相邻的元素需要
 * 交换位置，也就是说序列的排序工作已经完成。
 *
 * 冒泡排序的算法名称的由来就是因为在排序的过程中，按照排序规则（升序或者降序），
 * 越小或者越大的元素会经过交换之后慢慢 “浮” 到序列的顶端，就如同水中的气泡一
 * 样最终会浮到顶端一样，所以起名为 “冒泡排序”。
 */
public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

