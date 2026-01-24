package hw;

/*請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
圖：*/
//import java.util.Scanner;
//public class hw5 {
//	
//			// 長方形面積
//			public static int areaMeasure(int width, int height) {
//				return width * height;	
//			}
//			public static void starSquare(int width, int height) {
//				for (int i = 0; i < height; i++) {
//					for (int j = 0; j < width; j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//			}
//		}
//			public static void main(String args[]) {
//				Scanner sc = new Scanner(System.in);
//				
//				System.out.print("請輸入整數寬與高: ");	
//				int width = sc.nextInt();
//		        int height = sc.nextInt();
//		        
//				int x = areaMeasure(height, width);		
//				System.out.println("長方形面積=" + x);
//				
//				System.out.println(x);
//				starSquare(width, height);		
//				
//				sc.close();	
//			}	
//}

//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
//import java.util.concurrent.ThreadLocalRandom;	
//
//public class hw5{
//
//	public static void main(String[] args) {
//		System.out.println("亂數結果");
//		int avg = randAvg();
//		System.out.println(avg);
//	}
//		
//static int randAvg() {
//	int sum = 0;
//	for(int i = 0; i < 10; i++) {
//	    int j = ThreadLocalRandom.current().nextInt(0, 100);
//	    if (i > 0) 
//	    System.out.println(j);
//	    sum += j;
//	}
//	System.out.println();
//	return sum;
//}
//
//}

/*利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
可以找出二維陣列的最大值並回傳，如圖：*/

//public class hw5{
//	public static void main(String[] args) {
//		int[][] intArray = {
//				{1, 6, 3},
//				{9, 5, 2}
//		};
//		double[][] doubleArray = {
//				{1.2, 3.5, 2.2},
//				{7.4, 2.1, 8.2}
//		};
//		hw5 w = new hw5();
//		
//		System.out.println(w.maxElement(intArray));
//		System.out.println(w.maxElement(doubleArray));
//	}
//}


















