package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :两个字符串数组 word1 和 word2。如果两个数组表示的字符串
 * 相同返回 true；否则返回 false
 */
public class EP1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String str : word1) {
            s1.append(str);
        }
        for (String str : word2) {
            s2.append(str);
        }
        return s1.toString().equals(s2.toString());
    }
}
