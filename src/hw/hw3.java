package hw;

import java.util.List;

/*請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
三角形、其它三角形或不是三角形，如圖示結果：*/
//import java.util.Scanner;
//
//public class hw3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 輸入三個整數
//        System.out.print("請輸入三個整數: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        // 判斷是否能構成三角形 (三角形成立條件)
//        if (a + b > c && a + c > b && b + c > a) {
//            // 正三角形
//            if (a == b && b == c) {
//                System.out.println("正三角形");
//            }
//            // 等腰三角形
//            else if (a == b || b == c || a == c) {
//                System.out.println("等腰三角形");
//            }
//            // 直角三角形 (進階功能)
//            else if (a * a + b * b == c * c ||
//                     a * a + c * c == b * b ||
//                     b * b + c * c == a * a) {
//                System.out.println("直角三角形");
//            }
//            // 其他三角形
//            else {
//                System.out.println("其它三角形");
//            }
//        } else {
//            System.out.println("不是三角形");
//        }
//
//        sc.close();
//    }
//}
/*2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
對則顯示正確訊息，如圖示結果：*/
//import java.util.Scanner;
//
//public class hw3 {
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int answer = (int)(Math.random() * 10);
//		int guess;
//		
//		System.out.println("猜數字0 ~ 9");
//		
//		while (true) {
//			guess = scanner.nextInt();
//			if (guess == answer) {
//				System.out.println("答對了" + answer);
//				break;
//			} else {
//				System.out.println("答錯了");		
//			}
//		}
//		scanner.close();
//	}			
//}

//進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
//import java.util.Scanner;
//
//public class hw3 {
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int answer = (int)(Math.random() * 100);
//		int guess;
//		
//		System.out.println("猜數字0 ~ 101");
//		
//		while (true) {
//			guess = scanner.nextInt();
//			if (guess > answer) {
//				System.out.println("太大了猜小一點");
//			} else if (guess < answer){
//				System.out.println("太小了猜大一點");		
//			}else {
//				System.out.println("答對了");
//				break;
//			}
//		}
//		scanner.close();
//	}			
//}

/* 3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
的號碼與總數，如圖： */

//import java.util.Scanner;
//
//public class hw3 {
//
//	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		int count = 0;
//			System.out.print("請輸入不想選的數字(1~9): ");
//			int a = x.nextInt();
//			
//		for (int i = 1 ; i <= 49; i++) {
//			
//			if(i % 10 == a || i / 10 == a) continue;
//			System.out.print(i + "\t");
//			count++;
//			if (count % 10 == 0 ) 
//			System.out.println();			
//		}
//			System.out.println("\n" + "阿文可以選擇的數字共有" + count + "個");
//	}
//}

//進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複

import java.util.*;

public class hw3 {
	static boolean contains(int n, int d) {
		while (n > 0) {
			if (n % 10 == d) return true;
			n /= 10;
		}
		return false;
	}	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a;
		while (true) {
			System.out.print("請輸入不想選的數字(1~9): ");
			a = x.nextInt();
			if (a >= 1 && a <= 9) break;
			System.out.print("請輸入不想選的數字(1~9):! ");
		}
		List<Integer> pool = new ArrayList<>();
		for (int i = 1 ; i <= 49; i++) {			
			if(!contains(i, a)) {
				pool.add(i);
			}
		}
		System.out.print("\n陣列");
		int perRow = 7, cnt = 0;
		for (int i = 0; i < pool.size(); i++) {
			cnt++;
			if (cnt % perRow == 0) System.out.println(); 
			else System.out.print("\t");			
		}
		if (cnt % perRow != 0) System.out.println();
		System.out.println("阿文可以選擇的數字共有" + pool.size() + "個" );
		if (pool.size() >= 6) {
				Collections.(pool);
				List<Integer> y = new ArrayList<>(pool.subList(0, 6));
				Collections.sort(y);
				System.out.println("隨機選六個(不重複數字) :" + y );
		}else {
			System.out.println("可選數字不足六個" );
		}
		x.close();
	}
}

/*4.透過Math類別的靜態方法random()，可以自動產生隨機的數字
用法參考如圖所示：*/




