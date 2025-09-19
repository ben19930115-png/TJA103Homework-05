package hw;

public class Animal {
	private int age;
	private float weight;
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	public void speak() {
		System.out.println("Age is " + age);
		System.out.println("Weight is " + weight);
		
	}
//	public void setage(int ageXXX) {
//		age = ageXXX;
//	}
//
//	
//	public double getweight() {
//		return weight;
//	}
//	public void setage(float weightXXX) {
//		if(weightXXX > 0)
//			weight = weightXXX;
//		else
//			System.out.println("請確認售價設定");
//	}

}
