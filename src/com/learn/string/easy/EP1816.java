package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 句子是一个单词列表，列表中的单词之间用单个空格隔开，
 * 且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）
 */
public class EP1816 {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for (int i = 0; i < k; i++) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
