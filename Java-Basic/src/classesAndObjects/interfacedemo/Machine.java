/**
 * keyword that is used in interface is 'implements'.
 * since class Machine implements interface Info,
 * class Machine must implements interface Info's method that is showInfo.
 */

package classesAndObjects.interfacedemo;

public class Machine implements Info {
	
	private int id = 8;
	
	public void start() {
		System.out.println("Machine started");
		
	}

	public void showInfo() {
		System.out.printf("Machine id is %d%n", id);
	}

}
