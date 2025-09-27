package hw;

public class PolyAnimal {
		
		public static void main(String[] args) {
			Animal[] e = new Animal[2]; // 宣告員工陣列,準備置入員工3人
			
			e[0] = new Animal(7002, "David");
			e[1] = new Elephant(7003, "James");
			
			for (int i = 0; i < e.length; i++)
				e[i].speak();

		}
	}


