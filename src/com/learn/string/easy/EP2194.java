package com.learn.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/5/3
 * @description : Excel 表中的一个单元格 (r, c) 会以字符串 "<col><row>"
 * 的形式进行表示，其中：
 *
 * <col> 即单元格的列号 c。用英文字母表中的字母标识。
 * 例如，第 1 列用 'A' 表示，第 2 列用 'B' 表示，第 3 列用 'C' 表示。
 * <row> 即单元格的行号 r 。第 r 行就用 整数 r 标识。
 *
 * 一个格式为 "<col1><row1>:<col2><row2>" 的字符串 s，其中 <col1>
 * 表示 c1 列，<row1> 表示 r1 行，<col2> 表示 c2 列，<row2> 表示
 * r2 行，并满足 r1 <= r2 且 c1 <= c2。
 *
 * 找出所有满足 r1 <= x <= r2 且 c1 <= y <= c2 的单元格，并以列表形式返回。
 * 单元格应该按前面描述的格式用字符串表示，并以非递减顺序排列（先按列排，再按行排）
 */
public class EP2194 {
    public List<String> cellsInRange(String s) {
        // 获取列
        char start = s.charAt(0);
        char end = s.charAt(3);
        // 获取行
        char c1 = s.charAt(1);
        char c2 = s.charAt(4);
        List<String> list = new ArrayList<>();
        // 两层循环获取每行每列字符串
        while (start <= end) {
            char i = c1;
            while (i <= c2) {
                list.add(start + "" + i);
                i++;
            }
            start++;
        }
        return list;
    }
}
