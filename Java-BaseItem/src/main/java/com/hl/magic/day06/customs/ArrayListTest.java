package com.hl.magic.day06.customs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合的创建
 * 集合中存储的元素，只能为<>指定的数据类型元素
 * 且必须是引用数据类型，不能是基本数据类型。
 * Byte、Short、Integer、Long、Float、Double、Character、Boolean
 * 以及String、类、数组、接口
 *
 * @author HL
 * @date 2021/3/23 20:45
 */
public class ArrayListTest {

    @Test
    public void test_add() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaaaaa");
        arrayList.add("aaaaaa");
        System.out.println(arrayList);
    }

    @Test
    public void test_clear() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("bbbbb");
        arrayList.add("bbbbb");
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);
    }

}
