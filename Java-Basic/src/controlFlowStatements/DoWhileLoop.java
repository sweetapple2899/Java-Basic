package controlFlowStatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int password = 0;

		do {
			System.out.println("Please enter your password number:");
			password = input.nextInt();
		}

		while (password != 1234);
		System.out.println("Thank you");

	}

}
