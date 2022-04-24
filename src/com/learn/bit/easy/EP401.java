package com.learn.bit.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/30
 * @description : 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表
 * 分钟（0-59）。每个 LED 代表一个 0 或 1，最低位在右侧、一个整数 turnedOn，表示当
 * 前亮着的 LED 的数量，返回二进制手表可以表示的所有可能时间。可以按任意顺序返回答案
 */
public class EP401 {
    public List<String> readBinaryWatch(int n) {
        List<String> list = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == n) {
                    list.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return list;
    }
}
