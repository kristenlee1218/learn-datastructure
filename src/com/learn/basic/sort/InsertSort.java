package com.learn.basic.sort;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 插入排序
 * 插入排序（Insert Sort），是计算机科学与技术领域中较为简单的一种排序算法。
 *
 * 顾名思义，插入排序是通过不断插入待排序的元素完成整个排序过程。插入排序是
 * 一种很简单的排序方式，基本思想就是将一个元素插入到已经排序好的序列中，从
 * 而形成一个新的有序序列。它重复地选择未排序的元素，将其插入已经排序好的序
 * 列中，直到没有待排序元素时，整个排序过程完成。
 *
 * 插入排序的工作方式就像大家打扑克牌时抓牌一样。开始时，我们手上是没有牌的，
 * 依次从桌面上面抓取扑克牌，然后插入自己手中已有扑克牌的位置中，只是插入的
 * 时候我们按照一定的顺序将它插入到合适的位置中。
 */
public class InsertSort {
    public void insertSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
