package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 二分法查
 * 二分法查（Binary Search）找适用于大的数据，但前提条件是数据必须是有序的，
 * 他的原理是先和中间的比较，如果等于就直接返回，如果小于就在前半部分继续使用
 * 二分法进行查找，如果大于则在后半部分继续使用二分法进行查找
 */
public class BinarySearch {
    public int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) >> 1;
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                low = middle + 1;
            }
            if (value < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
