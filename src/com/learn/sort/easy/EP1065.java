package com.learn.sort.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给出字符串 text 和字符串列表 words, 返回所有的
 * 索引对 [i, j] 使得在索引对范围内的子字符串 text[i]...text[j]
 * （包括 i 和 j）属于字符串列表 words
 */
public class EP1065 {
    public int[][] indexPairs(String text, String[] words) {
        List<Integer[]> lists = new ArrayList<>();
        for (String word : words) {
            int wordLength = word.length();
            int index = text.indexOf(word);
            while (index != -1) {
                Integer[] temp = {index, index + wordLength - 1};
                lists.add(temp);
                index = text.indexOf(word, index + 1);
            }
        }
        int[][] result = new int[lists.size()][2];
        for (int j = 0; j < lists.size(); j++) {
            result[j][0] = lists.get(j)[0];
            result[j][1] = lists.get(j)[1];
        }
        Arrays.sort(result, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return result;
    }
}
