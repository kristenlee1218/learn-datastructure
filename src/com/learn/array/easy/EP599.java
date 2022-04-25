package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description : 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且
 * 他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。需要
 * 帮助他们用最少的索引和找出他们共同喜爱的餐厅。如果答案不止一个，则
 * 输出所有答案并且不考虑顺序。可以假设答案总是存在
 */
public class EP599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j == min) {
                        list.add(list1[i]);
                    } else if (i + j < min) {
                        min = i + j;
                        list.clear();
                        list.add(list1[i]);
                    }
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
