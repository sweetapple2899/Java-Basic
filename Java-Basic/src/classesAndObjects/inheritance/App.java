/**
 * In this inheritance package, there are three class:
 * - class App
 * - class Machine
 * - class Car that extends class Machine
 */

package classesAndObjects.inheritance;

public class App {

	public static void main(String[] args) {
		
		// instantiate class Machine
		Machine mach1 = new Machine();
		
		// call method from class Machine
		mach1.stop();
		mach1.start();
		System.out.println();
		
		// instantiate class Car
		Car car1 = new Car();
		
		/**
		 * Since class Car is inherited from class Machine,
		 * class Car has method start and stop that is Machine's method.
		 * class Car also have own method that is 'move'
		 */
		car1.start(); 
		car1.stop(); // // overide Machine's stop method
		car1.move();
		System.out.println();
		
		// accessing Machine's variabel
		car1.showInfo();
		
		
		
	}

}
