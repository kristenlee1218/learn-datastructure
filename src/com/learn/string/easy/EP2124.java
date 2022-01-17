package com.learn.string.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :给一个仅由字符 'a' 和 'b' 组成的字符串 s。
 * 如果字符串中每个 'a' 都出现在 每个 'b' 之前，返回 true；
 * 否则，返回 false
 */
public class EP2124 {
    public boolean checkString(String s) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = ch1.clone();
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
