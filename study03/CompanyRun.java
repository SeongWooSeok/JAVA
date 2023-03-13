package study03;

public class CompanyRun {

	public static void main(String[] args) {
		//Company comp = new Company(); 
		//Company라는 생성자가 private이기때문에 new를 해서 객체생성이 불가능하다
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());

	}

}
