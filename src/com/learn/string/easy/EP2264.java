package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description : 一个字符串 s，表示一个大整数。如果一个整数满足下述所有条件，
 * 则认为该整数是一个优质整数：
 * 该整数是 s 的一个长度为 3 的子字符串
 * 该整数由唯一一个数字重复 3 次组成
 * 以字符串形式返回最大的优质整数。如果不存在满足要求的整数，则返回一个空字符串 ""
 */
public class EP2264 {
    public String largestGoodInteger(String s) {
        String[] str = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
        for (int i = 9; i >= 0; i--) {
            if (s.contains(str[i])) {
                return str[i];
            }
        }
        return "";
    }
}
