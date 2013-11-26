package com.holdobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableClass implements Iterable<String> {

	private List<String> list = new ArrayList<String>(
			Arrays.asList("Low of the juggle!".split("")));

	public Iterator<String> iterator() {
		return new Iterator<String>() {

			private int index = 0;

			public boolean hasNext() {
				return index < list.size();
			}

			public String next() {
				return list.get(index++);
			}

			public void remove() {

			}
		};
	}

	public static void main(String[] args) {
		for (String s : new IterableClass()) {
			System.out.print(s);
		}
		System.out.println();
	}
}
