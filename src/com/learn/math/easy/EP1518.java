package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description :小区便利店正在促销，用 k 个空酒瓶可以兑换一瓶新酒。 购入了
 * n 瓶酒。如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。请计算最多能喝到多少瓶酒。
 */
public class EP1518 {
    public int numWaterBottles(int n, int k) {
        int bottle = n, result = n;
        while (bottle >= k) {
            bottle -= k;
            result++;
            bottle++;
        }
        return result;
    }
}
