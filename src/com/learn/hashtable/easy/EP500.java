package com.learn.hashtable.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :一个字符串数组 words，只返回可以使用
 * 在美式键盘同一行的字母打印出来的单词
 */
public class EP500 {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        for (int i = 0; i < row1.length(); i++) {
            set1.add(row1.charAt(i));
        }
        for (int i = 0; i < row2.length(); i++) {
            set2.add(row2.charAt(i));
        }
        for (int i = 0; i < row3.length(); i++) {
            set3.add(row3.charAt(i));
        }
        for (String s : words) {
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            for (int j = 0; j < s.length(); j++) {
                if (set1.contains(s.charAt(j))) {
                    flag1 = true;
                }
                if (set2.contains(s.charAt(j))) {
                    flag2 = true;
                }
                if (set3.contains(s.charAt(j))) {
                    flag3 = true;
                }
            }
            if (flag1 && !flag2 && !flag3) {
                list.add(s);
            }
            if (!flag1 && flag2 && !flag3) {
                list.add(s);
            }
            if (!flag1 && !flag2 && flag3) {
                list.add(s);
            }
        }
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }
        return str;
    }
}
