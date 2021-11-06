package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :RGB 颜色 "#AABBCC" 可以简写成 "#ABC" 、例如，"#15c"
 * 其实是 "#1155cc" 的简写。现在，假如我们分别定义两个颜色 "#ABCDEF"
 * 和 "#UVWXYZ"，则他们的相似度可以通过这个表达式
 * -(AB - UV)^2 - (CD - WX)^2 - (EF - YZ)^2 来计算。
 * 那么给你一个按 "#ABCDEF" 形式定义的字符串 color 表示 RGB 颜色，
 * 请你以字符串形式，返回一个与它相似度最大且可以简写的颜色。
 * （比如，可以表示成类似 "#XYZ" 的形式）
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
