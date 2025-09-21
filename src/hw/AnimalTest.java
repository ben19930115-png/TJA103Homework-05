package hw;
//public class AnimalTest { 
//	public static void main(String[] args) {
//		Animal a1 = new Animal(2, 5.0f);
//		a1.speak();	
//		
//		System.out.println("歲月如梭======");
//		
//		a1 = new Animal(5, 25.0f);
//		a1.setage(5);
//		a1.setweight(25.0f);
//		a1.speak();
//		
//	}
//}

public class AnimalTest { 
		public static void main(String[] args) {
			Animal a1 = new Animal(3, 8.0f);
			Elephant e1 = new Elephant(8, 1200.0f, "Ben");	
			
//			System.out.println("=====歲月如梭，時光飛逝=====");
//			a1 = new Animal(5, 25.0f);
			a1.speak();
			System.out.println("============================");
			e1.speak();
			
		}
}
