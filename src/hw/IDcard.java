package hw;

import java.util.Scanner;

public class IDcard {
	
	public static void main(String[] args) {
		String regex = "^[A-Z][12]\\d{8}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("input a ID number");
		String tel = sc.next();
		
		if (tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}
	

}
