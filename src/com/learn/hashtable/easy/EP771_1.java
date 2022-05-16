package com.learn.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description : 一个字符串 jewels 代表石头中宝石的类型，另有一个
 * 字符串 stones 代表拥有的石头。stones 中每个字符代表了一种拥有的
 * 石头的类型，想知道拥有的石头中有多少是宝石。字母区分大小写，因此
 * "a" 和 "A" 是不同类型的石头
 */
public class EP771_1 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
