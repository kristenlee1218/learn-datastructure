package com.learn.array.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :自除数是指可以被它包含的每一位数除尽的数。自除数不允许包含 0。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数
 */
public class EP728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int num = left; num < right + 1; num++) {
            Set<Integer> set = new HashSet<>();
            int temp = num;
            boolean flag = true;
            while (temp != 0) {
                if ((temp % 10) != 0) {
                    set.add(temp % 10);
                } else {
                    flag = false;
                    break;
                }
                temp /= 10;
            }
            for (Integer x : set) {
                if (num % x != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(num);
            }
        }
        return list;
    }
}
