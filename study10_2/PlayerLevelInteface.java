package study10_2;

public interface PlayerLevelInteface {
	
	
	void run();
	void jump();
	void turn();
	void showLevelMessage();
	void hack();
	void slash();
	
	default void go(int count) {
		run();
		jump();
		for(int i =0; i<count; i++) {
			hack();
			slash();
		}
		turn();
		System.out.println();
	}
}
