package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个 m x n 的整数网格 accounts，其中 accounts[i][j]是第
 * i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的资产总量。客户的资
 * 产总量就是他们在各家银行托管的资产数量之和。最富有客户就是资产总量最大的客户
 */
public class EP1672 {
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 1; j < accounts[i].length; j++) {
                accounts[i][0] += accounts[i][j];
            }
            accounts[0][0] = Math.max(accounts[0][0], accounts[i][0]);
        }
        return accounts[0][0];
    }
}
