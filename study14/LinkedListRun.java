package study14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRun {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("재영");
		list.add("홍근");
		list.add("선미");
		list.add(2,"현도");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove());
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.size());
		list.set(1, "수연");
		System.out.println(list);
		System.out.println(list.contains("홍근"));
		System.out.println(list.indexOf("미진"));
		list.clear();
		System.out.println(list);
		
		LinkedList<String> list2 = new LinkedList<>(Arrays.asList("예진", "민성","현우","시우","지민","정기"));
		System.out.println(list2);
		LinkedList<String> list3 = new LinkedList<>(List.of("예진", "민성","현우","시우","지민","정기"));
		System.out.println(list3);
		
		System.out.println(list3.poll());
		System.out.println(list3);
		System.out.println(list3.pollLast());
		System.out.println(list3);
		
		
		
	}
}
