package check;

import java.util.Scanner;

public class UpgradeFood {

	public static void main(String[] args) {
		int c = 25000;
		int d = 5000;
		int n = 8500;
		int man = 0;
		
		System.out.println("1인분에 치킨은 25000원 왕만두는 5000원 쌀국수는 8500원입니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("치킨을 몇인분 먹으실껀가요?");
		int num1 = scan.nextInt();
		System.out.println("왕만두를 몇인분 먹으실껀가요?");
		int num2 = scan.nextInt();
		System.out.println("쌀국수를 몇인분 먹으실껀가요?");
		int num3 = scan.nextInt();
		
		int csum = c*num1;
		int dsum = d*num2;
		int nsum = n*num3;
		int allsum = csum + dsum + nsum;
		
		System.out.printf(" 치킨가격 : %d\n 왕만두가격 : %d\n 쌀국수가격 : %d\n ====================\n 총가격 : %d\n", csum,dsum,nsum,allsum);
		
		
		
		
	}

}
