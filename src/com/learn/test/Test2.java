package com.learn.test;

import com.learn.binarySearch.easy.VersionControl;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        int mid = left + (right - left) / 2;
        while (left < right) {
            if (isBadVersion(n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

