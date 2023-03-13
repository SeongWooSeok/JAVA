package study07;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.getSpeed();//protected 동일패키지에서는 접근 가능
		c.getCarNum(); //private는 외부 클래스에서 접근 불가능
		
		int speed = c.speed;
		System.out.println(speed);
	}
}
