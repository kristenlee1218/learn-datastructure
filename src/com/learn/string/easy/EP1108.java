package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个有效的 IPv4 地址 address，返回这个 IP 地址的无效
 * 化版本。所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."
 */
public class EP1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
