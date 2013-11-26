package com.wildcard;

public class GenericAndConvariance {
	public static void main(String[] args) {
		Holder<Apple> apple = new Holder<Apple>(new Apple());
		Apple a = apple.get();
		apple.set(a);

		Holder<? extends Fruit> fruit = apple;
		Apple d = (Apple) fruit.get();
		try {
			Orange c = (Orange) fruit.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Holder<T> {
	private T val;

	public Holder() {
	}

	public Holder(T val) {
		this.val = val;
	}

	public void set(T val) {
		this.val = val;
	}

	public T get() {
		return val;
	}

	public boolean equals(Object obj) {
		return val.equals(obj);
	}
}
