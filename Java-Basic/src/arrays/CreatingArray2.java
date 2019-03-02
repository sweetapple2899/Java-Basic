package arrays;

public class CreatingArray2 {

	public static void main(String[] args) {
		
		int[] values = { 28, 19, 28, 19, 26 };

		// print third element
		System.out.println("The third element is " + values[2]);
		System.out.println();

		// print index
		System.out.println("Index:");
		for (int i = 0; i < values.length; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// print element
		System.out.println("Element:");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println();

		// print element
		System.out.println("Element:");
		for (int i : values) {
			System.out.println(i);
		}
		System.out.println();

		// Modify
		System.out.println("Index\t" + "Element");
		for (int i = 0; i < values.length; i++) {
			int j = values[i];
			System.out.println(i + "\t" + j);

		}	

	}

}
