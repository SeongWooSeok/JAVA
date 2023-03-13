package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetCalPrac {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6));
		ArrayList<Integer> intersaction = new ArrayList<>(); //교집합
		ArrayList<Integer> union = new ArrayList<>(); //합집합
		ArrayList<Integer> subtraction = new ArrayList<>(); //차집합
	
		//removeall(차집합) addall(합집합) retainall(교집합)
		intersaction.addAll(list1);
		union.addAll(list1);
		subtraction.addAll(list1);
	
		intersaction.retainAll(list2);
		union.addAll(list2);
		TreeSet<Integer> ts = new TreeSet<>(union);
		subtraction.removeAll(list2);
	
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("교집합" +intersaction);
		System.out.println("합집합" +ts);
		System.out.println("차집합" +subtraction);
		
	}
}
