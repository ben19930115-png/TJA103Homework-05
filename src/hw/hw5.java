package hw;
/*請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
圖：*/
import java.util.Scanner;
public class hw5 {
	
			// 長方形面積
			public static int areaMeasure(int width, int height) {
				return width * height;	
			}
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				System.out.print("請輸入整數寬與高: ");	
				int width = sc.nextInt();
		        int height = sc.nextInt();
		        
				int j = areaMeasure(width, height);		
				System.out.println("長方形面積=" + j);
				
				sc.close();	
	}
			
}
