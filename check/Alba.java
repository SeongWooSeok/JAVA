package check;

import java.util.Scanner;

public class Alba {
	//급여계산
	//시급, 일한 시간을 입력
	/*Scanner input = new Scanner(System.in);
	 * */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시급이 얼마인가요?");
		int hourly = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("몇시간 일하셨나요?");
		int worktime = scan.nextInt();
		
		int totalhourly = hourly * worktime;
		System.out.printf("당신의 일급은 : %d\n " ,totalhourly);
		
		System.out.println("월급 계산이 하고싶으시면 1번을 입력해주시고 연봉은 2번을 눌러주세요.");
		int a = scan.nextInt();
		if(a==1) {
			System.out.println("한달에 몇일을 일하셨나요?");
			int month = scan.nextInt();
			int salary = month * totalhourly;
			System.out.printf("당신의 월급은 : %d " ,salary);
		}else {
			System.out.println("한달에 몇일을 일하셨나요?");
			int month = scan.nextInt();
			int salary = month * totalhourly;
			int year = salary * 12;
			System.out.printf("당신의 연봉은 : %d " ,year);
		}
		

	}

}
