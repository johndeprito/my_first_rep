package javalearnings;

import org.testng.annotations.Test;

public class ReverseSrtring {
	@Test
	public void reverseString() {
		String str = "hello";
		String[] split = str.split("");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i]);
		}
	}
}
