package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//public class Test {
//
// // main 方法：Java 程式的進入點，JVM 會從這裡開始執行
// public static void main(String[] arg) {
//
//     // 設定要計算的總月數，這裡是 36 個月
//     int months = 36;
//
//     // 宣告一個 long 型別的陣列，用來存每個月的兔子對數
//     // 陣列大小設為 months + 1，是為了直接使用 index 1 ~ 36
//     long[] f = new long[months + 1];
//
//     // 第 1 個月的兔子數：1 對（題目已給定）
//     f[1] = 1;
//
//     // 第 2 個月的兔子數：1 對（題目已給定）
//     f[2] = 1;
//
//     // 從第 3 個月開始計算到第 36 個月
//     f[3] = 1;
//     
//     // 計算每個月的兔子對數
//     for (int i = 4; i <= months; i++) {
//    	 f[i] = f[i - 1] + f[i - 3];
//    	 
//    	 // f[i - 1]：上個月存活下來的所有兔子
//    	 // f[i - 3]：3 個月前出生、現在剛好滿 3 個月開始繁殖的兔子
//         // 相加後得到本月的兔子對數
//     }
//     System.out.println("36 個月共有兔子：" + f[36] + "對");
// }
//}
	

//public class Test{
//	public static void main(String[] arg) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		StringBuilder sb = new StringBuilder();
//		for (int i=1;i<=n;i++){
//		  if(i<n){
//		    int d=i-1, L=n-d, R=n+d;
//		    sb.append("(").append(i).append(",").append(L).append(")");
//		    if(L!=R) sb.append(",(").append(i).append(",").append(R).append(")");
//		  }else{
//		    for(int c=1;c<=2*n-1;c++){
//		      if(c>1) sb.append(",");
//		      sb.append("(").append(i).append(",").append(c).append(")");
//		    }
//		  }
//		  if(i<n) sb.append(",");
//		}
//		System.out.print(sb);
//	}
//}


//	public class Test {
//
//	    public static void main(String[] args) {
//	        System.out.println(compress("AAABBBCCDAA"));
//	    }
//
//	    static String compress(String s) {
//	        if (s == null || s.isEmpty()) return "";
//
//	        var sb = new StringBuilder();
//	        for (int i = 0, j; i < s.length(); i = j) {
//	            char c = s.charAt(i);
//	            j = i + 1;
//	            while (j < s.length() && s.charAt(j) == c) j++;
//	            sb.append(c).append(j - i);
//	        }
//	        return sb.toString();
//	    }
//	}

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(mostFrequent("apple,banana,apple,orange,banana,apple"));
//    }
//    static String mostFrequent(String input) {
//        var map = new HashMap<String, Integer>();
//        for (String s : input.split(",")) {
//            s = s.trim();
//            map.put(s, map.getOrDefault(s, 0) + 1);
//        }
//        String best = null;
//        int cnt = -1;
//        for (var e : map.entrySet()) {
//            if (e.getValue() > cnt || (e.getValue() == cnt && e.getKey().compareTo(best) < 0)) {
//                best = e.getKey();
//                cnt = e.getValue();
//            }
//        }
//        return best + "(" + cnt + ")";
//    }
//}

//public class Test {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);  
//
//        int n = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= n; i++) {
//
//            if (i < n) {
//                int d = i - 1;
//                int L = n - d;
//                int R = n + d;
//
//                sb.append("(").append(i).append(",").append(L).append(")");
//                if (L != R)
//                    sb.append(",(").append(i).append(",").append(R).append(")");
//            } else {
//                for (int c = 1; c <= 2 * n - 1; c++) {
//                    if (c > 1) sb.append(",");
//                    sb.append("(").append(i).append(",").append(c).append(")");
//                }
//            }
//
//            if (i < n) sb.append(",");
//        }
//
//        System.out.print(sb.toString());
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int width = 2 * n - 1;
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= width; j++) {
//
//                if (i == n) {
//                    System.out.print("*");   // 最底層全滿
//                }
//                else if (j == n - (i - 1) || j == n + (i - 1)) {
//                    System.out.print("*");   // 左右兩顆
//                }
//                else {
//                    System.out.print(" ");   // 其他空白
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//public class Test {
//    static final DateTimeFormatter F = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//
//    public static void main(String[] args) {
//        System.out.println(plusMinutes("2026-02-26 10:00", 90));
//    }
//    static String plusMinutes(String input, int minutes) {
//        return LocalDateTime.parse(input, F).plusMinutes(minutes).format(F);
//    }
//}


/*題 4：資料清洗 + 去重排序（常見實務題）
題目：輸入 " 3, 2, 2, 10, -1, 3 "
輸出：[-1,2,3,10]（去重、轉 int、排序）
考點：split/trim、例外處理（可選）、Set、排序 */

public class Test {
    public static void main(String[] args) {
        System.out.println(cleanDistinctSort(" 3, 2, 2, 10, -1, 3 "));
    }
    static List<Integer> cleanDistinctSort(String input) {
        var set = new HashSet<Integer>();
        for (String p : input.split(",")) {
            p = p.trim();
            if (!p.isEmpty()) set.add(Integer.parseInt(p));
        }
        var list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}


