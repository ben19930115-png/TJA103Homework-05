package hw;

//import java.io.BufferedOutputStream;
//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.PrintWriter;
//
//public class hw7 {
//    public static void main(String[] args) {
//        try (FileOutputStream fos = new FileOutputStream("c:\\javawork\\Sample.txt", true);
//             BufferedOutputStream bos = new BufferedOutputStream(fos);
//             PrintStream ps = new PrintStream(bos)) {
//
//            ps.println("Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料");
//        } catch (IOException e) {
//            System.err.println(e);
//       }



import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ThreadLocalRandom;

public class hw7{
		public static void main(String[] args) {
			 
			Path out = Paths.get("c:\\javawork\\Data.txt");
	        StringBuilder line = new StringBuilder();
	        
			// 亂數    
			    for(int i = 0; i < 10; i++) {
			    int j = ThreadLocalRandom.current().nextInt(1, 1001);
			    if (i > 0) line.append("," + "\n");
			    line.append(j);	
			    }
			    
			 // 以 CREATE + APPEND 寫檔（不存在就建立，存在就附加）
			    try (BufferedWriter w = Files.newBufferedWriter(
		                out, StandardCharsets.UTF_8,
		                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
		            w.write(line.toString());
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		}
}
