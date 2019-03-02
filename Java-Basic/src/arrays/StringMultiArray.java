package arrays;

public class StringMultiArray {

	public static void main(String[] args) {

		String[][] text = new String[5][3];
		
		text[0][0] = "Hello";
		text[4][2] = "World";

		for (int row = 0; row < text.length; row++) {
			for (int col = 0; col < text[row].length; col++) {
				System.out.print(text[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
