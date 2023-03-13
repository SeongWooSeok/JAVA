package study10_3;

import java.util.ArrayList;

public class Coperation {
	String name;
	ArrayList<Developer> devs;
	
	public Coperation() {};
	public Coperation(String name) {
		this.name= name;
		this.devs= new ArrayList<Developer>();
	}
	
	public int salaryExpan() {
		int sum = 0;
		for ( Developer dev : devs) {
			sum+=dev.salary();
		}
		return sum;
	}

	void showinfo() {
		for ( Developer dev : devs) {
			dev.showinfo();
		}
	}

}
