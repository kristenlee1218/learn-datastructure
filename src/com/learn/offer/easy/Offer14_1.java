package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段
 * （m、n 都是整数，n>1 并且 m>1），每段绳子的长度记为 k[0],k[1]...
 * k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，
 * 当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得
 * 到的最大乘积是 18
 */
public class Offer14_1 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }
}
