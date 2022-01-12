package com.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        Arrays.sort(words, Comparator.comparing(String::length));
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}

