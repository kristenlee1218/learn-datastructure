package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/11/22
 * @description :矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1)为左下
 * 角的坐标，(x2, y2) 是右上角的坐标。矩形的上下边平行于 x 轴，左右边平行于 y 轴。
 * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成
 * 重叠。给出两个矩形 rec1 和 rec2。如果它们重叠，返回 true；否则返回 false
 */
public class EP836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
                rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            return false;
        }
        return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] ||
                rec1[0] >= rec2[2] || rec1[1] >= rec2[3]);
    }
}
