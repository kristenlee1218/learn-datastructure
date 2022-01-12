package com.learn.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description :一个字符串 jewels 代表石头中宝石的类型，另有一个字符串
 * stones 代表拥有的石头。stones 中每个字符代表了一种拥有的石头的类型，
 * 想知道拥有的石头中有多少是宝石。字母区分大小写，因此 "a" 和 "A" 是
 * 不同类型的石头
 */
public class EP771_1 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> jewelsSet = new HashSet<Character>();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            jewelsSet.add(jewel);
        }
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            if (jewelsSet.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}
