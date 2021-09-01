package com.learn.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。
 * 例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。给定非负整数 X 的数组形式 A，
 * 返回整数 X+K 的数组形式
 */
public class EP989 {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            int sum = nums[i] + k % 10;
            k /= 10;
            if (sum >= 10) {
                k++;
                sum -= 10;
            }
            list.add(sum);
        }
        for (; k > 0; k /= 10) {
            list.add(k % 10);
        }
        Collections.reverse(list);
        return list;
    }
}
