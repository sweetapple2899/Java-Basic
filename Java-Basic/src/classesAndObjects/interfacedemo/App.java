/**
 * In this interface package, there are three class:
 * - class App
 * - class Machine
 * - class Person
 * - interface Info 
 */

package classesAndObjects.interfacedemo;

public class App {

	public static void main(String[] args) {
		
		// instantiating from class Machine
		Machine mach1 = new Machine();
		
		// accessing Machine's method
		mach1.start(); // output is 'Machine started'
		
		// instantiating from class Person
		Person person1 = new Person("Jason");
		
		// accessing Person's method
		person1.greet(); // output is 'Hello there'
		
		System.out.println();
		
		// accessing method interface Info through class Machine
		Info info1 = new Machine();
		info1.showInfo();
		
		
		Info info2 = person1;
		info2.showInfo();
		
	}

}
