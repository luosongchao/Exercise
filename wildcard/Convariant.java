package com.wildcard;

public class Convariant {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();

		try {
			// 运行时的数组机制知道它处理的是Apple[],因此会在向数组中放置异构类型时抛出异常，向上转型在这里不合适
			fruit[0] = new Fruit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			fruit[1] = new Orange();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
