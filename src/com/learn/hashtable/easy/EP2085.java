package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/12/2
 * @description : 两个字符串数组 words1 和 words2，请返回
 * 在两个字符串数组中都恰好出现一次的字符串的数目
 */
public class EP2085 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        if (words1.length == 0 || words2.length == 0) {
            return 0;
        }
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s1 : words1) {
            map1.put(s1, map1.getOrDefault(s1, 0) + 1);
        }
        for (String s2 : words2) {
            map2.put(s2, map2.getOrDefault(s2, 0) + 1);
        }
        for (String s1 : words1) {
            if (map1.get(s1) != 1) {
                map1.replace(s1, 0);
            }
        }
        for (String s2 : words2) {
            if (map2.get(s2) != 1) {
                map2.replace(s2, 0);
            }
        }
        for (String str : map1.keySet()) {
            if (map1.containsKey(str) && map2.containsKey(str) && map1.get(str) == 1 && map2.get(str) == 1) {
                count++;
            }
        }
        return count;
    }
}
