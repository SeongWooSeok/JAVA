package test1;

public class Exam04 {

	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Math.random());
		//2개의 주사위를 던졌을때 눈의 합의 값이 5 코드 정지
		//합의 값이 12가 나오면 감탄사 던질때마다 나오는 값을 출력
		while(true) {
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		int sum = a+b;
		System.out.println("DICE GAME");
		System.out.printf("ROLLING... [%d,%d]\n" ,a ,b);
		Thread.sleep(500);
		if(sum==5) {
			System.out.println("주사위합이 5가나와서 주사위 게임을 멈춥니다.");
			break;
		}
		if(sum==12) {
			System.out.println("주사위 2개의 최고합이 나왔어요!!");
			continue;			
		}
		}
	}

}
