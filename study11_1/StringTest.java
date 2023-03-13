package study11_1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTest {
		public static void main(String[] args) {
				byte[] bytes = {73,32,108,111,118,101,32,121,111,117};
				String str = new String(bytes);
				System.out.println(str);
				str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
				
				//"자바" 라는 단어가 없으면 "자바 없음"
				//"자바" 라는 단어가 있으면 "JAVA"로 바꿔서 출력
				if(str.contains("자바")) {
					String restr = str.replace("자바", "JAVA");
					System.out.println(restr);
				}else {
					System.out.println("자바없음");
				}
				
				str = "1,2,3,4,5,6,7,8,9,10";
				//한개의 문자열을 다 쪼개서 숫자만 다 합친 결과 값
				//1. split()  메서드 사용
				String[] num = str.split(",");
				int sum=0;
//				for(int i =0; i<num.length; i++) {
//						sum+=Integer.parseInt(num[i]);
//					}
				for(String s : num) {
					sum+=Integer.parseInt(s);
				}
				System.out.println(sum);
				sum = 0;
				//2. StringTokenizer 사용
				StringTokenizer stk = new StringTokenizer(str,",",false);
				while(stk.hasMoreTokens()) {
					int temp = Integer.parseInt(stk.nextToken());
					System.out.println(temp);
					sum+=temp;
				}
				System.out.println(sum);
		}
}
