package controlFlowStatements;

import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input asset value (in million Rp)");
		
		double asset = input.nextDouble();
		
		System.out.println("Please input sales value (in million Rp)");

		double sales = input.nextDouble();
		
		System.out.printf("Asset value without land & building \t: %,.2f (in million Rp) %n", asset);
		System.out.printf("Sales per year \t\t\t\t: %,.2f (in million Rp) %n", sales);

		if ((asset <= 50) && (sales <= 300)) {
			System.out.println("Type \t\t\t\t\t: Mikro Company");
			
		} else if ((asset <= 500) && (sales <= 2500)) {
			System.out.println("Type \t\t\t\t\t: Small Company");
			
		} else if ((asset <= 10000) && (sales <= 50000)) {
			System.out.println("Type \t\t\t\t\t: Medium Company");
			
		} else {
			System.out.println("Type \t\t\t\t\t: Big Company");
		}
		
	}

}