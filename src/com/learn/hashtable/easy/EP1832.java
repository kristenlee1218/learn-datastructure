package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 全字母句指包含英语字母表中每个字母至少一次的句子。
 * 一个仅由小写英文字母组成的字符串 sentence，请判断 sentence 是否
 * 为全字母句、如果是返回 true；否则返回 false
 */
public class EP1832 {
    public boolean checkIfPangram(String s) {
        if (s.length() < 26) {
            return false;
        }
        int[] result = new int[26];
        char[] ch = s.toCharArray();
        for (char c : ch) {
            result[c - 97]++;
        }
        for (int value : result) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }
}
