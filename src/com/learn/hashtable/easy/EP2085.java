package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/12/2
 * @description :给你两个字符串数组 words1 和 words2，请返回在两个
 * 字符串数组中都恰好出现一次的字符串的数目
 */
public class EP2085 {
    public int countWords(String[] words1, String[] words2) {
        int length1 = words1.length;
        int length2 = words2.length;
        int count = 0;
        if (length1 == 0 || length2 == 0) {
            return 0;
        }
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words1) {
            if (map1.get(s) != 1) {
                map1.replace(s, 0);
            }
        }
        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            if (map2.get(s) != 1) {
                map2.replace(s, 0);
            }
        }
        for (String s : map1.keySet()) {
            if (map1.containsKey(s) && map2.containsKey(s) && map1.get(s) == 1 && map2.get(s) == 1) {
                count++;
            }
        }
        return count;
    }
}
