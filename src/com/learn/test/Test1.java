package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public String capitalizeTitle(String title) {
        String[] str = title.toLowerCase().split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] c = str[i].toCharArray();
            if (c.length > 2) {
                c[0] = (char) (c[0] - 32);
                str[i] = new String(c);
            }
        }
        return String.join(" ", str);
    }
}