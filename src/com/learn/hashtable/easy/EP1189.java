package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个字符串 text，需要使用 text 中的字母来拼凑尽可能多的
 * 单词 "balloon"、字符串 text 中的每个字母最多只能被使用一次。返回最
 * 多可以拼凑出多少个单词 "balloon"
 */
public class EP1189 {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                arr[0]++;
            }
            if (c == 'a') {
                arr[1]++;
            }
            if (c == 'l') {
                arr[2]++;
            }
            if (c == 'o') {
                arr[3]++;
            }
            if (c == 'n') {
                arr[4]++;
            }
        }
        arr[2] >>= 1;
        arr[3] >>= 1;
        return Arrays.stream(arr).min().getAsInt();
    }
}
