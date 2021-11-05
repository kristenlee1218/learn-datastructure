package com.learn.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test3 {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int a = Arrays.stream(alice).sum();
        int b = Arrays.stream(bob).sum();
        int middle = (a - b) / 2;
        Set<Integer> set = new HashSet<>();
        for (int x : alice) {
            set.add(x);
        }
        int[] result = new int[2];
        for (int y : bob) {
            int x = y + middle;
            if (set.contains(x)) {
                result[0] = x;
                result[1] = y;
                break;
            }
        }
        return result;
    }
}
