package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2024/5/16
 * @description : 有效单词需要满足以下几个条件：
 * 至少包含 3 个字符。由数字 0-9 和英文大小写字母组成。（不必包含所有这类字符）
 * 至少包含一个元音字母。至少包含一个辅音字母。
 * 一个字符串 word。如果 word 是一个有效单词，则返回 true，否则返回 false
 */
public class EP3136 {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false, hasConsonant = false;
        for (char c : word.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
