package com.learn.string.easy;

import java.util.HashMap;

/**
 * @author ：Kristen
 * @date ：2022/3/25
 * @description : 一个字符串 word，该字符串由数字和小写英文字母组成。请
 * 用空格替换每个不是数字的字符。例如，"a123bc34d8ef34" 将会变成 "123
 * 34 8 34"。注意，剩下的这些整数为（相邻彼此至少有一个空格隔开）："123"、
 * "34"、"8" 和 "34"。返回对 word 完成替换后形成的不同整数的数目。只有
 * 当两个整数的不含前导零的十进制表示不同，才认为这两个整数也不同
 */
public class EP1805 {
    public int numDifferentIntegers(String word) {
        if (word.length() == 0) {
            return 0;
        }
        String newStr = word.replaceAll("[a-z]+", " ");
        String[] s = newStr.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s1 : s) {
            if ("".equals(s1)) {
                continue;
            }
            String s2 = s1.replaceAll("^(0+)", "");
            map.put(s2, map.getOrDefault(s2, 0) + 1);
        }
        return map.size();
    }
}
