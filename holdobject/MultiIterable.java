package com.holdobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterable<T> implements Iterable<T> {
	private List<T> list;

	public MultiIterable(Collection<T> collect) {
		list = new ArrayList<T>(collect);
	}

	/**
	 * 实现Iterable<T>中迭代器
	 */
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int index = 0;

			public boolean hasNext() {
				return index < list.size();
			}

			public T next() {
				return list.get(index++);
			}

			public void remove() {

			}

		};
	}

	/**
	 * 返回逆序的迭代器
	 * 
	 * @return
	 */
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					private int index = list.size();

					public boolean hasNext() {
						return index > 0;
					}

					public T next() {
						return list.get(--index);
					}

					public void remove() {

					}
				};
			}
		};
	}

	/**
	 * 随机顺序的迭代器
	 * 
	 * @return
	 */
	public Iterable<T> randomized() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					private int index = 0;
					private Random random = new Random();

					public boolean hasNext() {
						return index < list.size();
					}

					public T next() {
						index++;
						return list.get(random.nextInt(list.size()));
					}

					public void remove() {

					}
				};
			}

		};
	}

	/**
	 * 使用shuffle方法生成的迭代器
	 * 
	 * @return
	 */
	public Iterable<T> randomized2() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				List<T> randomlist = new ArrayList<T>(list);
				Collections.shuffle(randomlist, new Random(12));
				return randomlist.iterator();
			}
		};
	}

	public static void main(String[] args) {
		MultiIterable<String> multiIter = new MultiIterable<String>(
				new ArrayList<>(Arrays.asList("Low of the juggle!".split(" "))));

		for (String s : multiIter) {
			System.out.print(s + " ");
		}
		System.out.println("===========original==============");

		for (String s : multiIter.reversed()) {
			System.out.print(s + " ");
		}
		System.out.println("===========reversed==============");

		for (String s : multiIter.randomized()) {
			System.out.print(s + " ");
		}
		System.out.println("===========randomized==============");

		for (String s : multiIter.randomized2()) {
			System.out.print(s + " ");
		}
		System.out.println("===========randomized2==============");

		for (String s : multiIter) {
			System.out.print(s + " ");
		}
		System.out.println("===========original==============");
	}
}
