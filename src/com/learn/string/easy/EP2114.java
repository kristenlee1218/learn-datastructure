package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description : 一个句子由一些单词以及它们之间的单个空格组成，句子的开头和
 * 结尾不会有多余空格。给一个字符串数组 sentences，其中 sentences[i] 表示
 * 单个句子。请返回单个句子里单词的最多数目
 */
public class EP2114 {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String s : sentences) {
            String[] str = s.split(" ");
            result = Math.max(result, str.length);
        }
        return result;
    }
}
