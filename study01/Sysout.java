package study01;

import java.util.Scanner;

public class Sysout {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력:");
		int line = scan.nextInt();
		System.out.println(line);
		
		
		/*System.out.println("출력1");
		System.out.print("출력2");
		System.out.println("\n");
		System.out.println("출력3");
		System.out.println("\n");
		
		String world = "World";
		String java = "java";
		System.out.printf("Hello, %s, %s %n", world,java);
		
		int dan =2 ;
		while(dan<=9) {
			int t=1;
			while(t<=9) {
				System.out.println(dan +"x"+t+"="+(dan*t));
				t++;
			}
			System.out.println();
			dan++;
		}
		*/

	}

}
