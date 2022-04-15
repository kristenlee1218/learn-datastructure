package com.learn.test;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0] - points[1][0];
        int y1 = points[0][1] - points[1][1];
        int x2 = points[0][0] - points[2][0];
        int y2 = points[0][1] - points[2][1];
        return x1 * y2 != x2 * y1;
    }
}