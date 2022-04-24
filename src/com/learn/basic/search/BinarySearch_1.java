package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description :二分法查
 * 二分法查（Binary Search）找适用于大的数据，但前提条件是
 * 数据必须是有序的，他的原理是先和中间的比较，如果等于就直
 * 接返回，如果小于就在前半部分继续使用二分法进行查找，如果
 * 大于则在后半部分继续使用二分法进行查找
 */
public class BinarySearch_1 {
    public static int binarySearch(int[] a, int value, int low, int high) {
        int mid = (low + high) / 2;

        if (value == a[mid]) {
            return mid;
        }

        mid = (low + high) / 2;

        if (value < a[mid]) {
            return binarySearch(a, value, low, mid - 1);
        }

        if (value > a[mid]) {
            return binarySearch(a, value, mid + 1, high);
        }

        return -1;
    }
}