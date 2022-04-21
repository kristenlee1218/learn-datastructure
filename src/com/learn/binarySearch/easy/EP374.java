package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description : 每轮游戏会从 1 到 n 随机选择一个数字。请猜选出的是哪个数字、
 * 如果猜错了会告知猜测的数字比选出的数字是大了还是小了、可以通过调用一个预先定
 * 义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情
 * 况（-1，1 或 0）
 *
 * -1：选出的数字比猜的数字小 pick < num
 * 1：选出的数字比猜的数字大 pick > num
 * 0：选出的数字和猜的数字一样。恭喜！猜对了！pick == num
 * 返回选出的数字
 */
public class EP374 extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) <= 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
