package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 插值查找
 * 插值查找（Insert Search）有序表的一种查找方式。插值查找是根据
 * 查找关键字与查找表中最大最小记录关键字比较后的查找方法。插值查
 * 找基于二分查找，将查找点的选择改进为自适应选择，提高查找效率
 */
public class InsertSearch {
    private static int search(int[] array, int key, int left, int right) {
        while (left <= right) {
            if (array[right] == array[left]) {
                if (array[right] == key) {
                    return right;
                } else {
                    return -1;
                }
            }
            int middle = left + ((key - array[left]) / (array[right] - array[left])) * (right - left);
            if (array[middle] == key) {
                return middle;
            }
            if (key < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
