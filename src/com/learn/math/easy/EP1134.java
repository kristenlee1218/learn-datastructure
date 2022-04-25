package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description : 假设存在一个 k 位数 n，其每一位上的数字的 k 次幂的
 * 总和也是 n，这个数是阿姆斯特朗数。一个正整数 n 来判定是否是阿姆斯特
 * 朗数，是则返回 true，不是则返回 false
 */
public class EP1134 {
    public boolean isArmstrong(int n) {
        int count = n, sum = 0;
        int k = String.valueOf(n).length();
        for (int i = 0; i < k; i++) {
            sum += Math.pow(count % 10, k);
            count /= 10;
        }
        return sum == n;
    }
}
