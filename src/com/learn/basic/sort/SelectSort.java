package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 选择排序
 * 选择排序（Select Sort），是计算机科学与技术领域中较为简单的一种排序算法。
 *
 * 假设我们按照从小到大的顺序进行排序。选择排序会首先从待排序序列中选择一个
 * 最小的元素放入排序好的序列中，然后依次在从未排序好的序列中选择最小的元素，
 * 直到最后需要选择的待排序序列中只有一个元素，只需要将这个元素放在最后位置，
 * 就完成了整个排序过程。
 *
 * 选择排序的算法名称的由来就是因为在排序的过程中，按照排序规则（升序或者
 * 降序），依次从待排序的序列中选择出需要排列的元素。越小或者越大的元素会
 * 先选择出来，直至完成整个排序。
 */
public class SelectSort {
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < key) {
                    key = arr[j];
                    position = j;
                }
            }
            arr[position] = arr[i];
            arr[i] = key;
        }
    }
}
