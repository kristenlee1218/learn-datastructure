package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description : 桌子上有一堆石头。轮流进行自己的回合，你作为先手。每一回合
 * 轮到的人拿掉 1 - 3 块石头。拿掉最后一块石头的人就是获胜者。假设每一步都是
 * 最优解。请编写一个函数，来判断你是否可以在给定石头数量为 n的情况下赢得游戏。
 * 如果可以赢，返回 true；否则，返回 false
 */
public class EP292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
