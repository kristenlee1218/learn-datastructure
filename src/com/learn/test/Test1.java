package com.learn.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Test1.longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "";
        }
        for (int i = 0; i < str[0].length(); i++) {
            char temp = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || temp != str[j].charAt(i)) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}