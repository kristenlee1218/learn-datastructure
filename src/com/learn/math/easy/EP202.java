package com.learn.math.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :编写一个算法来判断一个数 n 是不是快乐数
 * <p>
 * 「快乐数」定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和、然后重复这个过程直到这个数变为 1，
 * 也可能是无限循环但始终变不到 1、如果可以变为 1，那么这个数就是快乐数、
 * 如果 n 是快乐数就返回 true；不是则返回 false
 */
public class EP202 {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n != 1) {
            int count = 0;
            while (n > 0) {
                count += (n % 10) * (n % 10);
                n /= 10;
            }
            if (map.containsKey(count)) {
                return false;
            }
            map.put(count, 1);
            n = count;
        }
        return true;
    }
}
