package study06;

import java.util.Scanner;

public class Professor {
	private String name;
	private String belong;
	private String difficult;
	
	Professor(){}
	
	Professor(String name,String belong, String difficult){
		this.name = name;
		this.belong = belong;
		this.difficult = difficult;
	}
	
	void attendence() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 적어주세요 : ");
		String name = scan.next();
		System.out.println(name + "학생 있나요?");
	}
	
	int homework(int a) {
		return a++;
	}
	
	void grade() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~4.5의 사이의 학점을 입력해주세요 : ");
		double grades = scan.nextDouble();
		if(1<=grades && grades <=1.5){
			System.out.println("학사경고입니다! 주의하세요");
		}else if(1.5<=grades && grades <=2.0) {
			System.out.println("D입니다.");
		}else if(2.0<=grades && grades <=3.0) {
			System.out.println("C입니다.");
		}else if(3.0<=grades && grades <=4.0) {
			System.out.println("B입니다.");
		}else {
			System.out.println("A입니다.");
		}
	}
	
}
