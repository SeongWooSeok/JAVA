package check;

import java.util.Scanner;

public class SumNumber {
	//자릿수의 합
	//세자리수를 입력받아 각 자릿수를 더하여 결과를 출력
	//단 세자리 정수가 아닌 경우 예외처리
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num2 = 0;
		
		System.out.println("세자리수를 입력하세요");
		int num1 = scan.nextInt();
		if(num1 <100 || num1 >=1000) {
			System.out.println("세자리수가 아니라서 프로그램을 종료합니다.");
		}else {
		System.out.println("세자리수를 입력하세요");
		num2 = scan.nextInt();
		if(num2 <100 || num2 >=1000) {
			System.out.println("세자리수가 아니라서 프로그램을 종료합니다.");
			}else {
				int a1 = num1 % 10; //일의 자리 
				int a2 = num2 %10;
				int suma = a1+a2;
				
				int b1 = (num1 %100)-a1;//십의 자리
				int b2 = (num2 %100)-a2;
				int sumb = b1+b2;
				int bb = b1/10;
				
				int c1 = (num1-b1)-a1;//백의자리
				int c2 = (num2-b2)-a2;
				int sumc = c1+c2;
				int cc = c1/100;
				
				int aall = a1+bb+cc;
				
				System.out.println("======두 개의 세자리수의 각 자리수의 합======");
				System.out.println("백의 자리 :" + sumc);
				System.out.println("십의 자리 :" + sumb);
				System.out.println("일의 자리 :" + suma);
				System.out.println("첫번째 세자리수 각자리수의 합 :" + aall);
			}
		}
		
		
		

	}

}
