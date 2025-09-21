package hw;

public class Elephant extends Animal {
	private String name; 

	public void display() {
		super.display();
		System.out.println("名子 = " + name);
	}

	public Elephant (int age, float weight,String name ) {
		super(age, weight);
		this.name = name;
		System.out.println("Name is" + name);
	}
	
}
