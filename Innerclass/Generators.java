package com.Innerclass;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,
			int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
}
