package hw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

//public class number{
//	public static void main(String[] arg) {
//		int count = 0;
//		for(int i = 101; i <= 200; i++) {
//			boolean x = true;
//			
//			for(int j = 2; j < i; j++) {
//				if(i % j == 0) {
//				x = false;
//				break;
//				}
//			}
//			if(x) {
//			System.out.print(i + " ");
//			count++;
//			}
//		}
//		System.out.println("\n 101~200總共質數有" + count + "個");
//	}
//}

//public class number {
//
//    public static void main(String[] args) {
//
//        // 1️⃣ 宣告三個 3x3 的 int 二維陣列
//        int[][] x = new int[3][3];
//        int[][] y = new int[3][3];
//        int[][] z = new int[3][3];
//
//        // 2️⃣ 使用亂數產生 x、y 的值，並同時計算 z
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                // Math.random() 產生 0.0 ~ 1.0
//                // * 31  => 0.0 ~ 30.999...
//                // (int) => 0 ~ 30
//                x[i][j] = (int)(Math.random() * 31);
//                y[i][j] = (int)(Math.random() * 31);
//
//                // x + y 存入 z
//                z[i][j] = x[i][j] + y[i][j];
//            }
//        }
//
//        // 3️⃣ 顯示 x 陣列
//        System.out.println("Matrix X:");
//        printMatrix(x);
//
//        // 4️⃣ 顯示 y 陣列
//        System.out.println("\nMatrix Y:");
//        printMatrix(y);
//
//        // 5️⃣ 顯示 z 陣列
//        System.out.println("\nMatrix Z (X + Y):");
//        printMatrix(z);
//    }
//
//    // 專門用來印出 3x3 二維陣列的方法
//    public static void printMatrix(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

////九九乘法表

//public class number{
//	public static void main(String[] arg) {
//		
//		for(int i = 1; i <= 9; i++ ) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			}
//			System.out.println();
//		}
//	}
//}

//public class number{
//	public static void main(String[] arg) {
//		int mouths = 36;
//		long []f = new long[mouths + 1];
//		
//		f[1] = 1;
//		f[2] = 1;
//		f[3] = 1;
//		
//		for(int i = 4; i <= mouths; i++) {
//			f[i] = f[i-1] + f[i-3];
//		
//	}
//		System.out.print("總共" + f[36] + "對兔子");
//}		
//	}

//public class number {
//
//    public static void main(String[] args) {
//        String input = "2026-02-26 10:00";
//        
//        String result = plusMinutes(input, 90);
//        
//        System.out.println("原始時間: " + input);
//        System.out.println("加90分鐘後: " + result);
//    }
//
//    public static String plusMinutes(String input, int minutes) {
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        
//        LocalDateTime dt = LocalDateTime.parse(input, fmt);
//        
//        return dt.plusMinutes(minutes).format(fmt);
//    }
//}

//public class number {
//
//    public static void main(String[] args) {
//
//        String input = "abcdef";
//
//        String output = Built(input);  
//
//        System.out.println("原字串: " + input);
//        System.out.println("反轉後: " + output);
//    }
//
//    public static String Built(String s) {
//        char[] a = s.toCharArray();
//        int l = 0, r = a.length - 1;
//
//        while (l < r) {
//            char tmp = a[l];
//            a[l] = a[r];
//            a[r] = tmp;
//            l++;
//            r--;
//        }
//        return new String(a);
//    }
//}

//// 統計字串

//public class number {
//
//  public static void main(String[] args) {
//    String input = "aabcccdee";
//
//    Map<Character, Integer> output = countChars(input);
//
//    System.out.println("原字串: " + input);
//    System.out.println("統計結果: " + output);
//  }
//public static Map<Character, Integer> countChars(String s) {
//    Map<Character, Integer> map = new LinkedHashMap<>();
//    for (char c : s.toCharArray()) {
//        map.put(c, map.getOrDefault(c, 0) + 1);
//    }
//    return map;
//}
//
//}

//// 必考建議背(反向文字)

//public class number {
//
//	public static void main(String[] arg) {
//		String input = "hello";
//		String output = reverse(input);
//		System.out.println(input);
//		System.out.println(output);
//	}	
//	public static String reverse(String s) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = s.length() - 1; i >= 0; i--) {
//			sb.append(s.charAt(i));
//		}
//		return sb.toString();
//	}
//}




//// 輸出不重複 A B C

//public class number {
//
//	public static void main(String[] arg) {
//
//		List<String> list = Arrays.asList("A", "B", "A", "C", "B");
//
//		Set<String> set = new LinkedHashSet<>(list); 
//		for (String s : set) {
//			System.out.print(s + " ");
//		}
//	}
//}


//// 自訂例外 AgeException（年齡 < 18 拋出）
//public class number {
//
//    public static void checkAge(int age) {
//        if (age < 18) {
//            throw new AgeException("年齡未滿 18，禁止進入");
//        }
//        System.out.println("允許進入");
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkAge(16);
//        } catch (AgeException e) {
//            System.out.println("錯誤：" + e.getMessage());
//        }
//    }
//}

//// HashMap 遍歷 LinkedHashMap排序
//public class number {
//	public static void main(String[] arg) {
//		Map<String, Integer> map = new HashMap<>();
//		map.put("Apple", 10);
//		map.put("Banana", 20);
//		map.put("Orange", 30);
//		
//		for (String key : map.keySet()) {
//		    System.out.println(key + "=" + map.get(key));
//		}
//	}
//}

////第四部分：例外處理：try-catch-finally

//public class number {
//
//	public static void main(String[] args) {
//		try {
//			int x = 10 / 0;
//			System.out.println("A");
//		} catch (Exception e) {
//			System.out.println("B");
//		} finally {
//			System.out.println("C");
//		}
//	}
//
//}





