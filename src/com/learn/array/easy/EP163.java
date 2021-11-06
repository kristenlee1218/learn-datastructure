package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :
 */
public class EP163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        long l = lower, u = upper;
        for (int num : nums) {
            if (num - l == 1) {
                list.add(String.valueOf(l));
            } else if (num - l > 1) {
                list.add(l + "->" + (num - 1));
            }
            l = (long) num + 1;
        }
        if (l == u) {
            list.add(String.valueOf(l));
        } else if (l < u) {
            list.add(l + "->" + u);
        }
        return list;
    }
}
