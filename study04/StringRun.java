package study04;

import java.util.Arrays;
import java.util.StringTokenizer;

import study01.Sysout;

public class StringRun {
	public static void main(String[] args) {
		//String class
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		String str3 = "bcd";
		String str4 = "bcd";
		System.out.println(str3==str4);
		System.out.println(str1);
		System.out.println(str1.toString());
		
		//equals()
		System.out.println(str1.equals(str2));
		String  e ="HelloJava!";
		//indexOf() 해당 문자열의 시작 인덱스
		System.out.println(e.indexOf("Jav"));
		//contains() 해당 문자열의 포함여부
		System.out.println(e.contains("Hello"));
		//charAt() 특정 위치의 문자 변환
		System.out.println(e.charAt(4));
		//replaceAll() 특정 문자열의 교체한 문자열 반환
		System.out.println(e.replace("Java", "HTML"));
		String f = e.replace("Java", "HTML");
		System.out.println(f);
		//subString() 문자열의 특정 부분 추출
		System.out.println(e.substring(1));
		//toUpperCase(), toLowerClass
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		System.out.println(e.toString());
		//comparedTo(), compareToIgnoeCaseS
		//문자열을 비교하여 같다면 0 작으면 양수 반환
		String str = new String("abcd");
		System.out.println(str.compareTo("bcde"));
		System.out.println(str.compareTo("abcd"));
		
		System.out.println(str.compareTo("ABCD"));
		System.out.println(str.compareToIgnoreCase("ABCD"));
		
		//concat() 문자열을 추가하여 새로운 문자열 변환
		System.out.println(e.concat(str));
		System.out.println(e+str);
		int num1 = 3, num2 = 4;
		String str5 = "5", str6 = "6";
		char ch1='4', ch2='5';
		System.out.println(num1 + num2);
		System.out.println(str5 + str6);
		System.out.println(str5+num1);
		System.out.println(num1+str5);
		System.out.println(ch1+ch2);
		System.out.println(ch1+num2);
		System.out.println(num2+ch1);
		System.out.println(5+ " " +3);
		
		//trim() 문자열의 맨앞 맨뒤의 공백 제거
		String g = "      Java    Java      ";
		System.out.print("|||");
		System.out.print(g.trim());
		System.out.println("|||");
		//length() 길이 확인 isEmpty() 내용이 있는지 없는지 boolean타입으로 반환
		System.out.println(g.length());
		System.out.println(g.isEmpty());
		
		String test = "이 문장은 문자열-입니다./This is the String.";
		String[] token = test.split(" ");
		System.out.println(Arrays.toString(token));
		token = test.split("");
		System.out.println(Arrays.toString(token));
		token = test.split("/");
		System.out.println(Arrays.toString(token));
		token = test.split("-");
		System.out.println(Arrays.toString(token));
		
		//StringTokenizer class
		//기본
		//StringTokenizer stk = new StringTokenizer(test);
		//구분자를 포함 제외
//		StringTokenizer stk = new StringTokenizer(test , "-");
		StringTokenizer stk = new StringTokenizer(test , "-",true);
		System.out.println(stk.countTokens());
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
		
		
	}

}
