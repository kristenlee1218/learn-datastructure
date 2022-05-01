package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/11/22
 * @description : 给定只含 "I"（增大）或 "D"（减小）的字符串 S，
 * 令 N = S.length。返回 [0, 1, ..., N] 的任意排列 A 使得对于
 * 所有 i = 0, ..., N-1，都有：
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 */
public class EP942 {
    public int[] diStringMatch(String s) {
        int low = 0, high = s.length();
        int[] result = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[s.length()] = low;
        return result;
    }
}
