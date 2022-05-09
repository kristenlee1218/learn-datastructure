package com.learn.lcp.easy;

/**
 * @author : Kristen
 * @date : 2021/7/29
 * @description : 小 A 和 小 B 在玩猜数字。小 B 每次从 1, 2, 3 中随机选择一个，
 * 小 A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回小 A 猜对
 * 了几次？输入的 guess 数组为小 A 每次的猜测，answer 数组为小 B 每次的选择。
 * guess 和 answer 的长度都等于 3
 */
public class LCP01 {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
