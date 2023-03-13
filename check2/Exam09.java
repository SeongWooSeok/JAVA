package check2;

class MineralCalculator{
	int value = 0;
	
	public void add(Mineral min) {
		value+= min.getValue();
	}
	
	public int getValue() {
		return value;
	}
}

public class Exam09 {
	public static void main(String[] args) {
			MineralCalculator cal = new MineralCalculator();
			cal.add(new Gold());
			cal.add(new Silver());
			cal.add(new Bronze());
			System.out.println(cal.getValue()); //270
	}
}
