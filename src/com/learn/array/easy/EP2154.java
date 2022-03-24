package com.learn.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Kristen
 * @date ：2022/3/24
 * @description :一个整数数组 nums，另给一个整数 original，这是
 * 需要在 nums 中搜索的第一个数字。接下来，需要按下述步骤操作：如果
 * 在 nums 中找到 original，将 original 乘以 2，得到新 original
 * （即，令 original = 2 * original）。否则，停止这一过程。只要能
 * 在数组中找到新 original，就对新 original 继续重复这一过程。返回
 * original 的最终值
 */
public class EP2154 {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
    }
}
