package com.learn.binarySearch.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给出三个均为严格递增排列的整数数组 arr1，arr2 和 arr3。
 * 返回一个由仅在这三个数组中同时出现的整数所构成的有序数组
 */
public class EP1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], i);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : arr3) {
            if (map1.get(i) != null && map2.get(i) != null) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
}
