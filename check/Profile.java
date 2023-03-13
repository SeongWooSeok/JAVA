package check;

import java.util.Scanner;

public class Profile {
	private String name;
	private int studentNumber;
	private int height;
	private String gender;
	
public Profile() {}


public Profile(String name, int studentNumber, int height, String gender) {
	this.name= name;
	this.studentNumber = studentNumber;
	this.height = height;
	this.gender = gender;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStudentNumber() {
	return studentNumber;
}
public void setStudentName(int studentNumber) {
	this.studentNumber = studentNumber;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Profile [name=" + name + ", studentNumber=" + studentNumber + ", height=" + height + ", gender=" + gender
			+ "]";
}

public void scnnerProfile() {
	Scanner scan = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	String name = scan.next();
	System.out.println("학번을 입력하세요");
	int studentNumber = scan.nextInt();
	System.out.println("키를 입력하세요");
	int height = scan.nextInt();
	System.out.println("성별을 입력하세요");
	String gender = scan.next();
	System.out.println("이름 :"+ name + " 학번 :"+studentNumber+" 신장 :"+height+ " 성별 :"+ gender );
}

public void printProfile() {
	System.out.println("이름 :"+ name + " 학번 :"+studentNumber+" 신장 :"+height+ " 성별 :"+ gender );
}

}

