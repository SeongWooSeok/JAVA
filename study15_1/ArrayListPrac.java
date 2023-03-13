package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPrac {
	public static void main(String[] args) {
		//객체
		ArrayList<String> al = new ArrayList<>(Arrays.asList("일식이","이식이","삼식이","사식이","오식이","육식이","칠식이"));
		//내용 추가
		//반복구문 출력
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
