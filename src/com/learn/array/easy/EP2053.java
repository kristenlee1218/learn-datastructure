package com.learn.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/7
 * @description :
 */
public class EP2053 {
    public String kthDistinct(String[] str, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String value : str) {
            int cont = map.getOrDefault(value, 0) + 1;
            map.put(value, cont);
        }
        for (String a : str) {
            if (map.get(a) == 1) {
                k--;
                if (k == 0) {
                    return a;
                }
            }
        }
        return "";
    }
}
