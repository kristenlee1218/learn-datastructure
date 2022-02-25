package com.learn.test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }
    private static boolean isInterested(int i) {
        return i % 2 == 0;
    }
}