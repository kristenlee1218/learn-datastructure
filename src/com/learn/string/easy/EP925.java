package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入
 * 字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。你将会检查
 * 键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符
 * 可能被长按），那么就返回 True
 */
public class EP925 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
