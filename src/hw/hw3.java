package hw;

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
/*請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
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

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random() * 100);
		int guess;
		
		System.out.println("猜數字0 ~ 101");
		
		while (true) {
			guess = scanner.nextInt();
			if (guess > answer) {
				System.out.println("太大了猜小一點");
			} else if (guess < answer){
				System.out.println("太小了猜大一點");		
			}else {
				System.out.println("答對了");
				break;
			}
		}
		scanner.close();
	}			
}

