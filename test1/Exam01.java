package test1;

public class Exam01 {

	public static void main(String[] args) {
		//1~100까지 정수중에서 3의 배수의 총합을 구하시오.
		int sum= 0;
		
		for(int i=1; i<=100; i++ ) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.printf("3의 배수의 총합: %d", sum);
		
		/*
		 * Systema.out.printf(format, arguments)
		 * %n : 줄밖ㅁ
		 * %s : String
		 * %d : int
		 * %f : floast
		 * %t : date
		 * %b : boolean
		 * */
	}

}
