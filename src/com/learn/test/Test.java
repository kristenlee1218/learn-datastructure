package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {

    public static void main(String[] args) {
        Test.totalMoney(49);
    }

    public static int totalMoney(int n) {
        int week = n / 7, money = 0;
        for (int i = 1; i < week; i++) {
            money += i * 7;
        }
        for (int i = week + 1; i <= week + n % 7; i++) {
            money += i;
        }
        System.out.println(week * 28 + money);
        return week * 28 + money;
    }
}
