package com.holdobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddElement {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(
				1, 2, 32, 3, 4));

		Integer[] ints = { 32, 42, 51 };
		/* collection.addAll(Arrays.asList(ints)); */

		Collections.addAll(collection, ints);
		System.out.println(collection.toString());

		List<Integer> list = Arrays.asList(ints);
		list.set(2, 12);
		System.out.println(list);

	}
}
