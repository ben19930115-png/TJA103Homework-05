package hw;


//public class Elephant extends Animal {
//	private String name; 
//
//
//	public Elephant (int age, float weight,String name ) {
//		super(age, weight);
//		this.name = name;
//		System.out.println("Name is " + name);
//	}
//	public void speak() {
//		super.speak();
//		System.out.println("Name is " + name);
//	}
//}

public class Elephant extends Animal {
	private int age; // 月薪

	public void display() {
		super.display();
		System.out.println("name=" + age);
	}

	public Elephant(int age, String name) {
		super(age, name);
		this.age = age;
	}

	// add
	public int getage() {
		return age;
	}
}
