package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :
 */
public class EP800 {
    public String similarRGB(String color) {
        return "#" + fun(color.substring(1, 3)) +
                fun(color.substring(3, 5)) + fun(color.substring(5));
    }
    public String fun(String comp) {
        int q = Integer.parseInt(comp, 16);
        q = q / 17 + (q % 17 > 8 ? 1 : 0);
        return String.format("%02x", 17 * q);
    }
}
