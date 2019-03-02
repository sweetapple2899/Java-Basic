package arrays;

public class MultiArray2 {

	public static void main(String[] args) {

		int[][] values = {
				{28, 6, 1965},
				{19, 1, 1972},
				{28, 7, 1992},
				{19, 6, 1999},
				{26, 4, 2006}
		};
		
		System.out.println("Day\t" + "Month\t" + "Year");
		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[row].length; col++) {
				System.out.print(values[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
