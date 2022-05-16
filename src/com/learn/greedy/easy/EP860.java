package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 * 顾客排队购买（按账单 bills 支付的顺序）一次购买一杯。每位顾
 * 客只买一杯柠檬水，然后付 5 美元、10 美元或 20 美元。必须给
 * 每个顾客正确找零，也就是说净交易是每位顾客支付 5 美元。注意，
 * 一开始没有任何零钱。一个整数数组 bills，其中 bills[i] 是
 * 第 i 位顾客付的账。如果能给每位顾客正确找零，返回 true，否
 * 则返回 false
 */
public class EP860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
