package check2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Avg {
	public static void main(String[] args) {
		int ko = 80;
		int en = 75;
		int ma = 55;
		
		int avg = (ko+en+ma)/3;
		System.out.println("평균은 : " + avg);
		
		// ==================================
		
		int[] num = {9,12,13,21,16,13};
		int sum1 = 0; //짝수 합
		int sum2 = 0;//홀수 합
		
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				sum1+=num[i];
			}else {
				sum2+=num[i];
			}
		}
		System.out.println("짝수의 합: " + sum1 + " 홀수의 합: "+ sum2);
		
		//==================================
		
		String str = "871130-146217";
		String[] num1 = str.split("-");		
		String front = num1[0];
		String back = num1[1];
		String gender ="";
		
		if(back.substring(0).contains("1") || back.substring(0).contains("3")) {
			gender = "남자";
		}else {
			gender = "여자";
		}
		
		String year = front.substring(0, 2);
		String month = front.substring(2,4);
		String day = front.substring(4, 6);
		
		System.out.println(year + "년 "+ month +"월 " + day+"일 " + " 성별: "+ gender);
		
		//=================================
		
		String str1 = "a:b:c:d";
		String str2 = str1.replace(":" ,"#");
		System.out.println(str2);
		
		//==================================
				
		int[] num3 = {21,16,13,14,12,9};
		int[] reversenum3 = new int[6];
		
		for(int i = num3.length-1 , j=0; i>=0;  i--, j++) {
			reversenum3[j] = num3[i];
		}
		System.out.println(Arrays.toString(reversenum3));
		
		
	}

}
