package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/14
 * @description :
 */
public class EP2302 {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        for (int[] bracket : brackets) {
            tax += bracket[0] * ((bracket[1] * income) / 100);
        }
        return tax;
    }
}
