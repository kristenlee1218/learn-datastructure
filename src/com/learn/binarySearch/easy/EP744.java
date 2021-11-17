package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description :一个排序后的字符列表 letters，列表中只包含小写英文字母。
 * 另一个目标字母 target，请寻找在这一有序列表里比目标字母大的最小字母。
 */
public class EP744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int left = 0, right = letters.length - 1;
        char result = ' ';
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                result = letters[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
