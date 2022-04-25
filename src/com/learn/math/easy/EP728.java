package com.learn.math.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description : 自除数是指可以被它包含的每一位数除尽的数。自除数不允许包含 0。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数
 */
public class EP728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 0 || i % (temp % 10) != 0) {
                    break;
                }
                temp /= 10;
            }
            if (temp == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
