package study09;

import study03.Book;

class People{
	String name;
	public void setName(String name) {
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println(name+"사람");
	}
	
	public void eatFood() {
		System.out.println(name+" 음식을 먹습니다.");
	}
}

class Male extends People{
	@Override
	public void showInfo(){
		//super.showInfo();
		System.out.println(name+"남자");
	}
}

class Female extends People{
	@Override
	public void showInfo() {
		//super.showInfo();
		System.out.println(name+"여자");		
	}
}

public class PersonRun {
	public static void main(String[] args) {
		
		Male m = new Male();
		Female f = new Female();
		m.showInfo();
		f.showInfo();
		
		People pp1 = new Male(); //업캐스팅
		pp1.showInfo();
		People pp2 = new Female();
		pp2.showInfo();
		pp1.eatFood();
		pp2.eatFood();
		
		//instance of
		if(pp1 instanceof Female) {
			System.out.println("Female instance");
		}
		if(pp1 instanceof Male) {
			System.out.println("Male instance");
		}
		if(pp1 instanceof People) {
			System.out.println("People instance");
		}
		if(pp1 instanceof Object) {
			System.out.println("Object instance");
		}
		
		People[] pArr = new People[3];
		pArr[0]=new People();
		pArr[1]=new Male();
		pArr[2]=new Female();
		for(int i=0; i<pArr.length; i++) {
			pArr[i].showInfo();
		}
		
		whoAreYou(pp1);
		whoAreYou(pp2);

		//다운 캐스팅
		People p2 = new Male();
		Male m2 = (Male)p2;
		m2.showInfo();
		//Male m3 = new People();
		//Female f2 = (Female)new Book(); 
	}
	
	public static void whoAreYou(People p) {
		p.setName("선미");
		p.showInfo();
	}
}