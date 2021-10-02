package com.learn.math.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :412、写一个程序，输出从 1 到 n 数字的字符串表示。如果 n 是 3 的倍数，
 * 输出 “Fizz”；如果 n 是 5 的倍数，输出 “Buzz”；如果 n 同时是 3 和 5 的倍数，输出 “FizzBuzz”
 */
public class EP412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
