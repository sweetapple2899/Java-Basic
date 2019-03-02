package classesAndObjects;

public class MethodParameters {
	
	// Suppose class MethodParameters is person that has has method (speak jump and move)
	
	
	public void speak(String text) { // passing parameter into method
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("I am jumping " + height + " meter");
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving to " + direction + " within " + distance + " meters");
	}

	public static void main(String[] args) {

		MethodParameters person1 = new MethodParameters();
		
		person1.speak("Hello I am johnny"); // "Hello I am johnny" is String parameter of speak method
		person1.speak("Nice to meet you");
		System.out.println();
		
		person1.jump(1);
		System.out.println();
		
		person1.move("North", 10);
		System.out.println();
				
		String greeting = "Hi there";
		int value = 14;
		
		person1.speak(greeting);
		person1.jump(value);
	}

}
