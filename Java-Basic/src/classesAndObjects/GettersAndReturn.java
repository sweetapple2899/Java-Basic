package classesAndObjects;

public class GettersAndReturn {

	// // Suppose class GettersAndReturn is employee

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}
	
	// Method with return value
	int calculateYearsToRetire() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}

	public static void main(String[] args) {

		GettersAndReturn employee = new GettersAndReturn();
		
		employee.name = "Johnny";
		employee.age = 20;
		
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println();
		
		employee.speak();
		System.out.println();
		
		// Print method with return value
		System.out.println(employee.calculateYearsToRetire()); // output is 45
		System.out.println();
		
		int years = employee.calculateYearsToRetire();
		
		System.out.println("Years till retirement is " + years); // output is "Years till retirement is 45"
		System.out.println();
		
		
	}

}
