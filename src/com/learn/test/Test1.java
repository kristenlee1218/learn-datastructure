package com.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int count = 1, length = s.length();
        for (int i = 0; i < length; i++) {
            if (i == length - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (count >= 3) {
                    list.add(Arrays.asList(i - count + 1, i));
                }
                count = 1;
            } else {
                count++;
            }
        }
        return list;
    }
}