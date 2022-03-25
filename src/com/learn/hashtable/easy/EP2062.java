package com.learn.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Kristen
 * @date ：2022/3/25
 * @description :子字符串是字符串中的一个连续（非空）的字符序列。
 * 元音子字符串是仅由元音（'a'、'e'、'i'、'o' 和 'u'）组成的一
 * 个子字符串，且必须包含全部五种元音。一个字符串 word，统计并返
 * 回 word 中元音子字符串的数目
 */
public class EP2062 {
    public int countVowelSubstrings(String word) {
        String s = "aeiou";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < word.length(); j++) {
                if (s.indexOf(word.charAt(j)) < 0) {
                    break;
                }
                set.add(word.charAt(j));
                if (set.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }
}
