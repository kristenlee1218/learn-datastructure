package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/8/11
 * @description : 一个字符串数组 words 和一个字符 separator，请按 separator 拆分 words 中的每个字符串。
 * 返回一个由拆分后的新字符串组成的字符串数组，不包括空字符串
 */
public class EP2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        String s = String.valueOf("\\" + separator);
        for (String word : words) {
            String[] splitWords = word.split(s);
            for (String splitWord : splitWords) {
                if (!splitWord.isEmpty()) {
                    list.add(splitWord);
                }
            }
        }
        return list;
    }
}
