package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/12
 * @description :一个偶数长度的字符串 s。将其拆分成长度相同的两半，前一半为 a，
 * 后一半为 b、两个字符串相似的前提是它们都含有相同数目的元音（'a'，'e'，'i'，
 * 'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * 如果 a 和 b 相似，返回 true；否则，返回 false
 */
public class EP1704 {
    public boolean halvesAreAlike(String s) {
        String str = "aeiouAEIOU";
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (str.indexOf(s.charAt(i)) != -1) {
                count1++;
            }
            if (str.indexOf(s.charAt(i + s.length() / 2)) != -1) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
