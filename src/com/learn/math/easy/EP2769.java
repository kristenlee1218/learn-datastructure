package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 两个整数 num 和 t。如果整数 x 可以在执行下述操作不超过 t 次的情况下变为与 num 相等，
 * 则称其为可达成数字，每次操作将 x 的值增加或减少 1，同时可以选择将 num 的值增加或减少 1。返回所有可达成
 * 数字中的最大值。可以证明至少存在一个可达成数字
 */
public class EP2769 {
    public int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
