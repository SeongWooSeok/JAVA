package study18;

import java.util.ArrayList;
import java.util.Arrays;

import study01.Sysout;

//함수형 인터페이스
//@FunctionalTinteface
interface StringEx1{
	String showInfo(String str);
}
interface StringEx2{
	int showInfo(String str);
}
interface StringEx3{
	int showInfo(String str, int index);
}
interface StringEx4{
	String showInfo(String str, int startIndex, int endIndex);
}
interface SimpleCal{
	public int calc(int first, int second);
}
public class LamdaRun {
	public static void main(String[] args) {
		//익명이너클래스
		//파라미터 길이, 맨 앞자리 글자만 반환
		StringEx1 se1 = new StringEx1() {
			@Override
			public String showInfo(String str) {
				return "길이: " + str.length() + " 첫번째: " + str.substring(0, 1) ;
			}
		};
		System.out.println(se1.showInfo("안녕하세요"));
		
		//람다식
		StringEx1 se2 = (String str)->{return "길이: " + str.length() + " 첫번째: " + str.substring(0, 1) ;};
		se2 = str ->str.length()+" "+str.charAt(0);
		System.out.println(se2.showInfo("너두 나두"));
		
		SimpleCal sc =(first, second)-> first + second;
		SimpleCal sc2 =(first, second)->first - second;
		System.out.println(sc.calc(5, 1));
		System.out.println(sc2.calc(5, 1));
		
		//참조타입으로 변환 (::)
		//메서드 참조
		//클래스 이름::메서드이름 or 참조변수명::메서드이름
		StringEx2 se3 = str->str.length();
		se3 = String::length;
		StringEx3 se4 = (str , index)->str.charAt(index);
		se4 = String::charAt;
		StringEx4 se5 = (str, startIndex, endIndex)->str.substring(startIndex,endIndex);
		se5 = String::substring;
		String str ="참조타입의 사용법 익히기";
		System.out.println(se3.showInfo(str));
		System.out.println(se4.showInfo(str, 0));
		System.out.println(se5.showInfo(str,0 , 1));
		
		
		//생성자 참조
		//클래스명::new
		
		/*
		 * () -> {}
		 * () -> 1
		 * () -> {return 1;}
		 * 
		 * (int x) -> x+1
		 * (x) -> x+1
		 * x -> x+1
		 * 
		 * (int x, int y ) ->xy
		 * (x,y) -> x+y
		 * 
		 * (String str) -> str,length()
		 * str -> str.length()
		 */
		
		TempEx temp = a-> new TempClass(a);
		//temp = TempClass::new;
		temp.showInfo(1);
	}
}
@FunctionalInterface
interface TempEx{
	TempClass showInfo(int temp);
}
class TempClass{
	TempClass(int a){
	System.out.println("발생"+a);
	}
}
