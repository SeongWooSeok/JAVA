package study07;

class Animal{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	void sleep() {
		System.out.println("zzz");
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println("그르렁 그르렁");
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}
}

class Cat extends Animal{
	void sleep() {
		System.out.println("야옹");
	}
}

class Human extends Animal{
	void sleep() {
		System.out.println("나는 사람인데?");
	}
}

class PetDog extends Dog{

	@Override //anotation
	void sleep() {
		System.out.println(name + "는 골골 집에서 잡니다. ");
	}
	
}

public class AnimalRun {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		Cat cat = new Cat();
		cat.setName("야용이");
		System.out.println(cat.name);
		cat.sleep();
		 Human human = new  Human();
		 human.setName("사람");
		System.out.println(human.name);
		human.sleep();
		PetDog pd = new PetDog();
		pd.setName("해피");
		pd.sleep();
		
	}

}
