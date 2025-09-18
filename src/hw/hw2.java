// 1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
package hw;

public class hw2 {
	public static void main(String[] args) {  
	      for (int i = 0; i <= 1000; i+=2) {
	          if (i % 2 == 0) 
			
	      System.out.print(i+ " " );
	      }
	     
	      for (int j = 0; j <= 1000; j += 2) {
	    	  System.out.print(j);
	      }
	      
		}
}


