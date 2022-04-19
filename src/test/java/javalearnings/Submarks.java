package javalearnings;

import java.util.Scanner;



import org.testng.annotations.Test;

public class Submarks {
	private static Scanner sc;

	@Test
	public void submarks() {
		int totalsub, marks, total = 0;
		float avg, per;
		char grade;
		sc = new Scanner(System.in);
		System.out.println("Enter the No of Sub:");
		totalsub = sc.nextInt();
		System.out.println("Enter the Marks:\n");
		for (int i = 0; i < totalsub; i++) {
			marks = sc.nextInt();
			total = total + marks;
		}
		avg = total / totalsub;
		per = (total / (totalsub * 100)) * 100;

		System.out.println("Total Marks is:" + total);
		System.out.println("Your Average is:" + avg);
		System.out.println("Your Percentage is:" + per);

		// System.out.println("Your Grade is:" +grade);

	}

}