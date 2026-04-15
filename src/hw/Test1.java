package hw;

public class Test1 {
	public static void main(String []arg) {
		String input = "Java";
		String output = reverse(input);
		System.out.println("翻轉前" + input);
		System.out.println("翻轉後" + output);
	}
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
		}
		
	}
	
