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

//package hw;
//
//public class hw2 {
//	public static void main(String[] args) {
//		int sum = 0;   // 用來累加
//		int  j =  1;   // 從第一個奇數開始
//	      for (int i = 1; i <= 10; i++) {
//	    	 sum += j; // 把奇數加進去
//	      System.out.print(sum +  " ");
//	      	 j += 2;   // 下一個奇數
//	      }
//		}
//}

/* 5.阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
輸出結果為阿文可以選擇的數字有哪些？總共有幾個？*/

package hw;

public class hw2 {

	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1 ; i <= 49; i++) {
			// 若個位數或十位數有 4 則略過 
			if(i % 10 == 4 || i / 10 == 4) continue;
			System.out.print(i + "\t");
			count++;
			if (count % 10 == 0 ) 
			System.out.println();			
		}
			System.out.println("\n" + "阿文可以選擇的數字共有" + count + "個");
	}
}


