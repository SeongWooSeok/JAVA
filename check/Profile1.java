package check;

import java.util.Scanner;

public class Profile1 {

	public static void main(String[] args) {
		String name = "홍길동";
		int studentName = 2018122104;
		int height = 178;
		String s = "male";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("남자면 1 여자면 2를 입력해주세요.");
		int an = scanner.nextInt();
		if(an==2) {
			System.out.println("여자라서 홍길동이 될 수 없습니다.");
		}else {
		System.out.println(name+ " : "+ " "+ studentName+ " " + height + " "+  s);
		}
		
		

	}

}
