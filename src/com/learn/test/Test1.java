package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
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

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
}