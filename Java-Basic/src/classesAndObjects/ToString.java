package classesAndObjects;


public class ToString {
	
	// Suppose that class ToString is an animal for example bird
	
	public int id;
	private String name;
	
	public ToString(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();
	}

	public static void main(String[] args) {

		ToString bird1 = new ToString(1, "Cendrawasih");
		ToString bird2 = new ToString(2, "Merak");
		
		System.out.println(bird1);
		System.out.println(bird2);
	}

}
