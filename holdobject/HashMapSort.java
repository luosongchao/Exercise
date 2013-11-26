package com.holdobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSort {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("d", 3);
		map.put("c", 1);
		map.put("b", 1);
		map.put("a", 2);

		List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(
				map.entrySet());

		System.out.println("Before Sort....");
		for (int i = 0; i < infoIds.size(); i++) {
			System.out.println(infoIds.get(i).toString());
		}

		System.out.println("\n\nAfter Sort(Key)....");

		Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getKey().toString().compareTo(o2.getKey());
			}
		});

		for (int i = 0; i < infoIds.size(); i++) {
			System.out.println(infoIds.get(i).toString());
		}

		System.out.println("\n\nAfter Sort(Value)....");

		Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getValue() - (o2.getValue());
			}
		});

		for (int i = 0; i < infoIds.size(); i++) {
			System.out.println(infoIds.get(i).toString());
		}
	}
}
