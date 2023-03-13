package study01;

import java.util.Iterator;

public class Conditional {

	public static void main(String[] args) {
		int age = 13;
		int charge = 0;
		
		if(age <1 ) {
			charge = 0;
			System.out.println("영유아");
		} else if(age <14) {
			charge = 500;
			System.out.println("어린이");
		}else if(age < 20) {
			charge = 800;
			System.out.println("청소년");
		}else {
			charge =1000;
			System.out.println("어른");
		}
		System.out.println("교통비 : "+ charge +"원");
		
		
		int rank =1;
		String medalColor;
		
		switch (rank) {
		case 1:
				medalColor = "금메달";
				break;
		case 2:
				medalColor = "은메달";
				break;
		case 3:
				medalColor = "동메달";
				break;
		default:
			medalColor="없음";

		}
		

		System.out.println(rank+"등 메달:"+medalColor);
	
		String[] args2 = new String[args.length + 1];
		System.arraycopy(args, 0, args2, 0, args.length);
		args2[args.length] = medalColor;
	}
	

}
