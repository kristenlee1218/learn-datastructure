package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 给定一个赎金信（ransom）字符串和一个杂志（magazine）字符
 * 串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 * 如果可以构成，返回 true；否则返回 false
 */
public class EP383 {
    public boolean canConstruct(String ransom, String magazine) {
        if (ransom.length() > magazine.length()) {
            return false;
        }
        int[] result = new int[26];
        for (char c : magazine.toCharArray()) {
            result[c - 'a']++;
        }
        for (char c : ransom.toCharArray()) {
            result[c - 'a']--;
            if (result[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
