package com.learn.test;

import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.get(i).length(); j++) {
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

