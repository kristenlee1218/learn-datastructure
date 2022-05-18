package com.learn.test;

import java.util.*;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int[] arrayRankTransform(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : temp) {
            if (map.get(j) == null) {
                map.put(j, count);
                count++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}


