package study15_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import study15.Member;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영단어 하나를 입력해주세요 : ");
		String a = scan.next();
		System.out.println("두번째 영단어를 입력해주세요 : ");
		String b = scan.next();
		boolean result = isAnagram(a,b);
		System.out.println("두 단어는 ");
		System.out.println(result?"Anagram.": "Anagram이 아니다.");
		
	}

	public static boolean isAnagram(String a, String b) {

//		char[] ac = a.toCharArray();
//		char[] bc = b.toCharArray();
//		Arrays.sort(ac);
//		Arrays.sort(bc);
//		System.out.println(ac);
//		System.out.println(bc);
//		System.out.println(ac.equals(bc));
//		System.out.println(Arrays.equals(ac, bc));
//		if(Arrays.equals(ac, bc)) {
//			return true;
//		}else {
//			return false;
//		}
		
		String[] stra = a.split("");
		String[] strb = b.split("");
		ArrayList<String> al = new ArrayList<>(Arrays.asList(stra));
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList(strb));
		Collections.sort(al);
		Collections.sort(al2);
		return(al.equals(al2))? true : false;
	}
	
}
