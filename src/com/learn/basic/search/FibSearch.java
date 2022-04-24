package com.learn.basic.search;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description :斐波那契查找
 * 斐波那契查找（Fib Search）与折半查找很相似，是根据斐波那契序列
 * 的特点对有序表进行分割的。要求开始表中记录的个数为某个斐波那契数
 * 小 1，及 n=F(k)-1；开始将 k 值与第 F(k-1) 位置的记录进行比较
 * 及 mid = low + F(k-1)-1
 */
public class FibSearch {
    public static int maxSize = 20;

    // 斐波那契数列
    public static int[] fib() {
        int[] fib = new int[maxSize];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int fibSearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int k = 0;
        int mid = 0;
        int f[] = fib();
        while (high > f[k] - 1) {
            k++;
        }
        int[] temp = Arrays.copyOf(a, f[k]);
        for (int i = high + 1; i < temp.length; i++) {
            temp[i] = a[high];
        }
        while (low <= high) {
            mid = low + f[k - 1] - 1;
            if (key < temp[mid]) {
                high = mid - 1;
                k--;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k -= 2;
            } else {
                if (mid <= high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }
}
