package classesAndObjects;

public class SettersAndThis { 
	
	// Suppose class SettersAndThis  is person that has variable name and age
	
	// instance variable name and age
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name; // "this.name" refer to instance variable name
	}
	
	public void setAge(int age) {
		this.age = age; // "this.age" refer to instance variable age
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}	
	
	public static void main(String[] args) {
		
		SettersAndThis person1 = new SettersAndThis();
		SettersAndThis person2 = new SettersAndThis();
		
		// setName setAge and setInfo
		person1.setName("Johnny");
		person1.setAge(20);
		person2.setInfo("Fletcher", 21);
		
		// Print getName and getAge method
		System.out.println("Name\t: " + person1.getName());
		System.out.println("Age\t: " + person1.getAge());
		System.out.println();
		
		System.out.println("Name\t: " + person2.getName());
		System.out.println("Age\t: " + person2.getAge());
		
	}

}
