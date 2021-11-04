package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :
 */
public class EP506_1 {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        int[] clone = Arrays.copyOf(score, score.length);
        Arrays.sort(clone);
        for (int i = 0; i < score.length; i++) {
            int rank = score.length - Arrays.binarySearch(clone, score[i]);
            if (rank == 1) {
                str[i] = "Gold Medal";
            } else if (rank == 2) {
                str[i] = "Silver Medal";
            } else if (rank == 3) {
                str[i] = "Bronze Medal";
            } else {
                str[i] = Integer.toString(rank);
            }
        }
        return str;
    }
}
