package com.test.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static boolean CompareString(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			return true;
		} else {
			return false;
		}
	}

	public static int sub(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return 0;
		}

	}

}
