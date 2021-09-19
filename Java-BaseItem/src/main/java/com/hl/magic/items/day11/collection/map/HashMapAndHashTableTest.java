package com.hl.magic.items.day11.collection.map;

import com.hl.magic.items.day11.collection.Person11;
import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

/**
 * 访问List集合元素时，可根据元素的索引来访问
 * 访问Map集合元素时，可根据每项元素的key来访问其value，
 * 访问Set集合中的元素时，只能根据元素本身来访问
 * <p>
 * 集合类就像容器，无非就是添加对象、删除对象、清空容器、判断容器是否为空，集合类九尾这些功能提供了对应的方法。
 * [1]Map集合
 * 常用集合：HashMap集合、LinkedHashMap集合
 * Collection中的集合为单列集合，Map中的集合为双列集合
 * Map中的集合不能存储重复的键Key，但是可以存储重复的value
 * <p>
 * <p>
 * [2]HashMap和HashTable的区别
 * 线程的安全性：
 *      ① HashMap是线程非安全的，
 *      ① HashTable是线程安全的，因为HashTable内部的方法基本都经过synchronized修饰。
 *      如果需要保证线程安全的话就是要ConcurrentHashMap吧
 *
 * 效率：
 *      因为线程安全的问题，HashMap要比HashTable效率高一点。另外，HashTable基本被淘汰，很少在代码中使用。
 *
 * 对Null key和Null value的支持：
 *      ① HashMap允许存储null的key和value，但是null作为键只能有一个，而    null作为值可以有多个。
 *      ① HashTable不允许存储null的key和value，否则会抛空指针异常。
 *
 * 初始容量大小和每次扩充容量大小的不同 ：
 *      ① 创建时如果不指定容量初始值，Hashtable 默认的初始大小为 11，之后每次扩充，容量变为原来的 2n+1。HashMap 默认的初始化大小为 16。之后每次扩充，容量变为原来的 2 倍。
 *      ② 创建时如果给定了容量初始值，那么 Hashtable 会直接使用你给定的大小，而 HashMap 会将其扩充为 2 的幂次方大小（HashMap 中的tableSizeFor()方法保证，下面给出了源代码）。
 *      也就是说 HashMap 总是使用 2 的幂作为哈希表的大小,后面会介绍到为什么是 2 的幂次方。
 *
 * 底层数据结构：
 *      JDK1.8以后的HashMap在解决哈希冲突时有了较大的变化，当链表长度大于阈值（默认为 8）（将链表转换成红黑树前会判断，如果当前数组的长度小于 64，那么会选择先进行数组扩容，而不是转换为红黑树）时，将链表转化为红黑树，以减少搜索时间。Hashtable 没有这样的机制。
 *
 * @author hl
 * @date 2020/3/5
 */


public class HashMapAndHashTableTest {

	@Test
	public void test_HashMap() {
		Map<String, Person11> map = new HashMap<>(16);
		Person11 person = new Person11();
		person.setId(UUID.randomUUID().toString().replace("-", ""));
		person.setAge(10);
		person.setName("小明");
		map.put("personInfo", person);
		// HashMap允许存储null的key和value，但是null作为键只能有一个，而    null作为值可以有多个
		map.put(null, null);
		System.out.println("==========>HashMap：" + map.get("personInfo"));
	}

	@Test
	public void test_HashTable() {
		Hashtable<String, String> hashtable = new Hashtable<>();
		String id = UUID.randomUUID().toString().replace("-", "");

		hashtable.put("id", id);
		hashtable.put("name", "小明");
		// HashTable不允许存储null的key和value，否则会抛空指针异常
		// hashtable.put(null,null);
		System.out.println("==========>HashTable：" + hashtable);
    }
}
