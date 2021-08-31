package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :想要给孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
 * 并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，可以将这个饼干 j 分配给孩子 i ，
 * 这个孩子会得到满足。目标是尽可能满足越多数量的孩子，并输出这个最大数值
 */
public class EP455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
                count++;
            }
        }
        return count;
    }
}
