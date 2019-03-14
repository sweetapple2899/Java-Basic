// the output from this class App2 is the same as class App

package classesAndObjects.interfacedemo;

public class App2 {
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		Person person1 = new Person("Jason");
		
		outputInfo(mach1);
		outputInfo(person1);
	}

}
