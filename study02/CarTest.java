package study02;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		//c.carNum -> private 접근불가
		car.getCarNum();
		int speed = car.speed;
		System.out.println(speed);
		int speed2 = car.speed2;
		System.out.println(speed2);
		
	}

}
