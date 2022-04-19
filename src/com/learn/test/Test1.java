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
    public int numberOfSteps(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }else{
            return n/2+1;
        }
    }
}