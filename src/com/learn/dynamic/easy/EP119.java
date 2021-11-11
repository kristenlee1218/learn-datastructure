package com.learn.dynamic.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个非负索引 rowIndex，返回「杨辉三角」的第
 * rowIndex 行。在「杨辉三角」中，每个数是它左上方和右上方的数的和
 */
public class EP119 {
    public List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= row; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    subList.add(1);
                } else {
                    subList.add(list.get(j) + list.get(j - 1));
                }
            }
            list = subList;
        }
        return list;
    }
}
