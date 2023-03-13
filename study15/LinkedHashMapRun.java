package study15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapRun {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(2, "홍길동");
		lmap.put(4, "김유신");
		lmap.put(3, "유관순");
		lmap.put(1, "이순신");
		System.out.println(lmap.size());
		System.out.println(lmap);
		
		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<>();
		lmap2.putAll(lmap);
		System.out.println(lmap2);
		
		lmap.putIfAbsent(5, "무지개");
		lmap.putIfAbsent(3, "무지개");
		System.out.println(lmap);
		
		//수정
		lmap.replace(3, "김구");
		lmap.replace(9, "김구");
		System.out.println(lmap);
		
		System.out.println(lmap.get(3));
		System.out.println(lmap.getOrDefault(100, "기본값"));
		
		Set<Map.Entry<Integer,String>> entrySet = lmap.entrySet();
		System.out.println(entrySet);
		
		Set<Integer> keyset = lmap.keySet();
		System.out.println(keyset);
		System.out.println(lmap.values());
	}
}
