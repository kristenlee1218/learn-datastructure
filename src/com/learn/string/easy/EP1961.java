package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/8/17
 * @description : 一个字符串 s 和一个字符串数组 words，判断 s 是否为
 * words 的前缀字符串。字符串 s 要成为 words 的前缀字符串，需要满足 s
 * 可以由 words 中的前 k（k 为 正数）个字符串按顺序相连得到，且 k 不超过
 * words.length。如果 s 是 words 的前缀字符串，返回 true；否则返回 false
 */
public class EP1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
