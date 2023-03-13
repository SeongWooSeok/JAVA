package study10_3;

public class Developer {
	private String name;
	private int career;
	
	public Developer() {};
	public Developer(String name, int career) {
		this.name = name;
		this.career = career;
	}
	
	public String getName() {
		return name;
	}
	
	int level(int career) {
		if(career>=7) {
			return 4500;
		}else if(career<7) {
			return 3500;
		}else {
			return 2800;
		}
	}
	
	int salary() {
		return level(this.career) + 100*this.career;
	}
	
	void showinfo() {
		int money = salary();
		System.out.println("당신의 연봉은 "+ money);
	}
	
}
