package study14;

import java.util.HashSet;

public class HashSetMachRun {
	public static void main(String[] args) {
		HashSet<String> hst = new HashSet<>();
		hst.add("HI");
		hst.add("HI");
		hst.add("hI");
		System.out.println(hst.size());
		System.out.println(hst);
		
		HashSet<Food2> hs2 = new HashSet<>();
		Food2 f1 = new Food2("떡볶이","분식");
		Food2 f2 = new Food2("떡볶이","분식");
		hs2.add(f1);
		hs2.add(f2);
		System.out.println(f1.equals(f2));
		System.out.println("f1.hashcode() : " + f1.hashCode());
		System.out.println("f2.hashcode() : " + f2.hashCode());
		System.out.println(hs2.size());
	}
}

class Food1{
	String foodName;
	String foodKind;
	Food1(String name, String kind){
		this.foodName = foodName;
		this.foodKind=foodKind;
	}
}

class Food2{
	String foodName;
	String foodKind;
	
	Food2(String name, String kind){
		this.foodName = name;
		this.foodKind=kind;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() call");
		if(obj instanceof Food2) {
			Food2 temp = (Food2)obj;
			return this.foodName.equals(temp.foodName)&&this.foodKind.equals(temp.foodKind);
		}else {
			return false;
		}
	}
}
class Food3{
	String foodName;
	String foodKind;
	
	Food3(String name, String kind){
		this.foodName = name;
		this.foodKind=kind;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() call");
		if(obj instanceof Food3) {
			Food3 temp = (Food3)obj;
			return this.foodName.equals(temp.foodName)&&this.foodKind.equals(temp.foodKind);
		}else {
			return false;
		}
		
	}
	@Override
	public int hashCode() {
		System.out.println("Food3 hashCod() call");
		return(foodName+foodKind).hashCode();
	}
}

