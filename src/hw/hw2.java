// 1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
//package hw;
//
//public class hw2 {
//	public static void main(String[] args) {  
//		int sum = 0 ;
//	      for (int i = 2; i <= 1000; i += 2) {
//	          sum += i;
//	      }
//	    	  System.out.print("1～1000的偶數和 = " + sum);
//		}
//}



// 2.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
package hw;

public class hw2 {
	public static void main(String[] args) {  
		int sum = 1 ;
	      for (int i = 1; i <= 10; i++) {
	    	  for (int j = 1; j<= 10;)
	          sum = i * j;
	      }
	    	  System.out.print("1～10的連乘積 = " + sum);
		}
}







