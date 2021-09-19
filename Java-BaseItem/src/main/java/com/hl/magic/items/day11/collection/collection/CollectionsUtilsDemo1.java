package com.hl.magic.items.day11.collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections常用工具类
 * 【1】排序操作
 * void reverse(List list)//反转
 * void shuffle(List list)//随机排序
 * void sort(List list)//按自然排序的升序排序
 * void sort(List list, Comparator c)//定制排序，由Comparator控制排序逻辑
 * void swap(List list, int i , int j)//交换两个索引位置的元素
 * void rotate(List list, int distance)//旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面
 *
 * @Author HL
 * @Date 2021/8/19 22:44
 */
public class CollectionsUtilsDemo1 {

    private static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    static {
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组:" + arrayList);
    }

    public static void main(String[] args) {
        Collections.reverse(arrayList);
        System.out.println("反转数组：" + arrayList);

        Collections.shuffle(arrayList);
        System.out.println("随机排序数组：" + arrayList);

        Collections.sort(arrayList);
        System.out.println("按自然排序的升序排列数组：" + arrayList);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序数组：" + arrayList);

        Collections.swap(arrayList, 1, 2);
        System.out.println("交换两个索引位置的元素：" + arrayList);

        Collections.rotate(arrayList, 2);
        // 旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面
        System.out.println("旋转数组：" + arrayList);
    }
}
