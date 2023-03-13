package study10_2;

public class AdvencedLevel implements PlayerLevelInteface {

	@Override
	public void run() {
		System.out.println("run!");
	}

	@Override
	public void jump() {
		System.out.println("jump");
	}

	@Override
	public void turn() {
		System.out.println("turn!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("AdvencedLevel>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.println("*hack^&*>><<");
	}

	@Override
	public void slash() {
		System.out.println("~slash^^--<<>>");
	}

}
