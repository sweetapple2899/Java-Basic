package arrays;

public class CopyingArray {

	public static void main(String[] args) {

		char[] array1 = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd', '!'};
		
		// Copying array
		char[] array2 = new char[5];
		System.arraycopy(array1, 5, array2, 0, 5);
		System.out.println(new String(array2)); // output is world
		System.out.println();
		
		char[] array3 = new char[5];
		System.arraycopy(array1, 0, array3, 0, 5);
		System.out.println(new String(array3));
		System.out.println();
		
		// Manipulating array
		char[] array4 = java.util.Arrays.copyOfRange(array1, 0, 5);
		System.out.println(new String(array4));
	}

}
