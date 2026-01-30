package hw;

//宣告一個名為 test 的類別（Java 程式一定要有 class）
public class Test {

 // main 方法：Java 程式的進入點，JVM 會從這裡開始執行
 public static void main(String[] arg) {

     // 設定要計算的總月數，這裡是 36 個月
     int months = 36;

     // 宣告一個 long 型別的陣列，用來存每個月的兔子對數
     // 陣列大小設為 months + 1，是為了直接使用 index 1 ~ 36
     long[] f = new long[months + 1];

     // 第 1 個月的兔子數：1 對（題目已給定）
     f[1] = 1;

     // 第 2 個月的兔子數：1 對（題目已給定）
     f[2] = 1;

     // 從第 3 個月開始計算到第 36 個月
     f[3] = 1;
     
     // 計算每個月的兔子對數
     for (int i = 4; i <= months; i++) {
    	 f[i] = f[i - 1] + f[i - 3];
    	 
    	 // f[i - 1]：上個月存活下來的所有兔子
    	 // f[i - 3]：3 個月前出生、現在剛好滿 3 個月開始繁殖的兔子
         // 相加後得到本月的兔子對數
     }
     System.out.println("36 個月共有兔子：" + f[36] + "對");
 }
}
	
	
//	public class test {
//	    public static void main(String[] args) {
//
//	        int count = 0; // 記錄質數個數
//
//	        // 檢查 101 到 200
//	        for (int i = 101; i <= 200; i++) {
//	            boolean x = true;
//
//	            // 判斷是否為質數
//	            for (int j = 2  ; j < i; j++) {
//	                if (i % j == 0) {
//	                    x = false;
//	                    break;
//	                }
//	            }
//
//	            // 如果是質數就印出並計數
//	            if (x) {
//	                System.out.print(i + " ");
//	                count++;
//	            }
//	        }
//
//	        System.out.println("\n質數總數：" + count);
//	    }
//	}



//public class test {
//	
//	private String s ;
//	
//	public static void main(String[] args){
//		 int s = 1;
//		 System.out.println(s);
//	 }
//}













//abstract class Phone {
//    protected String Apple;
//    protected int b;
//
//    public abstract void write();
//
//    public void setThing(String Apple, int b) {
//        this.Apple = Apple;
//        this.b = b;
//    }
//
//    public String getApple() {
//        return Apple;
//    }
//}
//
//class Thing extends Phone {
//    
//    public void write() {
//        System.out.println(getApple());
//        System.out.println(b);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Thing thing = new Thing();
//        thing.setThing("Apple", 3000);
//        thing.write();
//    }
//}

    
    
    



























