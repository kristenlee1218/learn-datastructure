package com.learn.hashtable.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定仅有小写字母组成的字符串数组 A，返回列表中
 * 的每个字符串中都显示的全部字符（包括重复字符）组成的列表
 */
public class EP1002 {
    public List<String> commonChars(String[] str) {
        // 先得到第一个字符串里面每个字符的情况
        int[] charCount = new int[26];
        for (int i = 0; i < str[0].length(); i++) {
            charCount[str[0].charAt(i) - 'a']++;
        }
        // 从第 1 个开始逐个进行比较
        for (int i = 1; i < str.length; i++) {
            int[] curCount = new int[26];
            // 遍历第 i 个字符串
            for (int j = 0; j < str[i].length(); j++) {
                curCount[str[i].charAt(j) - 'a']++;
            }
            // 将此时关于第 i 个字符串的情况与 charCount 对比，取小的即可
            for (int k = 0; k < 26; k++) {
                charCount[k] = Math.min(charCount[k], curCount[k]);
            }
        }
        //此时的 charCount 即为所有的字符串出现的共有的最小元素的个数
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (charCount[i] != 0) {
                result.add(String.valueOf((char) (i + 'a')));
                charCount[i]--;
            }
        }
        return result;
    }
}
