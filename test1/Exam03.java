package test1;

public class Exam03 {

	public static void main(String[] args) {
		//A class에 10명의 학생이 성적이 아래와 같다면 평균 값은?
		int[] scores = {70,60,55,75,95,90,79,80,85,100};
		int sum =0, sum1=0;
		double avg =0 ,avg1=0;
		
		for(int i=0; i<scores.length; i++) {
				sum+=scores[i];
		}
		avg = (double)sum/scores.length;
		System.out.printf("평균: %.3f ",avg);
		System.out.printf("\n");
		
		for(int s : scores) {
			sum1+=s;
		}
		avg1=(double)sum1/scores.length;
		System.out.printf("평균: %f ",avg1);
	}

}
