package com.learn.lcs.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 有 N 位扣友参加了微软与力扣举办了「以扣会友」
 * 线下活动。主办方提供了 2*N 道题目，整型数组 questions 中每个
 * 数字对应了每道题目所涉及的知识点类型。若每位扣友选择不同的一题，
 * 请返回被选的 N 道题目至少包含多少种知识点类型
 */
public class LCS02 {
    public int halfQuestions(int[] questions) {
        int[] nums = new int[1001];
        for (int index : questions) {
            nums[index]++;
        }
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        int i = nums.length - 1;
        while (i >= 0) {
            sum += nums[i];
            count++;
            if (sum * 2 >= questions.length) {
                return count;
            }
            i--;
        }
        return count;
    }
}
