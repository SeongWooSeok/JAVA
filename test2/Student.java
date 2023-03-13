package test2;

public class Student {
	private final String name;
	private final boolean isMale;
	private final	int grade;
	private final	int ban;
	private final	int score;
	
	//멤버변수를 매개변수로 사용하는 생성자
	public Student(String name, boolean isMale, int grade, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.score = score;
	}

	//toString
	@Override
	public String toString() {
		return String.format("[%s,%s,%d학년,%d반,%3d점", name, isMale?"남":"여", grade, ban, score);
	}
		
	//getter setter
	public String getName() {
		return name;
	}
	public boolean isMale() {
		return isMale;
	}
	public int getGrade() {
		return grade;
	}
	public int getBan() {
		return ban;
	}
	public int getScore() {
		return score;
	}
	
	
	
	
	
}
