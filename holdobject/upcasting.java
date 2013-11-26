package com.holdobject;

import java.util.ArrayList;

class Apple {
	private static int id = 0;
	private final int count = id++;

	/*
	 * public String toString() { return "Apple" + Integer.toString(count); }
	 */
}

class Granny extends Apple {

}

class Gala extends Apple {

}

class Fuji extends Apple {

}

public class upcasting {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new Gala());
		apples.add(new Fuji());

		for (Apple c : apples) {
			System.out.println(c);
			System.out.println(Integer.toHexString(c.hashCode()));
		}
	}
}
