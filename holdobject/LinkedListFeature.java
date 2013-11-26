package com.holdobject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFeature {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addAll(Arrays.asList("a", "f", "c", "e", "k"));

		System.out.println(list);

		// 查看元素
		System.out.println("element:" + list.element());
		System.out.println("First:" + list.getFirst());
		System.out.println("first:" + list.peek());

		// 删除元素
		System.out.println("remove:" + list.remove());
		System.out.println("remove2:" + list.poll());

		// 添加元素
		list.add("m");
		list.addLast("z");
		System.out.println(list);

		// 迭代器
		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 双向迭代器
		ListIterator<String> listiter = list.listIterator();
		while (listiter.hasNext()) {
			System.out.println("next:" + listiter.next());
			System.out.println("previous:" + listiter.previous() + "next:"
					+ listiter.next());
		}
	}
}
