package com.learn.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 国际摩尔斯密码定义一种标准编码方式，将每个
 * 字母对应于一个由一系列点和短线组成的字符串，比如: "a" 对应
 * ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等
 *
 * 所有 26 个英文字母对应摩尔斯密码表如下：
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",
 * ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
 * "...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + ".-" +
 * "-..." 字符串的结合)。将这样一个连接过程称作单词翻译。返回可以
 * 获得所有词不同单词翻译的数量
 */
public class EP804 {
    public static String[] str = {".-", "-...", "-.-.", "-..",
            ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--",
            "--.."};
    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(str[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
