package check;

import java.util.Scanner;

public class BusCard {
	/*
	 * 성인 : 만 18세이상
	 * 청소년 : 만 13세이상
	 * 어린이 : 만 6세이상
	 * 유아 : 만 5세이하
	 * */
	public static String getRole(int age) {
		String role ="";
			if (age>=18) {
				System.out.println("성인입니다.");
			}else if(age>=13){
				System.out.println("청소년입니다.");
			}else if(age>=6){
				System.out.println("청소년입니다.");
			}else{
				System.out.println("유아입니다.");
			}
		return role;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇살인가요?");
		int age = scan.nextInt();
		String role = getRole(age);
	}
}
