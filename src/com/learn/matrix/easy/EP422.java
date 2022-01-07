package com.learn.matrix.easy;

import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :一个单词序列，判断其是否形成了一个有效的单词方块。
 * 有效的单词方块是指此由单词序列组成的文字方块的第 k 行和第 k 列
 * (0 ≤ k < max(行数, 列数)) 所显示的字符串完全相同
 */
public class EP422 {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).length() > words.size()) {
                    return false;
                }
                if (words.get(j).length() - 1 < i) {
                    return false;
                }
                if (words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
