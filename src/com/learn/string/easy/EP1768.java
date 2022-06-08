package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 两个字符串 word1 和 word2 。请从 word1 开始，通过交替
 * 添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加
 * 到合并后字符串的末尾、返回合并后的字符串
 */
public class EP1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return sb.append(word1.substring(length)).append(word2.substring(length)).toString();
    }
}
