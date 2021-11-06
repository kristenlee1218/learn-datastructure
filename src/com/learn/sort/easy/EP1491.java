package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 salary，数组里每个数都是唯一的，其中 salary[i]
 * 是第 i 个员工的工资。请返回去掉最低工资和最高工资以后，剩下员工工资的平均值
 */
public class EP1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        double average;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        average = sum / (salary.length - 2);
        return average;
    }
}
