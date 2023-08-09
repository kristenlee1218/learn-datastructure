package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 卡车有两个油箱。两个整数 mainTank 表示主油箱中的燃料（以升为单位），additionalTank 表示
 * 副油箱中的燃料（以升为单位）。该卡车每耗费 1 升燃料都可以行驶 10 km。每当主油箱使用了 5 升燃料时，如果副油箱
 * 至少有 1 升燃料，则会将 1 升燃料从副油箱转移到主油箱。返回卡车可以行驶的最大距离
 */
public class EP2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int count = 0;
        while (mainTank >= 5 && additionalTank >= 1) {
            mainTank -= 5;
            mainTank += 1;
            additionalTank -= 1;
            count += 50;
        }
        count += mainTank * 10;
        return count;
    }
}
