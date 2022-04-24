package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :一个字符串 title，它由单个空格连接一个或多个单词组成，每个单词都
 * 只包含英文字母。请按以下规则将每个单词的首字母大写、如果单词的长度为 1 或者 2，所
 * 有字母变成小写。否则将单词首字母大写，剩余字母变成小写。请返回大写后的 title
 */
public class EP2129 {
    public String capitalizeTitle(String title) {
        String[] str = title.toLowerCase().split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] c = str[i].toCharArray();
            if (c.length > 2) {
                c[0] = (char) (c[0] - 32);
                str[i] = new String(c);
            }
        }
        return String.join(" ", str);
    }
}
