package classesAndObjects;

import java.lang.StringBuilder;

public class StringBuilderAndFormatting {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello,");
		sb.append(" ");
		sb.append("my name is Johnny");
		
		System.out.println(sb.toString());
		System.out.println();
		
		// =============Formatting============== 
		
		// Integer
		System.out.printf("Total count is %-10d; quantity is %d", 7, 90);
		System.out.println("\n");
		
		for (int i = 0; i < 15; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		System.out.println();
		
		// String
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: %s\n", i, "here some text");
		}
		System.out.println();
		
		// Floating point
		System.out.printf("Total value %.2f\n", 8.5568);
		System.out.printf("Total value %3.1f", 459.5568438);
	}

}
