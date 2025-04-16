package CSC320;
import java.util.Scanner;


/* Pseudocode 
 * Intake User values 1 through 5 and save to appropriate variables
 * Calculate total of the 5 inputs
 * Calculate Average of 5 inputs
 * Calculate Maximum of 5 inputs
 * Calculate Minimum of 5 inputs
 * Calculate 20% of the total variable
 * ADD REQUIREMENT Display calculated values to users*/
public class Module_4_Critical_Thinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the program.  We will intake 5 values and display the total, Average, Maximum, Minimum and 20% of that value back to you.  ");
		System.out.println("These numbers will be calculated as floats, so there will be some inacturacies for anything over 7 significant digits.");
		System.out.println("There may also be some rounding errors, so don't use this for big financial calculations.");
		
		//set arrays to hold values for instructions and values for user input
		String iteration[] = {"first", "second", "third", "fourth", "fifth"};
		float numbersToCalculate[] = new float [5] ;
		
		//use while loop to intake user values
		int i = 0;
		while(i < 5) {
			System.out.println("Please enter the " + iteration[i] + " number.");
			numbersToCalculate[i] = scnr.nextFloat();
			
			i++;
		}//end while loop
		
		//inform user of what they entered
		System.out.println("You have entered the values:");
		int j = 0;
		while(j < numbersToCalculate.length) {
			System.out.println(numbersToCalculate[j]);
			j++;
			
		}//end while loop
		System.out.println("One moment while I do those calculations");
		
		//calculation for total
		float total = 0;
		for (float number : numbersToCalculate) {
			total += number;
		}//end for loop
		
		//calculation for Average
		float average = total / numbersToCalculate.length;
		
		//calculation for Maximum
		float max = numbersToCalculate[0];
		for (float number : numbersToCalculate) {
			if (number > max) {
				max = number;
			}//end if
		}//end for loop
		
		//calculation for Minimum
		float min = numbersToCalculate[0];
		for (float number : numbersToCalculate) {
			if (number < min) {
				min = number;
			}//end if
		}//end for loop
		
		//calculation for Interest
		float interest = total * .20f;
		
		float grandTotal = total + interest;
		
		//print answers to users
		System.out.println("The total of the values is " + total);
		System.out.println("The average of the values is " + average);
		System.out.println("The maximum of the values is " + max);
		System.out.println("The minimum of the values is " + min);
		System.out.println("The interest at 20% of the total of the values is " + interest);
		System.out.println("The interest plus your initial total is " + grandTotal);
		
		
		
	}//end main

}//end class
