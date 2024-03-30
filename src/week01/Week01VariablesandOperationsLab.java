//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesandOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availableSeats = 5;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceryCost = 85.67;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'M'; 
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside = true; 
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Harry";
		
		// 6. Create a variable to hold a street address
		int address = 809;
		String street = "WolfStreet";
		String fullAdress = address + street; 

		// 7. Print all variables to the console
		
		System.out.println(availableSeats);
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(hotOutside);
		System.out.println(customerFirstName);
		System.out.println(fullAdress);
		
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		
		availableSeats = availableSeats - 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		groceryCost = groceryCost + 2.15 ; 

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleInitial = 'D' ; 

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

		hotOutside = false; 

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	
		String fullName = customerFirstName +" " + middleInitial + " " + "Styles"; 

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println("Hello my name is " + fullName + ". I live at " +  fullAdress );
		
	}
}