package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 银行账户里有 100 块钱。给一个整数 purchaseAmount，它表示你在一次购买中愿意支出的金额。
 * 在一个商店里进行一次购买，实际支出的金额会向最近的 10 的倍数取整，实际会支付一个非负金额 roundedAmount，
 * 满足 roundedAmount 是 10 的倍数且 abs(roundedAmount - purchaseAmount) 的值最小。如果存在多于一
 * 个最接近的 10 的倍数，较大的倍数是实际支出金额。请返回一个整数，表示在愿意支出金额为 purchaseAmount 块
 * 钱的前提下，购买之后剩下的余额
 */
public class EP2806 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n = purchaseAmount % 10;
        if (n < 5) {
            purchaseAmount -= n;
        } else {
            purchaseAmount += 10 - n;
        }
        return 100 - purchaseAmount;
    }
}
