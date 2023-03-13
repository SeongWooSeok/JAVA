package test1;

import java.time.LocalDate;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//초를 입력받아서 시간 분 초로 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력하시오 : ");
		int time = scanner.nextInt();
		scanner.close();
		
		int hour = time/3600;
		int minute = time/60%60;
		int second = time%60;
		
		
		System.out.print("결과 출력:" +time+"초  => ");
		if(hour!=0) {
			System.out.printf("%d시간", hour);
		}
		if(minute!=0) {
			System.out.printf("%d분", minute);
		}
		if(second!=0) {
			System.out.printf("%d초", second);
		}
		
		LocalDate now = LocalDate.now();
		String dayOfWeek = now.getDayOfWeek().toString();
		System.out.println(dayOfWeek);
		
		
		
	}

}
