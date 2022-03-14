package com.learn.test;


/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test3 {
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
