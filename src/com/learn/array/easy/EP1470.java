package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个数组 nums，数组中有 2n 个元素，按 [x1, x2, ..., xn,
 * y1, y2, ..., yn] 的格式排列、将数组按 [x1, y1, x2, y2, ...,xn, yn]
 * 格式重新排列，返回重排后的数组
 */
public class EP1470 {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
