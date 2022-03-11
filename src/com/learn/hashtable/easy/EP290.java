package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Kristen
 * @date ：2022/3/11
 * @description :给定一种规律 pattern 和一个字符串 s，判断 s 是否遵循相同的规律。
 * 这里的遵循指完全匹配，例如，pattern 里的每个字母和字符串 str 中的每个非空单词
 * 之间存在着双向连接的对应规律
 */
public class EP290 {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] charArr = pattern.toCharArray();
        if (str.length != charArr.length) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (map1.containsKey(charArr[i])) {
                if (!map1.get(charArr[i]).equals(str[i])) {
                    return false;
                }
            } else {
                map1.put(charArr[i], str[i]);
            }
            if (map2.containsKey(str[i])) {
                if (map2.get(str[i]) != charArr[i]) {
                    return false;
                }
            } else {
                map2.put(str[i], charArr[i]);
            }
        }
        return true;
    }
}
