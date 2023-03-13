package study06;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.gearchange();
		car1.acceleration();
		Car car2 = new Car("이름","모델",10);
		car2.gearchange();
		car2.deceleration();

	}

}
