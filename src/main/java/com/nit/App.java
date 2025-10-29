package com.nit;

public class App {
	public static String reverse(String s) {
		for (int i = s.length(); i >= 0; i++) {
			s += s.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "pratikshya";
		String result = reverse(s);
		System.out.println(s);
	}
}
