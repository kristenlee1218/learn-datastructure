package com.learn.string.easy;

import java.util.Stack;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串
 * 是否有效。有效字符串需满足：左括号必须用相同类型的右括号闭合。左括号必须以正确的顺序
 * 闭合。注意空字符串可被认为是有效字符串
 */
public class EP20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char preChar = stack.peek();
                if ((preChar == '{' && c == '}') ||
                        (preChar == '(' && c == ')')
                        || (preChar == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
