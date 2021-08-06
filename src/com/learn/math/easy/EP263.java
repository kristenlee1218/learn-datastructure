package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 编写一个程序判断给定的数是否为丑数（丑数就是只包含质因数 2、3、5 的正整数）
 */
public class EP263 {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (true) {
            if (num == 1) {
                return true;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
    }
}
