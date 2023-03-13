package study01;

public class Loop1 {

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
		
		//5단을 뺀 구구단 
		for(int dan = 2; dan<=9; dan++) {
			if(dan==5) {continue;}
			for(int t=1; t<=9; t++) {
				System.out.print(" "+dan+"X"+t+"="+(dan*t)+" ");
			}
			System.out.println();
		}
		
		for(int dan = 2; dan<=9; dan++) {
			for(int t=1; t<=9; t++) {
				if(dan==5) {break;}
				System.out.print(" "+dan+"X"+t+"="+(dan*t)+" ");
			}
			System.out.println();
		}
		
		int total=0;
		for(int i = 0; i <= 10; i++) {
			total=total + i;
		}
		System.out.println(total);
		
		int num2 = 0;
		int total2=0;
		while(num2<=10) {
			total2= total2+num2;
			num2++;
		}
		System.out.println(total2);

	}

}
