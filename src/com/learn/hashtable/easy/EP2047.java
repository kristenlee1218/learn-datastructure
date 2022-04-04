package com.learn.hashtable.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/25
 * @description :句子仅由小写字母（'a' 到 'z'）、数字（'0' 到 '9'）、
 * 连字符（'-'）、标点符号（'!'、'.' 和 ','）以及空格（' '）组成。每个
 * 句子可以根据空格分解成一个或者多个 token，这些 token 之间由一个或者
 * 多个空格 ' ' 分隔。如果一个 token 同时满足下述条件，则认为这个 token
 * 是一个有效单词：仅由小写字母、连字符和 / 或标点（不含数字）组成。至多
 * 一个连字符 '-' 。如果存在，连字符两侧应当都存在小写字母（"a-b" 是一
 * 个有效单词，但 "-ab" 和 "ab-" 不是有效单词）。至多一个标点符号。
 * 如果存在，标点符号应当位于 token 的末尾。这里给出几个有效单词的例
 * 子："a-b."、"afad"、"ba-c"、"a!" 和 "!"。一个字符串 sentence，
 * 请找出并返回 sentence 中有效单词的数目
 */
public class EP2047 {
    public int countValidWords(String sentence) {
        String regex = "([a-z]*|([a-z]+-[a-z]+))[!.,]?";
        int count = 0;
        for (String s : sentence.split(" ")) {
            if (s.length() > 0 && s.matches(regex)) {
                count++;
            }
        }
        return count;
    }
}
