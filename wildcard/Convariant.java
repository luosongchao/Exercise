package com.wildcard;

public class Convariant {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();

		try {
			// ����ʱ���������֪������������Apple[],��˻����������з����칹����ʱ�׳��쳣������ת�������ﲻ����
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