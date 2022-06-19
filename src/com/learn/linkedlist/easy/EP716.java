package com.learn.linkedlist.easy;

import java.util.Stack;

/**
 * @author : Kristen
 * @date : 2022/6/19
 * @description : 设计一个最大栈数据结构，既支持栈操作，又支持查找栈中最大元素
 */
public class EP716 {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public EP716() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        maxStack.push(Math.max(max, x));
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack<>();
        while (top() != max) {
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return max;
    }
}
