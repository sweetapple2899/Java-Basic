package arrays;

public class MultiArray1 {

	public static void main(String[] args) {
		
		int[][] values;
		
		values = new int[5][3];
		
		values[0][0] = 28;
		values[1][0] = 19;
		values[2][0] = 28;
		values[3][0] = 19;
		values[4][0] = 28;
		
		values[0][1] = 6;
		values[1][1] = 1;
		values[2][1] = 7;
		values[3][1] = 6;
		values[4][1] = 4;
		
		values[0][2] = 1965;
		values[1][2] = 1972;
		values[2][2] = 1992;
		values[3][2] = 1999;
		values[4][2] = 2006;
		
		System.out.println("Day\t" + "Month\t" + "Year\t");
		
		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[row].length; col++) {
				System.out.print(values[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
