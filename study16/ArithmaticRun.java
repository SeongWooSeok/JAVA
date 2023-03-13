package study16;

public class ArithmaticRun {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);		
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다");
		}
		
		try {
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("안됨");
		}
		
		try {
			System.out.println(5/0);	
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);		
		} catch (ArithmeticException e){
			System.out.println("0으로 나눌수없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("5번째 배열이 없습니다");
		}finally {
			System.out.println("무조건 실행됨");
		}
		
		try {
			System.out.println(5/0);	
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 원인: "+e.getMessage());
			System.out.println(e.toString());
		}finally {
			System.out.println("무조건 생성");
		}
	}
}
