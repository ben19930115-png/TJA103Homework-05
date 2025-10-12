package hw;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class hw7 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("c:\\javawork\\Sample.txt", true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             PrintStream ps = new PrintStream(bos)) {

            ps.println("Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
