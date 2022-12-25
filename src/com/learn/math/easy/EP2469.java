package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 一个四舍五入到两位小数的非负浮点数 celsius
 * 来表示温度，以摄氏度（Celsius）为单位。需要将摄氏度转换为开
 * 氏度（Kelvin）和华氏度（Fahrenheit），并以数组 nums =
 * [kelvin, fahrenheit] 的形式返回结果。返回数组 nums
 */
public class EP2469 {
    public double[] convertTemperature(double celsius) {
        double[] nums = new double[2];
        nums[0] = celsius + 273.15;
        nums[1] = celsius * 1.80 + 32.00;
        return nums;
    }
}
