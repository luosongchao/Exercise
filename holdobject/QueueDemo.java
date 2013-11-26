package com.holdobject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Character> queue = new LinkedList<Character>();
		for (char c : "Hello World!".toCharArray()) {
			queue.offer(c);
		}

		Iterator<Character> iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println(queue);
	}
}
