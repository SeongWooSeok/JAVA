package study06;

import java.util.Scanner;

public class Car {

	private String name;
	private String model;
	private int size;
	
	public Car() {}
	
	public Car(String name, String model, int size) {
		this.name = name;
		this.model = model;
		this.size = size;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void acceleration() {
		System.out.println("가속합니다!");
	}
	
	public void deceleration() {
		System.out.println("감속합니다!");
	}
	
	public void gearchange() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~4단까지 존재합니다. 1~4사이의 숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		if(num<1 || num>4) {
			System.out.println("1~4이외의 숫자를 입력하셨습니다.");
		}else {
			System.out.printf("%d단입니다.", num);
		}
	}
	
	
	
}
