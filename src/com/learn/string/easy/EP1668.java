package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/12
 * @description :一个字符串 sequence，如果字符串 word 连续重复 k 次
 * 形成的字符串是 sequence 的一个子字符串，那么单词 word 的 重复值为 k。
 * 单词 word 的 最大重复值是单词 word 在 sequence 中最大的重复值。
 * 如果 word 不是 sequence 的子串，那么重复值 k 为 0、一个字符串
 * sequence 和 word，请返回最大重复值 k
 */
public class EP1668 {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            count++;
            sb.append(word);
        }
        return count;
    }
}
