package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/30
 * @description : 一个字符串数组 words 和两个已经存在于该数组中的
 * 不同的字符串 word1 和 word2。返回列表中这两个单词之间的最短距离
 */
public class EP243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(word2)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
        }
        return minDistance;
    }
}
