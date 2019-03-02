package classesAndObjects;

public class StaticAndFinal {

	// Suppose that class StaticAndFinal is Thing that have variable name and
	// description

	/**
	 * Static variable or class variable is belong to class Static method can access
	 * static variable but not instance variable Instance method can access static
	 * variable and instance variable Static can count the number of object
	 */

	public String name;
	public static String description;

	public void showName() {
		System.out.println(name);
		System.out.println(description);
	}

	public static void showInfo() {
		System.out.println("This things are my handmade");
		System.out.println(description);
	}

	public static final int MY_NUMBER = 28; // final is used to make constant variable

	// Count object
	public static int count = 0;
	
	// assigning id in object
	public int id = 0;

	// Constructor will be run every time instance of class is created
	public StaticAndFinal() {
		id = count;
		count++;
	}
	
	public void showId() {
		System.out.println("The id " + name + " is " + id);
	}

	public static void main(String[] args) {

		// Print count before creating object
		System.out.println("Before creating object, count is " + count);

		// Accessing public String name
		StaticAndFinal thing1 = new StaticAndFinal();
		StaticAndFinal thing2 = new StaticAndFinal();

		// Print count after creating object
		System.out.println("After creating object, count is " + count);
		System.out.println();

		thing1.name = "Table";
		thing2.name = "Chair";
		thing1.description = "Table is furniture";

		System.out.println(thing1.name); // output is table
		System.out.println(thing2.name); // output is chair
		thing1.showName();
		System.out.println();

		// Accessing public static String description
		StaticAndFinal.description = "This table and chair are my handmade";

		System.out.println(StaticAndFinal.description);
		System.out.println();

		// Print static method showInfo
		StaticAndFinal.showInfo();
		System.out.println();

		// Print constant variable
		System.out.println(MY_NUMBER);
		System.out.println();
		
		// Print showId
		thing1.showId();
		thing2.showId();

	}

}
