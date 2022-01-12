package com.learn.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :
 */
public class EP1331 {
    public int[] arrayRankTransform(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int value : temp) {
            if (map.get(value) == null) {
                map.put(value, count);
                count++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
