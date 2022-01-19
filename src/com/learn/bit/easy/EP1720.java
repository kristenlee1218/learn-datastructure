package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :未知整数数组 arr 由 n 个非负整数组成。经编码后变
 * 为长度为 n - 1 的另一个整数数组 encoded，其中 encoded[i] =
 * arr[i] XOR arr[i + 1]。例如，arr = [1,0,2,1] 经编码后得到
 * encoded = [1,2,3]。给你编码后的数组 encoded 和原数组 arr 的
 * 第一个元素 first（arr[0]）。请解码返回原数组 arr。可以证明答案
 * 存在并且是唯一的
 */
public class EP1720 {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i < encoded.length + 1; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }
}
