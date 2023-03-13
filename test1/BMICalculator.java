package test1;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// w=weight t=tall
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요 : ");
		double w = scan.nextDouble();
		System.out.println("키를 입력하세요 : ");
		double t = scan.nextDouble();
		//BMI 지수 계산
		double bmi=calculateBMI(w,t);
		System.out.println(bmi);
		//BMI 지수로 비만도 결과 출력
		printBMIClassification(bmi);
		
	}
	
	static double calculateBMI(double w, double t) {
		return w/Math.pow(t, 2);
	}
	
	
	public static void printBMIClassification (double bmi) { 
		String bmiClass =" ";
		if(bmi>=30) {
			bmiClass="비만";		
	 	}
	 	else if(25.0<=bmi&&bmi<30) {
		 bmiClass="과체중";	
		} else if(18.5<=bmi&&bmi<25.0) {
			bmiClass="정상체중";	
		} else {
			bmiClass="저체중";		
		}
		System.out.printf("BMI: %.2f  %n%s", bmi, bmiClass);
	}


}
