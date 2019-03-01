package controlFlowStatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a command");
		String command = input.nextLine();
		
		switch (command) {
		
		case "start":
			System.out.println("Machine is started");
			break;
			
		case "stop":
			System.out.println("Machine is stopped");
			break;

		default:
			System.out.println("Command not recognized");
			break;
		}

	}

}
