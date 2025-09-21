package hw;
//public class Animal {
//	
//	private int age;
//	private float weight;
//	
//	public Animal(int age, float weight) {
//		this.age = age;
//		this.weight = weight;
//	}
//	public void speak() {
//		System.out.println("Age is " + age);
//		System.out.println("Weight is " + weight);
//	}
//	
//	public int getage() {
//		return age;
//	}
//	public void setage(int age)  {
//		this.age = age;
//	}	
//	public float getweight() {
//		return weight;
//	}
//	public void setweight(float weight) {
//		this.weight = weight;
//	}
//
//
//}
public class Animal {
	private int age;
	private float weight;

	public void setweight(float weight) {
		this.weight = weight;
	}

	public void setage(int age) {
		this.age = age;
	}

	public Animal(int age, float weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	public void speak() {
	System.out.println("Age is " + age);
	System.out.println("Weight is " + weight);
}

	public Animal() {
	}

	public void display() {
		System.out.println("age is = " + age);
		System.out.println("weight is = " + weight);
	}
}



