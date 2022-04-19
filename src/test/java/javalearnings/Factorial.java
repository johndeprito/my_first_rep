package javalearnings;
import java.util.Scanner;
import org.testng.annotations.Test;

public class Factorial{
	@Test
	public void factorial() {
		int num,fact=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Factroial number");
		num = input.nextInt();
		for(int i=1; i<=num; ++i)
		{
			fact=fact*i;
		}
		System.out.println("fact="+fact);
	}
}