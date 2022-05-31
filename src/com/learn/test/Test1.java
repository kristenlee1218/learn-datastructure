package com.learn.test;

import java.util.*;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public boolean checkIfExist(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] == 2 * nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}


