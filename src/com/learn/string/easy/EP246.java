package com.learn.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Kristen
 * @date ：2022/3/17
 * @description :中心对称数是指一个数字在旋转了 180 度之后看起来依旧
 * 相同的数字（或者上下颠倒地看）。请写一个函数来判断该数字是否是中心对
 * 称数，其输入将会以一个字符串的形式来表达数字
 */
public class EP246 {
    public boolean isStrobogrammatic(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (map.get(s.charAt(i)) == null || map.get(s.charAt(j)) == null) {
                return false;
            }
            if (map.get(s.charAt(i)) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
