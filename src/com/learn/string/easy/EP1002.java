package com.learn.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符
 * 串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每
 * 个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * 可以按任意顺序返回答案
 */
public class EP1002 {
    public List<String> commonChars(String[] words) {
        int[] nums = new int[26];
        Arrays.fill(nums, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                nums[i] = Math.min(nums[i], freq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < nums[i]; ++j) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }
}
