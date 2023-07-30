package com.learn.offer.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Kristen
 * @date ：2022/9/26
 * @description : 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，
 * 即这 5 张牌是不是连续的。2～10 为数字本身，A 为 1，J 为 11，Q 为
 * 12，K 为 13，而大、小王为 0，可以看成任意数字。A 不能视为 14
 */
public class Offer61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return max - min < 5;
    }
}
