package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description : 一些糖果 candies，打算把它们分给排好队的 n = people 个小朋
 * 友。给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，直到给最后一个小朋友 n 颗糖果。
 * 然后再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，直
 * 到给最后一个小朋友 2 * n 颗糖果。重复上述过程（每次都比上一次多给出一颗糖果，
 * 当到达队伍终点后再次从队伍起点开始），直到分完所有的糖果。注意，就算手中的剩下
 * 糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。返回一
 * 个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况
 */
public class EP1103 {
    public int[] distributeCandies(int candies, int people) {
        int[] result = new int[people];
        int index = 1;
        while (candies > 0) {
            for (int i = 0; i < people && candies > 0; i++) {
                result[i] += Math.min(candies, index);
                candies -= index;
                index++;
            }
        }
        return result;
    }
}
