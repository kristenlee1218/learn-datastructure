package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 顺序查找
 * 顺序查找（Sequence Search）是按照序列原有顺序对数组进行
 * 遍历比较查询的基本查找算法
 */
public class SequenceSearch {
    public static int sequenceSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
