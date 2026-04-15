package hw;

public class Bmi {
	public static void main(String[] arg) {
		double height = 1.72;
		double weight = 80.0;
		
		double bmi = weight / (height * height);
		
		System.out.printf("BMI 為:%.2f%n", bmi);
		
		if(bmi < 18.5) {
			System.out.print("過瘦");
		}else if( bmi < 24 ) {
			System.out.println("正常");
		}else
			System.out.println("過胖");
	}
}
