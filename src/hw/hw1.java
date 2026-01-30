package hw;

// 1.請設計一隻Java程式，計算12，6這兩個數值的和與積
//public class hw1 {
//	public static void  main(String[] args) {
//		
//		int i = 12;
//		int j = 6;
//		
//		System.out.println("12+6和的值為 " + (i + j));
//		System.out.println("12+6和的值為 "+ i * j);
//		
//	}
//	
//
//}

// 2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)

//public class hw1 {
//	public static void  main(String[] args) {
//		
//		int i = 200;
//		int j = 12;
//		
//		System.out.println("200 顆雞蛋為 " + i / j + " 打雞蛋，並剩下 " + i % j + " 顆雞蛋");
//		
//	}
//	
//
//}

// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒

//public class hw1 {
//public static void  main(String[] args) {
//	
//	float s = 256559;
//	float m = 60;
//	float h = 60;
//	float d = 24;
//	
//	System.out.printf("256559秒為%n%.2f分鐘%n" , s / m);
//	System.out.printf("%.2f 小時%n", s / m / h );
//	System.out.printf("%.2f 天", s / m / h / d );
//	
//}
//
//}

// 4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//圓形面積
//public class hw1 {
//
//	// 圓形面積
//	public static double areaMeasure(double radius) {
//		return radius * radius * 3.14159;
//	}
//
//	public static void main(String args[]) {
//		double i = areaMeasure(5.0);
//
//		System.out.println("圓形面積=" + i);
//
//	}
//
//}


//5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)

//public class hw1{
//	public static void main(String args[]){
//		double i = 1500000;
//		double j = 0.02;
//		double k = 10;
//		System.out.println("10年後本金加利息共有: " + i + i * j * k);
//		
//	}
//	
//}


//public class hw1 {
//
//
//	// 梯形面積
//	public static double areaMeasure(double capital, double rate, double year) {
//		return capital * rate * year + capital;
//	}
//
//	public static void main(String args[]) {
//		double k = areaMeasure(1500000.0, 0.02, 10.0);
//		System.out.println("10年後本金加利息共有: " + k);
//	}
//
//}

/* 6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因
*/
//public class hw1 {
//public static void  main(String[] args) {
//	
//	System.out.println(5 + 5);   // 產生結果為"數字" + "數字"，因此為 5 + 5 = 10
//	System.out.println(5 + '5'); // 產生結果為"數字" + "Unicode(字元5十進位為53)"，因此為 5 + 53 = 58
//	System.out.println(5 + "5"); // 產生結果為"字串" + "字串"，因此為 5 + 5 = 55
//	
//}
//
//
//}