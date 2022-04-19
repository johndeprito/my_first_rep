package javalearnings;
import java.util.Scanner;
import org.testng.annotations.Test;
public class ATM {
	@Test
public void atm() {
	double Deposit;
	double Withdraw = 0, Option;
	double Balance=10000;
	Scanner inp = new Scanner(System.in);
	System.out.println("Select an option \n 1.Deposit \n 2.Withdraw");
	Option = inp.nextDouble();
	
	if(Option == 1) {
		System.out.println("Enter Your Deposit Amount:");
		Deposit=inp.nextDouble();
		//Deposit = Deposit;
		System.out.println("Deposit Amount is:"+Deposit);
		Balance = Deposit+Balance;
	}
	if(Option == 2){
		System.out.println("Enthe the Withdraw Amount, and your available balance is:"+ Balance);
		Withdraw = inp.nextDouble();
		/*if(Balance>Withdraw) {
			System.out.print("Insufficient balance");
		}*/
	    
		System.out.println("Your Withdraw Amount is:"+Withdraw);
		Balance = Balance - Withdraw; 
	}
	else if(Balance<=Withdraw)
	{
		System.out.println ("You have insufficient");
	}
	
	System.out.println("Your Current Balance is: "+Balance);
	 {
		
	}
}
}
