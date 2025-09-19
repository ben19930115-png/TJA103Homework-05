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
//package hw;
//
//public class hw2 {
//	public static void main(String[] args) {  
//		int sum = 1 ;
//	      for (int i = 1; i <= 10; i++) {
//	          sum *= i;
//	      }
//	    	  System.out.print("1～10的連乘積 = " + sum);
//		}
//}

// 3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
//package hw;
//
//public class hw2 {
//	public static void main(String[] args) {  
//		int i = 1 ;
//		int sum = 1 ;
//	      while (i <= 10) {
//	    	  sum *= i;
//	          i++;
//	      }
//	    	  System.out.print("1～10的連乘積 = " + sum);
//		}
//}

/* 4.請設計一隻Java程式，輸出結果為以下：
1 4 9 16 25 36 49 64 81 100 */

package hw;

public class hw2 {
	public static void main(String[] args) {
		int sum = 1;
	      for (int i = 1; i <= 100; i += 3) {
	    	  if(sum %2 != 0)
	        	sum += i;  
			
	      System.out.print(i + " ");
	      }
	      
	      System.out.println();
 
		}
}



