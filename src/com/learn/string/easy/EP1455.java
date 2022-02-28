package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/6
 * @description :一个字符串 sentence 作为句子并指定检索词为 searchWord，其中
 * 句子由若干用 单个空格分隔的单词组成。请检查检索词 searchWord 是否为句子
 * sentence 中任意单词的前缀。如果 searchWord 是某一个单词的前缀，则返回句子
 * sentence 中该单词所对应的下标（下标从 1 开始）。如果 searchWord 是多个单词
 * 的前缀，则返回匹配的第一个单词的下标（最小下标）。如果 searchWord 不是任何
 * 单词的前缀，则返回 -1 。字符串 S 的前缀是 S 的任何前导连续子字符串
 */
public class EP1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.length() >= searchWord.length() && w.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
