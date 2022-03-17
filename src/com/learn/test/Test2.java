package com.learn.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] ch = pattern.toCharArray();
        if (str.length != ch.length) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (map1.containsKey(ch[i])) {
                if (!map1.get(ch[i]).equals(str[i])) {
                    return false;
                }
            } else {
                map1.put(ch[i], str[i]);
            }
            if (map2.containsKey(str[i])) {
                if (map2.get(str[i]) != ch[i]) {
                    return false;
                }
            } else {
                map2.put(str[i], ch[i]);
            }
        }
        return true;
    }
}

