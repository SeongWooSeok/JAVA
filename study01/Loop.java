package study01;

public class Loop {

	public static void main(String[] args) {
		int num  = 1; // 초기화
		int sum = 0;
		
		while(num <= 10 ) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		num  = 1; // 초기화
		sum = 0;
		do {
			sum += num;
			num++;
		} while(num<= 10);
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//구구단
		for(int dan = 2; dan<=9; dan++) {
			for(int t=1; t<=9; t++) {
				System.out.println(dan+"X"+t+"="+(dan*t));
			}
			System.out.println();
		}
		
		
		for(int i =0; i<=9; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i =0; i<=9; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//1~100까지 합계
		int total1 =0;
		for(int i=1; i<=100;i++) {
			total1+= i;
		}
		System.out.println("합계 : "+total1);
		
		//1~100까지 짝수만 합계
		int total2 =0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
			total2+= i;
			}
		}
		System.out.println("합계 : "+total2);
		
		int total3=0;
		for(int i =2; i<=100; i+=2) {
			total3+=i;
		}
		System.out.println("합계 : "+total3);
		
		int sum1 = 0;
		int num1 = 1;
		while(num1<=100) {
			sum1 += num1;
			if(sum1>100) {
				break;
			}
			num1++;
		}
		System.out.println(sum1+" "+num1);
		
		
		
		
		
	}

}
