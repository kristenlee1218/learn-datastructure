package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 编写一个程序判断给定的数是否为丑数
 * （丑数就是只包含质因数 2、3、5 的正整数）
 */
public class EP263 {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
    }
}
