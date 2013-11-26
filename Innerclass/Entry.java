package com.Innerclass;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Entry {
	public static void main(String[] args) {
		Random random = new Random(47);
		List<Customer> line = new LinkedList<Customer>();
		/*
		 * for (int i = 0; i < 10; i++) { line.add(Customer.generator().next());
		 * }
		 */
		Generators.fill(line, Customer.generator(), 15);

		for (int i = 0; i < line.size(); i++) {
			System.out.println(line.get(i));
		}

		byte val = (byte)30;
		System.out.println("Byte Öµ£º" + val);
	}
}
