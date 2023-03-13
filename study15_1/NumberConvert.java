package study15_1;

import java.util.*;

public class NumberConvert {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,3,2,1,1,2,9,6,4,7,3,5,8,10,4));
		//중복제거, 오름차순 정렬
		TreeSet<Integer> numbers2 = new TreeSet<>(numbers);
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		System.out.println();
		//역순 decending 사용 navigableset으로 받음
		
		//랜덤(1~10사이의 숫자)으로 20개의 숫자를 list에 저장하고
		//중복제거 오름차순 내림차순으로 출력
		Random rd = new Random();
		ArrayList<Integer> al = new ArrayList<>();
		while(al.size() !=20) {
			al.add(rd.nextInt(10)+1);
		}
		System.out.println(al);
		HashSet<Integer> hs = new HashSet<>(al);
		System.out.println(hs);
		NavigableSet<Integer> ns = new TreeSet<Integer>(hs).descendingSet();
		System.out.println(ns);
		
	}
}
