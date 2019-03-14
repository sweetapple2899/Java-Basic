/**
 * keyword that is used in interface is 'implements'.
 * since class Person implements interface Info,
 * class Machine must implements interface Info's method that is showInfo.
 */

package classesAndObjects.interfacedemo;

public class Person implements Info {
	
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello there");
	}

	public void showInfo() {
		System.out.printf("His name is %s%n", name);
	}

}
