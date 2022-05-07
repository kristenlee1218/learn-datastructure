package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2022/5/7
 * @description : 一个正整数 n，交换 n 中奇偶性相同的任意两位数字，
 * 返回交换任意次之后 num 的最大可能值
 */
public class EP2231 {
    public int largestInteger(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if ((ch[i] + ch[j]) % 2 == 0 && ch[j] > ch[i]) {
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }
        }
        return Integer.parseInt(new String(ch));
    }
}
