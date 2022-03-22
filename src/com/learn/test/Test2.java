package com.learn.test;

import java.util.*;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
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
            for (int i = 0; i < s.length(); i++) {
                if (set1.contains(s.charAt(i))) {
                    flag1 = true;
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (set2.contains(s.charAt(i))) {
                    flag2 = true;
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (set3.contains(s.charAt(i))) {
                    flag3 = true;
                    break;
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

