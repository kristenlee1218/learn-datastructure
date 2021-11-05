package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给定一个赎金信（ransom）字符串和一个杂志（magazine）字符串，
 * 判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 * 如果可以构成，返回 true；否则返回 false
 */
public class EP383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 统计 ransom 字符
        int[] chars = new int[26];
        int ransomLen = ransomNote.length();
        for (int i = 0; i < ransomLen; i++) {
            chars[ransomNote.charAt(i) - 97]++;
        }
        // 遍历 magazine
        for (int i = 0, len = magazine.length(); i < len && ransomLen > 0; i++) {
            int num = chars[magazine.charAt(i) - 97];
            if (num != 0) {
                ransomLen--;
            }
        }
        return ransomLen == 0;
    }
}
