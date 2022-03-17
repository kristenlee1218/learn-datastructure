package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/17
 * @description :一个字符串 s，仅反转字符串中的所有元音字母，并返回结果字
 * 符串。元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现
 */
public class EP345 {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            while (i < j && !isVowel(ch[i])) {
                i++;
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }
            char c = ch[i];
            ch[i++] = ch[j];
            ch[j--] = c;
        }
        return String.valueOf(ch);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}
