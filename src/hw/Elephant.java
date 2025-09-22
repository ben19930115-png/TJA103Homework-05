package hw;

public class Elephant extends Animal {
	private String name; 


	public Elephant (int age, float weight,String name ) {
		super(age, weight);
		this.name = name;
		System.out.println("Name is " + name);
	}
	public void speak() {
		super.speak();
		System.out.println("Name is " + name);
	}
}
