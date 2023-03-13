package check2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baseballgame {
	public static void main(String[] args) {
			
			Random random = new Random();
			Scanner scan = new Scanner(System.in);
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			 //중복되지않는 세개의 수를 배열에 생성
			int[] num1 = new int[3];
			for(int i =0; i<num1.length; i++) {
				num1[i] =  random.nextInt(9)+1;
					if(num1[0] == num1[1] || num1[0] == num1[2] || num1[1] == num1[2]) {
						continue;
				}
			}
			
			//맞출때까지 무한반복
			while(true) {
			strike = 0;
			ball = 0;
			out = 0;
			System.out.println("세개의 숫자를 적어주세요 : ");
			String a = scan.next();
			//받은 숫자 분리
			String b = a.substring(0,1);
			String c = a.substring(1,2);
			String d = a.substring(2);
			
			//String배열로 받은 수를 int로 변환
			int comb = Integer.parseInt(b);
			int comc = Integer.parseInt(c);
			int comd = Integer.parseInt(d);
			
			// 받은 숫자와 생성된 숫자 비교 (for문 변경 가능할듯 방법이 헷갈림)
				if(num1[0]==comb) {
					strike++;
				}else if(num1[1] == comb || num1[2] == comb) {
					ball++;
				}else {
					out++;
				}
				if(num1[1]==comc) {
					strike++;
				}else if(num1[0] == comc || num1[2] == comc) {
					ball++;
				}else {
					out++;
				}
				if(num1[2]==comd) {
					strike++;
				}else if(num1[0] == comd || num1[1] == comd) {
					ball++;
				}else {
					out++;
				}
				System.out.println(strike + "스트라이크 "+ ball +"볼 " + out +"아웃입니다.");
				System.out.println("전부 스트라이크가 날때까지 다시 입력해보세요.");
				if(strike == 3) {
					System.out.println("전부 스트라이크입니다!!");
					break;
				}
			}
			
	}
}
