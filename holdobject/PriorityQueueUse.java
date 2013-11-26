package com.holdobject;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * PriorityQueue可以确保当你调用peek()/poll()/remove()、方法时 获取的元素将是队列中优先级最高的元素
 * 
 * @author Administrator
 * 
 */
public class PriorityQueueUse {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 23, 3, 41, 43, 56, 24, 3, 45);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(list);
		PriorityQueueUse.Print(queue);

		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			queue.offer(random.nextInt(10));
		}
		PriorityQueueUse.Print(queue);

		// String的优先级队列
		String fact = "Low of the juggle";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(
				strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);

		System.out.println(stringPQ);
		PriorityQueueUse.Print(stringPQ);

		// Character优先级队列
		Set<Character> chars = new HashSet<Character>();
		for (char c : fact.toCharArray()) {
			chars.add(c);
		}
		PriorityQueue<Character> charPQ = new PriorityQueue<Character>();
		charPQ.addAll(chars);
		PriorityQueueUse.Print(charPQ);
	}

	// 泛型方法
	public static <T> void Print(PriorityQueue<T> queue) {
		// 输出优先级最高的元素
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	
}
