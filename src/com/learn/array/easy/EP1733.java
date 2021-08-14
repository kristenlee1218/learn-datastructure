package com.learn.array.easy;

import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个数组 items ，其中 items[i] = [typei, colori, namei]，描述第 i 件物品的类型、
 * 颜色以及名称。另给一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则匹配：
 * ruleKey == "type" 且 ruleValue == typei
 * ruleKey == "color" 且 ruleValue == colori
 * ruleKey == "name" 且 ruleValue == namei
 * 统计并返回匹配检索规则的物品数量
 */
public class EP1733 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
