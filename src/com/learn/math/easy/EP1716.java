package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 每天都往力扣银行里存钱、最开始在周一的时候存入 1 块钱。
 * 从周二到周日，每天都比前一天多存入 1 块钱。在接下来每一个周一，都会比前
 * 一个周一多存入 1 块钱。请返回在第 n 天结束时在力扣银行总共存了多少块钱
 */
public class EP1716 {
    public int totalMoney(int n) {
        int week = n / 7, money = 0;
        for (int i = 1; i < week; i++) {
            money += i * 7;
        }
        for (int i = week + 1; i <= week + n % 7; i++) {
            money += i;
        }
        return week * 28 + money;
    }
}
