package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 两个字符串数组 word1 和 word2。如果两个数组表示的
 * 字符串相同返回 true；否则返回 false
 */
public class EP1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }
        for (String str : word2) {
            sb2.append(str);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
