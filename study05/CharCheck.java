package study05;

import java.util.Scanner;

public class CharCheck {
	//String 자음 모음 개수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영단어 하나를 입력해주세요 : ");
		String in = scan.nextLine();
		int con=0; //consonants 자음
		int vow=0;//vowels 모음 aeiou
		String check = in.toLowerCase();
		
		for(int i = 0; i<check.length(); i++) {
			char c = check.charAt(i);
			if(c>='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vow++;
				}else {
					con++;
				}				
			}
		}
		System.out.println("모음 갯수 : "+vow +" 자음 갯수 : " +con);
	}

}
