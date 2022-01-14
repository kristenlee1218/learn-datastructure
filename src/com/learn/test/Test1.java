package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = a.length() - 1, j = b.length() - 1;
             i >= 0 || j >= 0; i--, j--) {
            int sum = count;
            sum += i >= 0 ? (a.charAt(i) - '0') : 0;
            sum += j >= 0 ? (b.charAt(i) - '0') : 0;
            sb.append(sum % 2);
            count = sum / 2;
        }
        sb.append(count == 1 ? count : "");
        return sb.reverse().toString();
    }
}