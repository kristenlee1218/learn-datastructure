package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :全字母句指包含英语字母表中每个字母至少一次的句子。一个仅由
 * 小写英文字母组成的字符串 sentence，请判断 sentence 是否为全字母句、如果
 * 是返回 true；否则返回 false
 */
public class EP1832 {
    public boolean checkIfPangram(String sentence) {
        if (sentence == null || sentence.length() < 26) {
            return false;
        }
        int[] arr = new int[26];
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            arr[ch - 97]++;
        }
        for (int i : arr) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
