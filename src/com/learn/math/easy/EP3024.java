package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2024/5/16
 * @description : 一个下标从 0 开始长度为 3 的整数数组 nums ，需要用它们来构造三角形。
 * 如果一个三角形的所有边长度相等，那么这个三角形称为 equilateral。如果一个三角形恰好有
 * 两条边长度相等，那么这个三角形称为 isosceles。如果一个三角形三条边的长度互不相同，
 * 那么这个三角形称为 scalene。如果这个数组无法构成一个三角形，请你返回字符串 "none"，
 * 否则返回一个字符串表示这个三角形的类型
 */
public class EP3024 {
    public String triangleType(int[] nums) {
        String result = "";
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if ((a + b <= c) || (a + c <= b) || (b + c) <= a) {
            result = "none";
        } else {
            if (a == b && a == c) {
                result = "equilateral";
            } else if (a == b || b == c || c == a) {
                result = "isosceles";
            } else {
                result = "scalene";
            }
        }
        return result;
    }
}
