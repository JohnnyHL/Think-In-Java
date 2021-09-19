package com.hl.magic.items.day11.collection.list;

import org.junit.Test;

import java.util.*;

/**
 * 数组列表
 * ArrayList集合存储结构：数组结构
 * 使用较多：查询数据、遍历数据，线程不安全，元素增删慢，查询快。
 *
 * @author hl
 * @date 2020/3/30 15:12
 */
public class ArrayListBaseTest {

	/**
	 * 要分配的最大数组的长度
	 */
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	@Test
	public void run1() {
		ArrayList<String> arrayList = new ArrayList<>();
		//将元素添加在指定位置索引上
		arrayList.add(0, "array");
		arrayList.add(1, "array1");
		arrayList.add(2, "array2");
		System.out.println(arrayList);

		//获取指定元素第一次出现的位置索引
		int indexOf = arrayList.indexOf("array1");
		System.out.println(indexOf);

		//设置指定位置索引的元素
		String new123 = arrayList.set(0, "new123");
		System.out.println(new123);
		System.out.println(arrayList);
	}

	@Test
	public void run2() {
		System.out.println("数组最大长度：" + MAX_ARRAY_SIZE);
	}

	/**
	 * 测试ArrayList扩容机制
	 */
	@Test
	public void run3() {
		ArrayList arrayList = new ArrayList();
		//将元素添加在指定位置索引上
		arrayList.add("A0");
		arrayList.add("A1");
		arrayList.add("A2");
		arrayList.add("A3");
		arrayList.add("A4");
		arrayList.add("A5");
		arrayList.add("A6");
		arrayList.add("A7");
		arrayList.add("A8");
		arrayList.add("A9");
		arrayList.add("A10");

		arrayList.get(0);
	}

	@Test
	public void run4() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(-1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(-5);
		arrayList.add(7);
		arrayList.add(4);
		arrayList.add(-9);
		arrayList.add(-7);
		System.out.println("原始数组:" + arrayList);
		// void reverse(List list)：反转
		Collections.reverse(arrayList);
		System.out.println("反转数组：" + arrayList);

		// void sort(List list),按自然排序的升序排序
		Collections.sort(arrayList);
		System.out.println("数组升序排列：" + arrayList);

		// 定制排序的用法
		Collections.sort(arrayList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("定制排序后：" + arrayList);
	}

	@Test
	public void run5() {
		int[] a = new int[4];
		a[0] = 0;
		a[1] = 1;
		System.arraycopy(a, 0, a, 1, 3);
		// a[2]=99;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		List<Object> linkedList = Collections.synchronizedList(new LinkedList<>());
	}
}
