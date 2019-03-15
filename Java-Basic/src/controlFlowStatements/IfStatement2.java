package controlFlowStatements;

import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input asset value (in million Rp)");
		
		double asset = input.nextDouble();
		
		System.out.println("Please input sales value (in million Rp)");
		
		double sales = input.nextDouble();
		
		if (asset <= 50 && sales <= 300) {
			System.out.println("Type \t\t: Mikro");
			
		} else if ((asset >= 500 && asset <= 5000) || (sales >= 300 && sales <= 2500)) {
			System.out.println("Type \t\t: Small");
		} else {
			System.out.println("Type \t\t: Medium");
		}
		
		System.out.printf("Asset value \t: %,.2f (in million Rp) %n", asset);
		System.out.printf("Sales per year \t: %,.2f (in million Rp) %n", sales);
	}

}