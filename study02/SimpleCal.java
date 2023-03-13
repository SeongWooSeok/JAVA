package study02;

class Calculator{
	//생성자 -> 객체 생성
	//Calculator(){};
	//필드 -> 속성
	private int result=0;
	static int mem =3;
	//메소드 -> 기능
	int add(int num) {
		result +=num;
		return result;
	}
	
}

public class SimpleCal {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal);
		Calculator cal2 = new Calculator();
		System.out.println(cal2);
		int sum=cal.add(5);
		System.out.println(sum);
		int sum1=cal2.add(5);
		System.out.println(sum);
		//System.out.println(cal.result);
		
		System.out.println(cal.mem);
		System.out.println(cal2.mem);
		cal.mem=10;
		System.out.println(cal.mem);
		System.out.println(cal2.mem);
		
		if(cal==cal2) {
			System.out.println("둘은 같습니다.");
		}else {
			System.out.println("둘은 같지 않습니다.");
		}
		
		int a =5;
		int b =5;
		if(a==b) {
			System.out.println("둘은 같습니다.");
		}else {
			System.out.println("둘은 같지 않습니다.");
		}
		
	}

}
