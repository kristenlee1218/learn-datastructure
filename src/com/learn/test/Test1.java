package com.learn.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        if (s == null || s.length() < 2) {
            return list;
        }
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == '+' && ch[i] == ch[i + 1]) {
                ch[i] = '-';
                ch[i + 1] = '-';
                list.add(new String(ch));
                ch[i] = '+';
                ch[i + 1] = '+';
            }
        }
        return list;
    }
}