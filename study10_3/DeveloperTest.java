package study10_3;

public class DeveloperTest {

	public static void main(String[] args) {
		Developer tom = new Developer("Tom", 5);
		Developer john = new Developer("John", 8);
		tom.showinfo();
		john.showinfo();
		
		System.out.println("===========================");
		
		Coperation corp = new Coperation("Google");
		//corp.devs.add(new Developer("Ricky",10));
		corp.devs.add(new Developer("James", 1));
		//corp.devs.add(new Developer("Kate", 4));
		corp.devs.add(new Developer("Paul", 10));
		corp.showinfo();
		
		
		System.out.println("연봉지출 : " + corp.salaryExpan() +"만원");
	}

}
