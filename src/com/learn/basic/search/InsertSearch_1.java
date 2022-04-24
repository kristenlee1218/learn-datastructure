package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 插值查找
 * 插值查找（Insert Search）有序表的一种查找方式。插值查找是根据
 * 查找关键字与查找表中最大最小记录关键字比较后的查找方法。插值查
 * 找基于二分查找，将查找点的选择改进为自适应选择，提高查找效率
 */
public class InsertSearch_1 {
    private static int search2(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        if (array[right] == array[left]) {
            if (array[right] == key) {
                return right;
            } else {
                return -1;
            }
        }
        int mid = left + (key - array[left]) / (array[right] - array[left]) * (right - left);
        if (array[mid] == key) {
            return mid;
        }
        if (array[mid] > key) {
            return search2(array, key, left, mid - 1);
        }
        return search2(array, key, mid + 1, right);
    }
}
