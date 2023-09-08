package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2023/9/5
 * @description : 笔记本键盘存在故障，每当在上面输入字符 'i' 时，它会反转你所写的字符串。
 * 而输入其他字符则可以正常工作。给一个下标从 0 开始的字符串 s，请用故障键盘依次输入每个字
 * 符。返回最终笔记本屏幕上输出的字符串。
 */
public class EP2810 {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('i' == c) {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
