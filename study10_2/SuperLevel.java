package study10_2;

public class SuperLevel implements PlayerLevelInteface {
	@Override
	public void run() {
		System.out.println("run fast!");
	}

	@Override
	public void jump() {
		System.out.println("super jump");
	}

	@Override
	public void turn() {
		System.out.println("super turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("SuperLevel>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.println("*hack^&*그냥쎔");
	}

	@Override
	public void slash() {
		System.out.println("~slash--<>겁나쎔");
	}
}
