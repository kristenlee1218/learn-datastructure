package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和
 */
public class EP119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex / 2; i++) {
            result.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        int j = (rowIndex & 1) == 0 ? 2 : 1;
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
            result.add(result.get(i - j));
            j += 2;
        }
        return result;
    }
}
