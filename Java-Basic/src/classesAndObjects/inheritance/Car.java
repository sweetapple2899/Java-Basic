package classesAndObjects.inheritance;

/**
 * class Car is inherited from class Machine
 * keyword 'extends' is used to inherit from other class
 */
public class Car extends Machine{
	
	public void move() {
		System.out.println("Car is moving");	
	
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
		System.out.printf("%s %s", "The color is : ", color);
	}

}
