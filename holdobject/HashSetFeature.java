package com.holdobject;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSetFeature {
	public static void main(String[] args) {

		// HashSet使用
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			Integer val = random.nextInt(30);
			set.add(val);
		}
		System.out.println(set);

		// TreeSet使用
		Set<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 0; i < 1000; i++) {
			treeSet.add(random.nextInt(30));
		}
		System.out.println(treeSet);

		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(words, "abc", "dscwq", "abcd", "Abcd", "ABCD",
				"abc", "abcd", "BCD");
		System.out.println(words);

		// HashSet操作
		Collections.addAll(set, 21, 22, 43, 25, 56);
		System.out.println(set.contains(21));
		System.out.println(set);
		System.out.println(treeSet.containsAll(set));

	}
}
