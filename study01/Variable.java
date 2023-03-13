package study01;

public class Variable {
	public static void main(String[] args) {
		//변수 선언
		int num = 10;
		System.out.println(num);
		
		//진수 표현
		int binNum = 0B1010;
		System.out.println(binNum);
		int octNum = 013;
		System.out.println(octNum);
		int hexNum = 0x1A;
		System.out.println(hexNum);
		
		/*String binary = Integer.toBinaryString(num);
		System.out.println("2진수:" + binary);*/			
		
		//변수명 가독성
		int mp; //멤버쉽포인트
		int membershipPoint;
		
		byte byteData = -128;
		System.out.println(byteData);
		byteData = (byte)-129;
		System.out.println(byteData);
		
		int integerNum = 1234567;
		long longNum = 22324123412L;
		
		char ch = 'A';
		System.out.println(ch);
		ch = 66;
		System.out.println(ch);
		int chin = 'A';
		System.out.println(chin);
		
		double doubleNum = 3.14;
		float floatNum = 3.14F;
		System.out.println(doubleNum);
		System.out.println(floatNum);
		
		final double PI = 3.1419; // 상수
		/* pi = 3,33333;  final로 상수가 되었으므로 변경하려면 오류가 뜸*/
		
		int iNum = binNum;
		System.out.println(iNum);
		iNum = (int)longNum;
		System.out.println(iNum);
		
	}

}
