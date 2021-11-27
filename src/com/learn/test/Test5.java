package com.learn.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP136-1
 */
public class Test5 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
