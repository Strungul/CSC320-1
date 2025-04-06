package cs320;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /* Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines:

Income less than $500: tax rate 10%
Incomes greater than/equal to $500 and less than $1500: tax rate 15%
Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
Incomes greater than/equal to $2500: tax rate 30%*/
		
		/*Pseudocode: 
		 * Get User Salary input
		 * Set Tax bracket variables
		 * Set Tax Rate Variables
		 * calculate tax percentages based on income values
		 * Print requested user information */
		
		//Get user input
		Scanner scanner = new Scanner(System.in);
		int salary = -1;
		while( salary < 0 ) {
			System.out.println("Please enter your weekly pre-tax income (whole numbers only please) and I will let you know how much money will be stolen from you!");
			try {
				salary = scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("I'm afraid my creator was too lazy (he says time pressed) to program me for negative or non-integer values.  Could you re-try that with just the whole dolar amount as a number?");
				scanner.nextLine();
			}
		} //end while loop
		
		//declare earning bracket maximums
		int taxBracketLimit1 = 500;
		int taxBracketLimit2 = 1500;
		int taxBracketLimit3 = 2500;
		
		//declare tax rates
		float taxRate1 = 0.10f;
		float taxRate2 = 0.15f;
		float taxRate3 = 0.20f;
		float taxRate4 = 0.30f;
		
		//tax theft logic
		double taxWithholding;
		float remainingFunds;
		if( salary < taxBracketLimit1 ) {
			taxWithholding = salary * taxRate1;
			
		} else if ( salary >= taxBracketLimit1 && salary < taxBracketLimit2) {	
			taxWithholding = salary * taxRate2;
			
		}else if ( salary >= taxBracketLimit2 && salary < taxBracketLimit3) {
			taxWithholding = salary * taxRate3;
			
		} else {
			taxWithholding = salary * taxRate4;
			
		}
		
		remainingFunds = (float) (salary - taxWithholding);
		//String formattedString = String.format("I regret to inform you that $" + taxWithholding + " has been stolen from your paycheck, leaving you with only $" + remainingFunds + " for the week.");
		String formattedString = String.format("I regret to inform you that $%.2f has been stolen from your paycheck, leaving you with only $%.2f for the week.", taxWithholding, remainingFunds);
		
		System.out.println(formattedString);
	
		
		
	}
		

}
