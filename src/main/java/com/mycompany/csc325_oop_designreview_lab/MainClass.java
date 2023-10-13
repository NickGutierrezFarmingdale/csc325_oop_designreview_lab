
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {
	public MainClass() {
	}

	public static void main(String[] args) {


		/*
		All 3 constructors have (short) in them because java automatically assumes int, so casting is needed.
		 */
		Student student = new Student("Matt", (short)20, 12); //Create a new instance of student and display it
		System.out.println(student + "\n");


		//Creating instance of Freshman and Senior
		Freshman freshman = new Freshman("James", (short)20, 12);

		Senior senior = new Senior("John", (short)30, 90);

		//Prompt the user to enter a GPA for the freshman and displaying the freshman with the updated GPA.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gpa for Freshman");
		int gpa = sc.nextInt();
		freshman.setGPA(gpa);
		System.out.println(freshman + "\n");

		//Prompt the user to enter a GPA for the senior
		System.out.println("Enter gpa for Senior");

		//Infinitely loop until the entered GPA value is >= 85, since seniors cant have lower
		while(true) {
			//Check to see if the user input isn't a number
			while(!sc.hasNextInt()) {
				System.out.println("Invalid input, please enter a number");
				sc.next();
			}

			gpa = sc.nextInt(); //set GPA equal to the inputted integer and make sure it's 85 or higher
			if (gpa >= 85) {
				senior.setGPA(gpa);
				System.out.println(senior);
				return; //Break out of the loop after updating senior with a proper GPA value
			}

			System.out.println("Seniors must have a minimum of 85 credits, please enter a new value");
		}
	}
}
