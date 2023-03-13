package study02;

class Birthday{
	//필드 멤버변수
	private int date;
	private int month;
	private int year;
	//생성자
	public Birthday() {
		this.year=1980;
		this.month=3;
		this.date=8;
	}
	
	public Birthday(int year, int month,int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}
	
	//변수관련 메소드 getter setter
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Birthday [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

}

public class BirthData {
	public static void main(String[] args) {
		Birthday birthday = new Birthday();
		Birthday birthday2 = new Birthday(2000,10,28);
		birthday.setYear(1990);
		System.out.println(birthday.toString());
		System.out.println(birthday2);
	}
}
