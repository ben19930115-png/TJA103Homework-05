package hw;

import java.util.Scanner;

public class cellphone {
	
	public static void main(String[] args) {
		String regex = "^09[0-9]\\d-\\d{6}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("input a phone number");
		String tel = sc.next();
		
		if (tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}
	

}
