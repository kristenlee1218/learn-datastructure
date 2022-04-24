package com.learn.basic.search;

/**
 * @author ：Kristen
 * @date ：2022/4/24
 * @description : 哈希查找（Hash Search）
 *
 * a、哈希表
 * 使用一个下标范围比较大的数组来存储元素。可以设计一个函数（哈希函数，
 * 也叫做散列函数），使得每个元素的关键字都与一个函数值（即数组下标）
 * 相对应，于是用这个数组单元来存储这个元素；也可以简单的理解为，按照
 * 关键字为每一个元素 “分类”，然后将这个元素存储在相应 “类” 所对应的
 * 地方。但是，不能够保证每个元素的关键字与函数值是一一对应的，因此极
 * 有可能出现对于不同的元素，却计算出了相同的函数值，这样就产生了冲突，
 * 就是把不同的元素分在了相同的 “类” 之中
 *
 * b、哈希函数
 * 通过某种转换关系，使关键字适度的分散到指定大小的的顺序结构中，越分散
 * 则以后查找的时间复杂度越小，空间复杂度越高
 *
 * c、算法思路
 * 如果所有的键都是整数，那么就可以使用一个简单的无序数组来实现、将键作
 * 为索引，值即为其对应的值，这样就可以快速访问任意键的值。这是对于简单
 * 的键的情况，将其扩展到可以处理更加复杂的类型的键
 *
 * ①、用给定的哈希函数构造哈希表
 * ②、根据选择的冲突处理方法（拉链法和线性探测法）解决地址冲突
 * ③、在哈希表的基础上执行哈希查找
 */
public class HashSearch {
    public static int searchHash(int[] hash, int hashLength, int key) {
        // 哈希函数
        int hashAddress = key % hashLength;

        // 指定 hashAdrress 对应值存在但不是关键值，则用开放寻址法解决
        while (hash[hashAddress] != 0 && hash[hashAddress] != key) {
            hashAddress = (++hashAddress) % hashLength;
        }

        // 查找到了开放单元，表示查找失败
        if (hash[hashAddress] == 0) {
            return -1;
        }
        return hashAddress;
    }

    public static void insertHash(int[] hash, int hashLength, int data) {
        // 哈希函数
        int hashAddress = data % hashLength;

        // 若是 key 存在，则说明已经被别人占用，此时必须解决冲突
        while (hash[hashAddress] != 0) {
            // 用开放寻址法找到
            hashAddress = (++hashAddress) % hashLength;
        }

        // 将 data 存入字典中
        hash[hashAddress] = data;
    }
}
