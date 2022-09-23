package com.learn.offer.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个
 */
public class Offer45 {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }
}
