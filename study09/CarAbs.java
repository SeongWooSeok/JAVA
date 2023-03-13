package study09;

public abstract class CarAbs {
	public abstract void drive(); //추상메서드
	public abstract void stop(); //추상메서드
	public abstract void turnOn(); //추상메서드
	public abstract void turnOff(); //추상메서드
	
	//템플릿 메소드
	//동작을 미리 정리
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
