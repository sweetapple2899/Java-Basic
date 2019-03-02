package classesAndObjects;

public class MethodPublicAndStatic {
	
	// Suppose class MethodPublicAndStatic is person that has has method (speak)
	
	/**
	 * Public method can be accessed by object
	 * Static method can be accessed without object
	 */
	
	// Public method
	public void speak() {
		System.out.println("Public method can be accessed by object");
	}
	
	static void speak2() {
		System.out.println("Static method can be accessed without object");
	}

	public static void main(String[] args) {
		
		// Calling public method must create object
		MethodPublicAndStatic person1 = new MethodPublicAndStatic();
		
		person1.speak();
		System.out.println();
		
		speak2();

	}

}
