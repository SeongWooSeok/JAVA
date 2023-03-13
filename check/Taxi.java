package check;

import study07.Car;

public class Taxi extends Car{
	Taxi(){
		super();
		//this.CarNum();//상속받아도 private이기때문에 사용불가
		//int speed = this.speed2;//default이기때문에 사용불가
		this.getSpeed();//protected 외부여도 상속받았기 때문에 사용가능
		this.getCarNum();//public
	}
	
	public static void main(String[] args) {
		

	}

}
