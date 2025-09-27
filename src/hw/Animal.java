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
//public class Animal {
//	private int age;
//	private float weight;
//
//	public void setweight(float weight) {
//		this.weight = weight;
//	}
//
//	public void setage(int age) {
//		this.age = age;
//	}
//
//	public Animal(int age, float weight) {
//		super();
//		this.age = age;
//		this.weight = weight;
//	}
//	public void speak() {
//	System.out.println("Age is " + age);
//	System.out.println("Weight is " + weight);
//}
//
//	public Animal() {
//		//1. 上子類別的建構子super()給Java或是相關看的資料
//		//2. 這也是 Java Bean 規範之一
//		//3. 給日後搭配的框架使用 (框架會呼叫此建構子幫我們產生建構)
//	}
//
//	public void display() {
//		System.out.println("age is = " + age);
//		System.out.println("weight is = " + weight);
//	}
//}
public class Animal{
	private int age;
	private String name;

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Animal(int age) {
		this(age, "-");
	}

	public Animal(String name) {
		this(0, name);
	}

	public Animal() {
		this(0, "-"); // 或 empno = 0; ename = "-";
	}

	public void display() {
		System.out.println("age=" + age);
		System.out.println("name=" + name);
	}

	// 新增getSalary方法
	public double age() {
		return 0;
	}
	public void speak() {
	System.out.println("Age is " + age);
	System.out.println("name is " + name);
}
}


