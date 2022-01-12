package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description :一个字符串 jewels 代表石头中宝石的类型，另有一个字符串
 * stones 代表拥有的石头。stones 中每个字符代表了一种拥有的石头的类型，
 * 想知道拥有的石头中有多少是宝石。字母区分大小写，因此 "a" 和 "A" 是
 * 不同类型的石头
 */
public class EP771 {
    public int numJewelsInStones(String jewels, String stones) {
        char[] ch = jewels.toCharArray();
        int count = 0;
        char[] charStone = stones.toCharArray();
        for (char c : ch) {
            for (char value : charStone) {
                if (c == value) {
                    count++;
                }
            }
        }
        return count;
    }
}
