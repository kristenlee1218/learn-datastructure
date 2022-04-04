package com.learn.string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description :句子是一串由空格分隔的单词。每个单词仅由小写字母组成。如果某个单词
 * 在其中一个句子中恰好出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * 两个句子 s1 和 s2，返回所有不常用单词的列表。返回列表中单词可以按任意顺序组织
 */
public class EP884 {
    public String[] uncommonFromSentences(String a, String b) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String s : (a + " " + b).split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
