package classesAndObjects;

public class Intro { 
	
	/**
	 * Classes can contain:
	 * 1. Data or Fields or Attributes or Variables
	 * 2. Methods or Subroutines
	 */
	
	// Suppose class Intro is person that has attributes (name and age) and has method (speak)
	
	// Instance variable
	String name;
	int age;
	
	// Method
	void speak() {
		System.out.println("My name is " + name + " and");
		System.out.println("I am " + age + " years old");
	}
	
	void speak2( ) {
		for (int i = 0; i < 2; i++) {
			System.out.println("Hello Everyone");
		}
	}

	public static void main(String[] args) {
		
		Intro person1 = new Intro();
		Intro person2 = new Intro();
		
		person1.name = "Johnny";
		person1.age = 20;
		person2.name = "Smith";
		person2.age = 22;
		
		// Print instance variable
		System.out.println("Person 1 is " + person1.name);
		System.out.println("He is " + person1.age + " years old");
		System.out.println();
		
		// Print method
		person1.speak();
		System.out.println();
		
		person2.speak();
		System.out.println();
		
		person1.speak2();
		
		
	}

}
