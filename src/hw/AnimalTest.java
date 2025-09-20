package hw;


public class AnimalTest { 
		public static void main(String[] args) {
			Animal a1 = new Animal(2, 5.0f);
			a1.speak();	
			
			System.out.println("歲月如梭======");
			
//			a1 = new Animal(5, 25.0f);
			a1.setage(5);
			a1.setweight(25.0f);
			a1.speak();
			
		}
}
