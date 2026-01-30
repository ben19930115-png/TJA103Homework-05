package hw;

//public class number {
//	public static void main(String[] args) {
//		int count = 0;
//		for(int i = 101; i <= 200; i++) {
//		boolean x = true;
//				
//		for(int j = 2; j < i; j++) {
//			if (i % j == 0) {
//			x = false;
//			break; 
//		}
//	  }
//		if (x) {
//			System.out.print(i + " ");
//			count++;
//			}
//		}
//	System.out.println("\n總質數" + count);
//	}
//}


//class Happy {
//    public static void main(String args[]) {
//
//        int i = 1;      
//        // i 初始化為 1
//
//        int j = i++;    
//        // 後置遞增 i++
//        // 先把 i 的值 (1) 指派給 j
//        // 再讓 i + 1
//        // 結果：j = 1, i = 2
//
//        if ((i == (++j)) && ((i++) == j)) {
//            // 先判斷左邊：(i == (++j))
//            // ++j 是前置遞增，j 先 +1
//            // j: 1 → 2
//            // 比較 i == j → 2 == 2 → true
//
//            // 左邊為 true，因為是 &&，所以繼續判斷右邊
//
//            // 右邊：(i++) == j
//            // i++ 是後置遞增
//            // 先用 i 的值比較 → 2 == 2 → true
//            // 再讓 i +1 → i: 2 → 3
//
//            i += j;
//            // 進入 if 區塊
//            // i = 3 + 2 = 5
//        }
//
//        System.out.println("i = " + i);
//        // 輸出最終 i 的值
//    }
//}


//public class number{
//	public static void main(String[] arg) {
//		int count = 0;
//		for(int i = 101;i <= 200; i++) {
//		boolean x = true;
//		
//		for(int j = 2; j < i ;j++) {
//			if(i % j == 0) {
//			x = false;
//			break;
//			}
//		}
//		if(x) {
//			System.out.print(i+" ");
//			count++;
//		}
//	}
//		System.out.println("\n總質數:"+ count);
//	}	
//}




public class number{
	public static void main(String[] arg) {
		int count = 0;
		for(int i = 101; i <= 200; i++) {
			boolean x = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
				x = false;
				break;
				}
			}
			if(x) {
			System.out.print(i + " ");
			count++;
			}
		}
		System.out.println("\n 101~200總共質數有" + count + "個");
	}
}
