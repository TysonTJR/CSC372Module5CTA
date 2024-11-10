package csc372module5cta;

import java.util.Scanner;



public class UserInput {
	private Scanner scnr = new Scanner(System.in);
	private int firstUserInput;
	private int secondUserInput;
	private int thirdUserInput;
	private int fourthUserInput;
	private int fifthUserInput;

	public UserInput() {
		System.out.println("Please enter the first number: ");
		firstUserInput = scnr.nextInt();
		
		System.out.println("");

		System.out.println("Please enter the second number: ");
		
		secondUserInput = scnr.nextInt();
		System.out.println("");


		System.out.println("Please enter the third number: ");
		
		thirdUserInput = scnr.nextInt();
		System.out.println("");


		System.out.println("Please enter the fourth number: ");
		
		fourthUserInput = scnr.nextInt();
		System.out.println("");


		System.out.println("Please enter the fifth number: ");
		

		fifthUserInput = scnr.nextInt();

	}
	
	public int getFirstUserNum() {
		return this.firstUserInput;
		
	}
	
	public int getSecondUserNum() {
		return this.secondUserInput;
		
	}
	
	public int getThirdUserNum() {
		return this.thirdUserInput;
		
	
	}
	
	public int getFourthUserNum() {
		return this.fourthUserInput;
	}
	
	public int getFifthUserNum() {
		return this.fifthUserInput;
	}
	}
