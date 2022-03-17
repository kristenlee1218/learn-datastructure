package com.learn.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/11
 * @description :一个叫做「翻转游戏」的游戏。游戏规则如下：一个字符串 s，其中只含
 * '+' 和 '-' 。轮流将连续的两个 "++" 反转成 "--" 。当一方无法进行有效的翻转时便
 * 意味着游戏结束，则另一方获胜、计算并返回一次有效操作后，字符串 s 所有的可能状态，
 * 返回结果可以按任意顺序排列。如果不存在可能的有效操作，请返回一个空列表
 */
public class EP293 {
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
