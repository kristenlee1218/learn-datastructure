package com.learn.lcs.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 小扣打算给自己的 VS code 安装使用插件，
 * 初始状态下带宽每分钟可以完成 1 个插件的下载。假定每分钟选
 * 择以下两种策略之一:
 * 使用当前带宽下载插件
 * 将带宽加倍（下载插件数量随之加倍）
 * 请返回小扣完成下载 n 个插件最少需要多少分钟
 */
public class LCS01 {
    public int leastMinutes(int n) {
        return (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
    }
}
