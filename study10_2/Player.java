package study10_2;

public class Player {
	private PlayerLevelInteface level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevelInteface getLevel() {
		return level;
	}
	
	public void levelUp() {
		if(level instanceof BeginnerLevel) {
			level= new AdvencedLevel();
		}else if(level instanceof AdvencedLevel){
			level = new SuperLevel();
		}
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
