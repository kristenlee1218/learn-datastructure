package com.learn.string.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个整数数组 nums ，数组中的元素互不相同。返回该数组
 * 所有可能的子集（幂集）、解集不能包含重复的子集。可以按任意顺序返回解集
 */
public class EP78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int num : nums) {
            for (int j = 0; j < list.size(); j++) {
                List<Integer> subList = new ArrayList<>(list.get(j));
                subList.add(num);
                list.add(subList);
            }
        }
        return list;
    }
}
