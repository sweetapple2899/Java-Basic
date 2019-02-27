package controlFlowStatements;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = input.nextLine();
		
		System.out.println("Now, please enter your pass number");
		
		int passNumber = input.nextInt();
		
		System.out.println("Please confirm your pass number");
		
		int confPassNumber = input.nextInt();
		
		while (confPassNumber != passNumber) {
			System.out.println("Please try again");
			confPassNumber = input.nextInt();
			
			if (confPassNumber == passNumber) {
				System.out.println("Ok.. your data have been added. Thank you");
				break;
			}
		}
		
	}

}
