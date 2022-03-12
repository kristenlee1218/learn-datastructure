package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/12
 * @description :一个仅包含小写英文字母和 '?' 字符的字符串 s，请将所有
 * 的 '?' 转换为若干小写字母，使最终的字符串不包含任何连续重复的字符
 */
public class EP1576 {
    public String modifyString(String s) {
        char[] sb = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                char ch = 'a';
                while ((i > 0 && sb[i - 1] == ch) || (i < s.length() - 1 && sb[i + 1] == ch)) {
                    ch++;
                }
                sb[i] = ch;
            }
        }
        return new String(sb);
    }
}
