package com.holdobject;

import java.util.Map;

public class Environment {
	public static void main(String[] args) {
		for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
			System.out.println(entry);
		}
	}
}
