//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
			int planeSeats = 10;
		
		// 2. Create a variable to hold the cost of groceries at checkout
			double costOfGroceries = 10.00;
		
		// 3. Create a variable to hold a person's middle initial
			char middleInitial = 'L';
	
			
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
			boolean isHot = true;
			
		// 5. Create a variable to hold a customer's first name
			String firstName = "Jason";
		
		// 6. Create a variable to hold a street address
			String address = "902 Wilson Way N";

		// 7. Print all variables to the console
			System.out.println(planeSeats);
			System.out.println(costOfGroceries);
			System.out.println(middleInitial);
			System.out.println(isHot);
			System.out.println(firstName);
			System.out.println(address);
			
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
				System.out.println(planeSeats - 2);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
				double candyBar = 2.15;
				
				costOfGroceries = costOfGroceries + candyBar;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
				char newMiddleInitial = 'K';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
				System.out.println(!isHot);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
				String lastName = "Anderson";
				String fullName = firstName + " " + newMiddleInitial + " " + lastName;
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
				System.out.println("Welcome" + " " + fullName + ", " + "your listed address is:" + " " + address + "\n" + "Is this address correct?");		
		
	}
}