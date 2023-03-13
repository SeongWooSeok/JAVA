package study07;

class Parent{
	int age;
	String name;
	
	public Parent(){
		name = "parent";
		System.out.println("Parent() run");
	}
	
	public Parent(int age, String name) {
		this.age = age;
		this.name=name;
		System.out.println("parent(param) run");
	}
	
	public void showInfo() {
		System.out.println("이름: " + name+"/나이: "+ age);
	}
}

class Child extends Parent{
	
	String name="장미";
	
	Child(){
		System.out.println("Child() run");
	}
	
	Child(int age, String name){
		//super(age,name);
		this.age=age;
		this.name=name;
		System.out.println("Child(param) run");
	}
	
	//showinfo 오버라이드
	@Override
	public void showInfo() {
		//super.showInfo();
		System.out.println("이름:"+name+"("+ age+")");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.showInfo();
		System.out.println(c1.name);
		Parent p = new Child();
		p.showInfo();
		System.out.println(p.name);
		Child c = new Child(10,"마리");
		c.showInfo();
	}
}
