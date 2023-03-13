package check;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// 유로 달러 두번 입력
		// 한화로 얼마인지
		// 환율 검색
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇유로를 환전하시겠어요?");
		double eur  = scan.nextDouble();
		double kor1 =  1338.64 *eur;
		System.out.println("몇달러를 환전하시겠어요?");
		double usd = scan.nextDouble();
		double kor2 = 1228.70 *usd;
		int sum = (int)(kor1+kor2);
		System.out.printf("유로의 환전 금액은 : %.0f\n" ,kor1);
		System.out.printf("달러의 환전 금액은 : %.0f\n" ,kor2);
		System.out.println("총 환전 금액은 :" + sum);
	}

}
