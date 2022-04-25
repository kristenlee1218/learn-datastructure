package com.learn.kmp.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次
 * 构成。给定的字符串只含有小写英文字母，并且长度不超过 10000
 *
 * 解析：
 *
 * 为了避免这种无用的环绕，可以创建一个新的字符串 str，它等于原来的字符串 S 再
 * 加上 S 自身，这样其实就包含了所有移动的字符串。
 *
 * 比如字符串：S = acd，那么 str = S + S = acdacd，acd 移动的可能：dac、cda。
 * 其实都包含在了 str 中了。像一个滑动窗口一开始 acd (acd)，移动一次 ac(dac)d，
 * 移动两次 a(cda)cd。循环结束所以可以直接判断 str 中去除首尾元素之后，是否包含
 * 自身元素。如果包含。则表明存在重复子串。
 */
public class EP459 {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
