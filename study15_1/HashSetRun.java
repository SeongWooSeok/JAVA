package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetRun {
	public static void main(String[] args) {
		//set에서 순서를 보장하고 싶을 경우
		//Arraylist로 변환후 collections에 sort를 사용할 수 있다.
		//HashSet을 Treeset(이진트리기법)으로 변환하면 가능
		
		//객체 생성
		Set<String> hset1 = new HashSet<>();
		HashSet<String> hset2 = new HashSet<>();
		
		//추가
		hset1.add("일식이");
		hset1.addAll(Arrays.asList("이식이","삼식이","사식이","오식이"));
		
		//다른 객체로 내용 이동
		hset2.addAll(hset1);
//		TreeSet<String> ts = new TreeSet<>(hset2);
//		ts.addAll(hset2);
//		
//		//반복
//		Iterator<String> itr = ts.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
//		//삼식이 있는지 확인하고 있으면 구식이 추가 없으면 오식이 삭제
//		System.out.println();
//		if(ts.contains("삼식이")) {
//			ts.add("구식이");
//			System.out.print(ts+" ");
//		}else{
//			hset2.remove("오식이");
//			System.out.print(ts+" ");
//		}
//		System.out.println();
//		//배열로 변환해서 반복문 출력
//		String[] str = ts.toArray(new String[0]);
//		for(String num1 : str) {
//			System.out.print(num1+" ");
//		}
		
		//hashset을 arraylist로 바꿔서 하는 방법
		ArrayList<String> al = new ArrayList<>(hset2);
		
		for(int i = 0; i<al.size(); i++) {
			System.out.print(al.get(i)+ " ");
		}
		System.out.println();
		for(String num : al) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		Iterator<String> al2 = al.iterator();
		while(al2.hasNext()) {
			System.out.print(al2.next()+" ");
		}
		
		System.out.println();
		if(al.contains("삼식이")) {
			al.add("구식이");
			System.out.println(al);
		}else{
			al.remove("오식이");
			System.out.println(al);
		}
		//indexOf() 사용가능 -1 
		
		System.out.println();
		String[] str = al.toArray(new String[0]);
		for(String num1 : str) {
			System.out.print(num1+" ");
		}

	}

}
