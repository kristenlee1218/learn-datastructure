package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0, j = 0; i < a.length() - 1 || j < b.length() - 1; i++, j++) {
            int sum = count;
            sum += i > 0 ? (a.charAt(i) - '0') : 0;
            sum += j > 0 ? (b.charAt(j) - '0') : 0;
            sb.append(sum % 2);
            count = sum / 2;
        }
        sb.append(count == 1 ? count : "");
        return sb.reverse().toString();
    }
}

