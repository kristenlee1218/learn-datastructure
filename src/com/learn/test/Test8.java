package com.learn.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP228
 */
public class Test8 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (!(i + 1 < nums.length && nums[i] == nums[i + 1] - 1)) {
                if (sb.length() > 0) {
                    sb.append("->");
                }
                sb.append(nums[i]);
                list.add(sb.toString());
            } else {
                if (sb.length() == 0) {
                    sb.append(nums[i]);
                }
            }
        }
        return list;
    }

}
