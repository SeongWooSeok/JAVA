package study06;

public class MethodRun {
	
	public String sayHi(){
		return "hi";
	}
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sayNickname(String nick) {
		if("asshole".equals(nick)) {
			return;
		}else {
			System.out.println("My nicknames is "+ nick);
		}
	}
	
	public static void main(String[] args) {
		//사용할 메소드를 포함한 클래스의 객체를 생성
		MethodRun mr = new MethodRun();
		//해당 메소드를 호출
		//반환값 변수명 = 객체.메소드명()
		String res = mr.sayHi();
		System.out.println(res);
		mr.sum(10, 11);
		mr.sayNickname("rick");
		mr.sayNickname("asshole");
		
	}
}
