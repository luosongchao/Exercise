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
 * PriorityQueue����ȷ���������peek()/poll()/remove()������ʱ ��ȡ��Ԫ�ؽ��Ƕ��������ȼ���ߵ�Ԫ��
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

		// String�����ȼ�����
		String fact = "Low of the juggle";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(
				strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);

		System.out.println(stringPQ);
		PriorityQueueUse.Print(stringPQ);

		// Character���ȼ�����
		Set<Character> chars = new HashSet<Character>();
		for (char c : fact.toCharArray()) {
			chars.add(c);
		}
		PriorityQueue<Character> charPQ = new PriorityQueue<Character>();
		charPQ.addAll(chars);
		PriorityQueueUse.Print(charPQ);
	}

	// ���ͷ���
	public static <T> void Print(PriorityQueue<T> queue) {
		// ������ȼ���ߵ�Ԫ��
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	
}