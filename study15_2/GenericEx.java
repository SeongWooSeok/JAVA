package study15_2;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericEx {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3};
		String[] strArr = {"Hello","world"};
		
//		Integer[] arr2 = new Integer[strArr.length];
//		
//		for(int i = 0; i<arr2.length; i++) {
//			arr2[i] = strArr[i];
//		}

		printArray(intArr);
		printArray(strArr);
	}
	
	static <T> void printArray(T[] inputArray) {
		for(T num : inputArray) {
			System.out.println(num);
		}
	}
	
}
