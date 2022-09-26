package com.learn.offer.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/9/26
 * @description : 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，
 * 即这 5 张牌是不是连续的。2～10 为数字本身，A 为 1，J 为 11，Q 为
 * 12，K 为 13，而大、小王为 0，可以看成任意数字。A 不能视为 14
 */
public class Offer61_1 {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }
}
