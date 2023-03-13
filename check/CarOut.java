package check;

import study07.Car;

public class CarOut {

	public static void main(String[] args) {
		Car c = new Car();
		c.getCarNum(); // public
		// c.CarNum(); private 외부 접근 불가
		//protected , default도 똑같음
	}

}
