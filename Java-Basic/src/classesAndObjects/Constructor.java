package classesAndObjects;

public class Constructor {
	
	// Suppose that class Constructor is machine
	
	/**
	 * Class can have more than one constructor
	 * It is differentiate by type and number of argument
	 */
	
	private String name;
	private int code;
	
	public Constructor() {
		System.out.println("Constructor running");
		
		name = "Juno"; // initialize instance variable in constructor
	}
	
	public Constructor(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Constructor(String name, int code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}

	public static void main(String[] args) {
	
		Constructor machine1 = new Constructor();
		System.out.println(machine1.name); // output is Juno
		
		new Constructor();
		System.out.println();
		
		Constructor machine2 = new Constructor("Corta");
		System.out.println();
		
		Constructor machine3 = new Constructor("Stort", 5);
		System.out.println();
		
	}

}
