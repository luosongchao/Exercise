package com.holdobject;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapUse {
	public static void main(String[] args) {
		/**
		 * 使用Map计算随机生成的数出现的个数
		 */
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int key = random.nextInt(10);
			Integer value = map.get(key);
			map.put(key, value == null ? 1 : value + 1);
		}

		System.out.println(map);
	}
}
