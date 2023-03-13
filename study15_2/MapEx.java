package study15_2;

import java.util.*;
import java.util.Map.Entry;

public class MapEx {
	public static void main(String[] args) {
		//이름, 점수
		Map<String, Integer> map = new HashMap<>();
		//값 추가
		//"blue", 96
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("song", 92);
		String topName = "";
		int maxPoint = 0;
		int totalPoint = 0;
		
		//keySet
//		Set<String> sm = map.keySet();
//		Iterator<String> itr = sm.iterator();
//		while(itr.hasNext()) {
//			String name = itr.next();
//			int value = map.get(name);
//			totalPoint += value;
//			maxPoint = (maxPoint<value) ? value : maxPoint;
//			topName = (maxPoint<=value)? name:topName;		
//		}
		
		//entryset
		Entry<String, Integer> maxEntry = null;
		Set<Map.Entry<String, Integer>> sm1 = map.entrySet();
		Iterator<Entry<String, Integer>> itr1 = sm1.iterator();
		while(itr1.hasNext()) {
			Entry<String, Integer > en = itr1.next();
			//String name = en.getKey();
			//String point = en.getValue();
			totalPoint += en.getValue();
			if(maxEntry == null || en.getValue()>maxEntry.getValue()) {
				maxEntry = en;
			}
		}
		
		System.out.println(totalPoint);
		System.out.println("평균점수: "+ totalPoint/map.size());
		System.out.println("최고점수: "+maxEntry.getValue());
		System.out.println("최고득점자: "+maxEntry.getKey());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
