package com.learn.sort.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :整数数组 arr 其中每个元素都不相同。请找到所有具有最小
 * 绝对差的元素对，并且按升序的顺序返回
 */
public class EP1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> llist = new ArrayList<>();
        int absolute = Integer.MAX_VALUE, num;
        for (int i = 0; i < arr.length - 1; i++) {
            num = Math.abs(arr[i + 1] - arr[i]);
            if (num < absolute) {
                llist.clear();
                llist.add(Arrays.asList(arr[i], arr[i + 1]));
                absolute = Math.abs(arr[i + 1] - arr[i]);
            } else if (num == absolute) {
                llist.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return llist;
    }
}
