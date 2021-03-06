package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个数组 candies 和一个整数 extraCandies，其
 * 中 candies[i] 代表第 i 个孩子拥有的糖果数目、对每一个孩子，检查
 * 是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，
 * 此孩子有最多的糖果。注意允许有多个孩子同时拥有最多的糖果数目
 */
public class EP1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
}
