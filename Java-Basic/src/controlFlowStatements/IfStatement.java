package controlFlowStatements;

public class IfStatement {

	public static void main(String[] args) {

		int x = 98;
		
		if (x > 90) {
			System.out.println("Grade A");
			
		} else if (x > 80) {
			System.out.println("Grade B");
			
		} else if (x > 70) {
			System.out.println("Grade C");
			
		} else if (x > 60) {
			System.out.println("Grade D");
			
		} else {
			System.out.println("Grade E");
			
		}
		
	}

}
