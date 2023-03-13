package study02_1;

import study02.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		//c.carNum -> private 접근불가
		car.getCarNum();
	
		/*
		int speed = car.speed;
		System.out.println(speed);
		int speed2 = car.speed2;
		System.out.println(speed2);
		*/
		//protected 와 default가 같다고 생각할 수 있지만(외부패키지 사용불가)
		//상속관계가 생기면 protected는 다른곳에서도 사용가능

	}

}
