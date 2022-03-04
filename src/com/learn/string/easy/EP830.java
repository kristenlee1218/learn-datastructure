package com.learn.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/3
 * @description :在一个由小写字母构成的字符串 s 中，包含由一些连续的相同
 * 字符所构成的分组。例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb",
 * "xxxx","z" 和 "yy" 这样的一些分组。分组可以用区间 [start, end] 表示，
 * 其中 start 和 end 分别表示该分组的起始和终止位置的下标。
 */
public class EP830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int count = 1;
        int length = s.length();
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
